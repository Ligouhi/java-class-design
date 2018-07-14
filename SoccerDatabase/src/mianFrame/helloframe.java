package mianFrame;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.border.TitledBorder;

import java.awt.Window.Type;
import java.sql.ResultSet;
import java.sql.SQLException;


public class helloframe extends JDialog{

	private JFrame frame;
	private static final int DIALOG_HEIGHT=574;
	private final JPanel contentpanel = new JPanel();
	private JTextField zhanghao;
	private JPasswordField mima;
	private JTextField zhucezhanghao;
	private JTextField zhucemima;
	private JTextField querenmima;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloframe window = new helloframe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public helloframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhdn\\Pictures\\Camera Roll\\1f178a82b9014a90730008f2ad773912b31bee47.jpg"));
		frame.setTitle("\u8D5B\u4E8B\u67E5\u8BE2-\u767B\u5F55");
		frame.setBounds(100, 100, 916, 574);
		frame.getContentPane().setLayout(null);
		ImageIcon img = new ImageIcon("C:/Users/jhdn/Pictures/Camera Roll/bg8.jpg");
		img.setImage(img.getImage().getScaledInstance(916,574,Image.SCALE_DEFAULT));
		JLabel bgp=new JLabel(img);
		JLabel bgp1=new JLabel(img);
		bgp1.setForeground(new Color(102, 204, 255));
		bgp.setBounds(0, 0, 856, 545);
		bgp1.setBounds(0, 0, 898, 531);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 544, 856, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setToolTipText("\u6CE8\u518C");
		panel.setBorder(new TitledBorder(null, "\u6CE8\u518C\u7528\u6237", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setBounds(246, 84, 83, 18);
		panel.add(label);
		
		JLabel label_2 = new JLabel("\u5BC6 \u7801\uFF1A");
		label_2.setBounds(246, 115, 55, 18);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label_3.setBounds(246, 145, 93, 18);
		panel.add(label_3);
		
		zhucezhanghao = new JTextField();
		zhucezhanghao.setColumns(10);
		zhucezhanghao.setBounds(420, 81, 217, 25);
		panel.add(zhucezhanghao);
		
		zhucemima = new JPasswordField();
		zhucemima.setColumns(10);
		zhucemima.setBounds(420, 112, 217, 25);
		panel.add(zhucemima);
		
		querenmima = new JPasswordField();
		querenmima.setColumns(10);
		querenmima.setBounds(420, 142, 217, 25);
		panel.add(querenmima);
		
		JButton quxiao = new JButton("\u53D6 \u6D88");
		quxiao.setBounds(506, 206, 83, 27);
		panel.add(quxiao);
		
		JButton queren = new JButton("\u786E \u8BA4");
		queren.setBounds(246, 206, 83, 27);
		panel.add(queren);
		queren.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
				InsertDB insert = new InsertDB();
				String admin=zhucezhanghao.getText();  
		        String password= zhucemima.getText();  
		        String password2=querenmima.getText();  
		        String values = "("+"'"+admin+"'"+","+"'"+password+"'"+")";
		        System.out.println(values);
		        if(!password.equals(password2)){
		        	JOptionPane.showMessageDialog(null, "两次输入密码不一致！","信息确认", JOptionPane.WARNING_MESSAGE);
		        }
		        else if(insert.insert("Users", values)){
		        	JOptionPane.showMessageDialog(null, "注册成功！","信息确认", JOptionPane.INFORMATION_MESSAGE);
		        }
		        else{
		        	JOptionPane.showMessageDialog(null, "用户名已存在！","信息确认", JOptionPane.INFORMATION_MESSAGE);
		        }
		      
			}
		});
		contentpanel.setBounds(0, 0, 898, 531);
		frame.getContentPane().add(contentpanel);
		contentpanel.setLayout(null);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D:");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(263, 212, 81, 21);
		contentpanel.add(label_1);
		
		zhanghao = new JTextField();
		zhanghao.setBounds(410, 212, 155, 24);
		zhanghao.setColumns(10);
		contentpanel.add(zhanghao);
		
		JLabel label_4 = new JLabel("\u5BC6\u7801:");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_4.setBounds(263, 273, 81, 21);
		contentpanel.add(label_4);
		
		mima = new JPasswordField();
		mima.setBounds(410, 273, 155, 24);
		mima.setColumns(10);
		contentpanel.add(mima);
		
		JButton denglu = new JButton("\u767B\u5F55");
		denglu.setBounds(389, 439, 63, 27);
		contentpanel.add(denglu);
		denglu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Selectdb select = new Selectdb();
				
				String admin=zhanghao.getText();  
		        char[] password=mima.getPassword();  
		        String str = String.valueOf(password); //将char数组转化为string类型  
		        ResultSet qr = select.select("Users", "Upassword", "UIDs = "+"'"+admin+"'"); 
	            String queren = null;
		        
		          try {
		        	  while(qr.next()){
					queren = qr.getString("Upassword");}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
		        if(admin.equals("admin")&&str.equals("rtv5"))  
		        {  
		                 
		            System.out.println(admin);  
		            System.out.println(str);  
		            Adminframe ml=new Adminframe();
		            ml.main(null);             //为跳转的界面  
		            frame.dispose();//销毁当前界面  
		        }
		 
		        else if(str.equals(queren.trim())){
		        	mainf ml=new mainf();
		            ml.main(null);             //为跳转的界面  
		            frame.dispose();
		        }
		        else{
		        	JOptionPane.showMessageDialog(null,  "用户名或密码错误！","登录失败",JOptionPane.WARNING_MESSAGE);
		        }
			}
		});
		
		JButton tuichu = new JButton("\u9000\u51FA");
		tuichu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		tuichu.setBounds(531, 439, 63, 27);
		contentpanel.add(tuichu);
		
		JButton zhuce = new JButton("\u6CE8\u518C");
		zhuce.setBounds(263, 439, 63, 27);
		contentpanel.add(zhuce);
		zhuce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(frame.getHeight()==DIALOG_HEIGHT){
                	frame.setSize(frame.getWidth(),DIALOG_HEIGHT+panel.getHeight());
                }
                else{
                	frame.setSize(frame.getWidth(),DIALOG_HEIGHT);
                }
            }
        });
		
		JLabel label_5 = new JLabel("\u8DB3\u7403\u8D5B\u4E8B\u67E5\u8BE2\u7CFB\u7EDF");
		label_5.setBounds(277, 78, 272, 45);
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setForeground(new Color(0, 255, 0));
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 34));
		contentpanel.add(label_5);
		
		panel.setBackground(Color.ORANGE);
//		panel.add(bgp);
		contentpanel.add(bgp1);
	}
}
