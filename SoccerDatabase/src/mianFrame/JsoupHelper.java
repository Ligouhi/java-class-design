package mianFrame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//接口为feacth map 返回值为 url title date 为字符串数组
public class JsoupHelper {
    
    public static Object fecthNode(String url, String xpath) throws Exception {
        String html = null;
        try {
            Connection connect = Jsoup.connect(url);
            html = connect.get().body().html();
//            System.out.println(html);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        
        HtmlCleaner hc = new HtmlCleaner();
        TagNode tn = hc.clean(html);
        Document dom = new DomSerializer(new CleanerProperties()).createDOM(tn);
        XPath xPath = XPathFactory.newInstance().newXPath();
        
        Object result = xPath.evaluate(xpath, dom, XPathConstants.NODESET);
//        System.out.println("result:"+result.toString());
        return result;
    }
   
//     *获取xpath下的a标签的文本值及href属性值
    
public static String[][] fecthByMap() throws Exception {
    Map<String, String> nodeMap = new LinkedHashMap<>();
    String url = "http://worldcup.cctv.com/2018/news/";
    String xpath = "//*[@id=\"SUBD1524792907902812\"]/script";
    Object result = fecthNode(url, xpath);
    String [][] news = new String[30][3]; //url,title,date
    String[]  tmp= new String[30];
    if (result instanceof NodeList) {
        NodeList nodeList = (NodeList) result;
        
        
            Node node = nodeList.item(0);
        
            nodeMap.put(node.getTextContent(), node.getAttributes().getNamedItem("href")!=null ? 
                    node.getAttributes().getNamedItem("href").getTextContent() : "");
            
            String s = node.getTextContent();
            String pattern = "\\{.*?\\}";
            
            // 创建 Pattern 对象
            Pattern r = Pattern.compile(pattern);
       
            // 现在创建 matcher 对象
            Matcher m = r.matcher(s);
            
           
            
            for(int i =0;i<30;i++)
            {    m.find();
            	tmp[i] = m.group(0);
            	news[i] = tmp[i].split(",");
            	news[i][0]=news[i][0].substring(8).replace("\""," " ).trim();
            	news[i][1]=news[i][1].substring(9).replace("\""," " ).trim();
            	news[i][2]=news[i][2].substring(7, news[i][2].length()-1).replace("\""," " ).trim();
            	
            	
            }
        }
    
    else {
    	System.out.println("not nodelist!");
    }
    
    return news;
}}
///**
// *获取xpath下的某个属性值
///**
//public static List<String> fecthAttr(String url, String xpath, String attr) throws Exception {
//    List<String> list = new ArrayList<>();
//    
//    Object result = fecthNode(url, xpath);
//    
//    if (result instanceof NodeList) {
//        NodeList nodeList = (NodeList) result;
//        
//        for (int i = 0; i < nodeList.getLength(); i++) {
//            Node node = nodeList.item(i);
//            if(node == null){
//                continue;
//            }
//            list.add(node.getAttributes().getNamedItem(attr).getTextContent());
//            
//            System.out.println(node.getTextContent() + " : " + node.getAttributes().getNamedItem("href"));
//        }
//    }
//    
//    return list;
//}
//public static void main(String[] args) throws Exception{
//    String news[][] = fecthByMap("http://worldcup.cctv.com/2018/news/","//*[@id=\"SUBD1524792907902812\"]/script");
//    for(int i=0;i<3;i++)
//    {
//    	System.out.println(news[i][0]);
//    	System.out.println(news[i][1]);
//    	System.out.println(news[i][2]);
//    	
//    }
//}



