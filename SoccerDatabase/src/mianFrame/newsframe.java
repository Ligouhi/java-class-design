package mianFrame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

import java.awt.GridLayout;

public class newsframe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newsframe window = new newsframe();
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
	public newsframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhdn\\Pictures\\Camera Roll\\bj0.jpg"));
		frame.getContentPane().setLayout(null);
		ImageIcon img = new ImageIcon("C:/Users/jhdn/Pictures/Camera Roll/bj6.jpg");
		img.setImage(img.getImage().getScaledInstance(916,574,Image.SCALE_DEFAULT));
		JLabel bgp=new JLabel(img);
		bgp.setBounds(0, 27, 798, 518);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 735, 29);
		frame.getContentPane().add(menuBar);
		
		JButton button = new JButton("\u8D5B\u4E8B\u67E5\u8BE2");
		menuBar.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainf jifen = new mainf();
				jifen.main(null);
			}});
		
		JButton button_1 = new JButton("\u8D5B\u4E8B\u9884\u544A");
		menuBar.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Cmpframe jifen = new Cmpframe();
				jifen.main(null);
			}});
		
		JButton button_2 = new JButton("赛事新闻");
		menuBar.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newsframe jifen = new newsframe();
				jifen.main(null);
			}});
		
		JButton button_3 = new JButton("积分榜");
		menuBar.add(button_3);
	
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				jifenframe jifen = new jifenframe();
				jifen.main(null);
			}});
		
		JLabel label = new JLabel("xxx,\u6B22\u8FCE\u4F7F\u7528\u672C\u7CFB\u7EDF\uFF01");
		menuBar.add(label);
		JsoupHelper jh = new JsoupHelper();
		String[][] content=null;
		try {
			content = jh.fecthByMap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		JLabel label_1 = new JLabel("\u8FD1\u671F\u65B0\u95FB");
		label_1.setForeground(new Color(0, 255, 127));
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		label_1.setBounds(305, 86, 140, 51);
		frame.getContentPane().add(label_1);
		
		
		JPanel biaoti = new JPanel();
		biaoti.setBounds(43, 163, 370, 369);
		frame.getContentPane().add(biaoti);
		biaoti.setLayout(new GridLayout(0,1));
		
		JLabel xinwen = new JLabel("新闻标题");
		xinwen.setForeground(new Color(30, 144, 255));
		xinwen.setFont(new Font("微软雅黑", Font.BOLD, 20));
		biaoti.add(xinwen);
		
		JLabel time = new JLabel("发布时间");
		time.setForeground(new Color(30, 144, 255));
		time.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		
		JPanel shijian = new JPanel();
		shijian.setBounds(413, 163, 322, 369);
		frame.getContentPane().add(shijian);
		shijian.setLayout(new GridLayout(0,1));
	    shijian.add(time);
		for(int i =0;i<10;i++)
			{LinkLabel  s = new LinkLabel(content[i][1],content[i][0]);
			s.setForeground(new Color(255, 0, 0));
			biaoti.add(s);
			}
		
		for(int i =0;i<10;i++)
			{
			JLabel  s = new JLabel(content[i][2]);
			s.setForeground(new Color(255, 0, 0));
			shijian.add(s);
			}
	 
        frame.getContentPane().add(bgp);
	}
}
