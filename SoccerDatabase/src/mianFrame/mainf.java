package mianFrame;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Font;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mainf {

	private JFrame frame;
	private JTextField xinmingchaxun0;
	private JTextField xinmingchaxun1;
	private JTextField qiuduitext;
	private JTextField weizhitext;
	private JLabel qiuyuanxinming;
	private JButton chaxun2;
	private JLabel suoshuqiudui;
	private JLabel weizhi;
	private JButton btnNewButton;
	private JScrollPane qy0;
	private JScrollPane qy02;
	private JScrollPane qy111;
	private JScrollPane qy10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainf window = new mainf();
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
	public mainf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.setTitle("\u4E16\u754C\u676F\u8D44\u8BAF-\u9996\u9875");
		frame.setBounds(100, 100, 753, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhdn\\Pictures\\Camera Roll\\bj0.jpg"));
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton button = new JButton("\u4FE1\u606F\u67E5\u8BE2");
		menuBar.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainf jifen = new mainf();
				jifen.main(null);
			}});
		
		JButton button_3 = new JButton("\u8D5B\u4E8B\u9884\u544A");
		menuBar.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Cmpframe jifen = new Cmpframe();
				jifen.main(null);
			}});
		
		JButton button_1 = new JButton("赛事新闻");
		menuBar.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newsframe jifen = new newsframe();
				jifen.main(null);
			}});
		
		JButton button_2 = new JButton("积分榜");
		menuBar.add(button_2);
		button_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			jifenframe jifen = new jifenframe();
			jifen.main(null);
		}});
		
		
		JLabel lblNewLabel = new JLabel("xxx,\u6B22\u8FCE\u4F7F\u7528\u672C\u7CFB\u7EDF\uFF01");
		menuBar.add(lblNewLabel);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u8D5B\u4E8B\u4FE1\u606F\u67E5\u8BE2");
		lblNewLabel_2.setForeground(new Color(50, 205, 50));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\jhdn\\Pictures\\Camera Roll\\efd36b6510.jpg"));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel_2.setBounds(168, 38, 441, 78);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u9009\u62E9\u8981\u67E5\u8BE2\u7684\u9879\u76EE\uFF1A");
		lblNewLabel_1.setBounds(24, 145, 142, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		final DefaultComboBoxModel functionName = new DefaultComboBoxModel();
		functionName.addElement("球队");
		functionName.addElement("球员");
		
		JComboBox chaBox = new JComboBox(functionName);
		chaBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = chaBox.getSelectedIndex();
				Selectdb select = new Selectdb();
				
				if(i==0){
					if(chaxun2!=null)
					frame.getContentPane().remove(chaxun2);
					
					if(suoshuqiudui!=null){
						frame.getContentPane().remove(qiuyuanxinming);
						frame.getContentPane().remove(suoshuqiudui);
						frame.getContentPane().remove(weizhitext);
						
						frame.getContentPane().remove(weizhi);
						frame.getContentPane().remove(qiuduitext);
						frame.getContentPane().remove(xinmingchaxun1);
						
					}
					
					if(qy10!=null)
					{	
					frame.getContentPane().remove(qy10);
					
					}
					if(qy111!=null){
						frame.getContentPane().remove(qy111);
						
					}
					

				    qiuyuanxinming = new JLabel("输入查询球队所属国家:");
					qiuyuanxinming.setBounds(270, 151, 150, 18);
					frame.getContentPane().add(qiuyuanxinming);
					xinmingchaxun0 = new JTextField();
					
					xinmingchaxun0.setBounds(433, 148, 86, 24);
					frame.getContentPane().add(xinmingchaxun0);
					xinmingchaxun0.setColumns(10);
					frame.getContentPane().repaint();
				}
				if(i==1){
					
					if(qy0!=null){
					frame.getContentPane().remove(qy0);
					
					}
					if(qy111!=null){
						frame.getContentPane().remove(qy111);
					}
					if(qy02!=null){
						frame.getContentPane().remove(qy02);
					}
					if(qiuyuanxinming!=null){
					frame.getContentPane().remove(xinmingchaxun0);
					frame.getContentPane().remove(qiuyuanxinming);}
					
					if(btnNewButton!=null)
						frame.getContentPane().remove(btnNewButton);
					
					qiuyuanxinming = new JLabel("输入球员姓名:");
					qiuyuanxinming.setBounds(270, 151, 150, 18);
					frame.getContentPane().add(qiuyuanxinming);
					
					suoshuqiudui = new JLabel("\u6240\u5C5E\u7403\u961F");
					suoshuqiudui.setBounds(218, 207, 72, 18);
					frame.getContentPane().add(suoshuqiudui);
					
				    
					
					qiuduitext = new JTextField();
					qiuduitext.setBounds(304, 204, 86, 24);
					frame.getContentPane().add(qiuduitext);
					qiuduitext.setColumns(10);
					
				    weizhi = new JLabel("\u62C5\u4EFB\u4F4D\u7F6E");
					weizhi.setBounds(404, 207, 72, 18);
					frame.getContentPane().add(weizhi);
					
					weizhitext = new JTextField();
					weizhitext.setBounds(490, 204, 86, 24);
					frame.getContentPane().add(weizhitext);
					weizhitext.setColumns(10);
					
					xinmingchaxun1 = new JTextField();
					xinmingchaxun1.setBounds(433, 148, 86, 24);
					frame.getContentPane().add(xinmingchaxun1);
					xinmingchaxun1.setColumns(10);
						
						
//					chaxun2 = new JButton("查询");
					chaxun2.setBounds(587, 203, 113, 27);
					frame.getContentPane().add(chaxun2);
					
//					chaxun2.addActionListener(new ActionListener() {
//						public void actionPerformed(ActionEvent e) {
//					
//							String s1 = qiuduitext.getText();
//							String s2 = weizhitext.getText();
//							ResultSet res = select.select("Permeter", "*", "Pteam="+"'"+s1+"'"+" and "+"Pwz="+"'"+s2+"'"+";");
//
//							 String[] columnNames = new String[] {"球员编号 ", "球员姓名","  所属球队 ", "队服编号","担任位置",  "进球数" };
//						     String[][] QY = new String[9][6];
//						     int j = 0;
//						     try {
//								if(res.next()){
//									QY[j][0]=res.getString("PNO");
//									QY[j][1]=res.getString("Pname");
//									QY[j][2]=res.getString("Pteam");
//									QY[j][3]=res.getString("Pdf");
//									QY[j][4]=res.getString("Pwz");			
//									QY[j][5]= res.getString("Pgoal");
//								      j++;
//									while(res.next()){
//										QY[j][0]=res.getString("PNO");
//										QY[j][1]=res.getString("Pname");
//										QY[j][2]=res.getString("Pteam");
//										QY[j][3]=res.getString("Pdf");
//										QY[j][4]=res.getString("Pwz");			
//										QY[j][5]= res.getString("Pgoal");
//									   j++;
//									  
//							
//								 JTable t2 = new JTable(QY, columnNames);
//								  qy111 = new JScrollPane(t2);
//
//								  qy111.setBounds(31, 350, 679, 145);
//								  frame.getContentPane().add(qy111);
//								
//								  }
//								}else{
//									  JOptionPane.showMessageDialog(null, "没有找到此球员！请确认信息是否正确！","查询失败！", JOptionPane.WARNING_MESSAGE);
//								  }
//							} catch (HeadlessException | SQLException e1) {
//								// TODO Auto-generated catch block
//								e1.printStackTrace();
//							}
//						     
//					}});

					btnNewButton.setBounds(587, 147, 113, 27);
					frame.getContentPane().add(btnNewButton);
					frame.getContentPane().repaint();
				}
			}
		});
		chaBox.setSelectedIndex(0);
		chaBox.setBounds(168, 148, 66, 24);
		frame.getContentPane().add(chaBox);
		
		chaxun2 = new JButton("查询");
//		chaxun2.setBounds(587, 203, 113, 27);
//		frame.getContentPane().add(chaxun2);
		chaxun2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Selectdb select = new Selectdb();
				String s1 = qiuduitext.getText();
				String s2 = weizhitext.getText();
				ResultSet res = select.select("Permeter", "*", "Pteam="+"'"+s1+"'"+" and "+"Pwz="+"'"+s2+"'"+";");
				int i = chaBox.getSelectedIndex();
				if(i==1){
				 String[] columnNames = new String[] {"球员编号 ", "球员姓名","  所属球队 ", "队服编号","担任位置",  "进球数" };
			     String[][] QY = new String[9][6];
			     int j = 0;
			     try {
					if(res.next()){
						QY[j][0]=res.getString("PNO");
						QY[j][1]=res.getString("Pname");
						QY[j][2]=res.getString("Pteam");
						QY[j][3]=res.getString("Pdf");
						QY[j][4]=res.getString("Pwz");			
						QY[j][5]= res.getString("Pgoal");
					      j++;
						while(res.next()){
							QY[j][0]=res.getString("PNO");
							QY[j][1]=res.getString("Pname");
							QY[j][2]=res.getString("Pteam");
							QY[j][3]=res.getString("Pdf");
							QY[j][4]=res.getString("Pwz");			
							QY[j][5]= res.getString("Pgoal");
						   j++;
						}
				
					 JTable t2 = new JTable(QY, columnNames);
					  qy111 = new JScrollPane(t2);

					  qy111.setBounds(31, 350, 679, 145);
					  frame.getContentPane().add(qy111);
						
					  }
					else{
						  JOptionPane.showMessageDialog(null, "没有找到此球员！请确认信息是否正确！","查询失败！", JOptionPane.WARNING_MESSAGE);
					  }
				} catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}}
			     
		}});
		
	 btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectdb select = new Selectdb();
				int i = chaBox.getSelectedIndex();		
					if(i==0){
						String s =xinmingchaxun0.getText();
					ResultSet re1 = select.select("Team", "*", "Tname="+"'"+s+"'"+";");
					ResultSet re2 = select.select("Permeter", "*", "Pteam="+"'"+s+"'"+";");
					try {
						
						if(re1.next()){
						 String[] columnNames = new String[] {"编号 ", "小组","国家" };
						 String[][] QY = new String[1][3];
						 int j = 0;
						    QY[j][0]=re1.getString("TNO");
							QY[j][1]=re1.getString("Tgroup");
							QY[j][2]=re1.getString("Tname");
							j++;
//							while(re1.next()){
//								QY[j][0]=re1.getString("TNO");
//								QY[j][1]=re1.getString("Tgroup");
//								QY[j][2]=re1.getString("Tname");
////								QY[i][3]=re.getString("Pwz");
////								QY[i][4]= re.getString("Pgoal");
//							   j++;
//							  }				
						 JTable t1 = new JTable(QY, columnNames);
						  qy0 = new JScrollPane(t1);
						 qy0.setBounds(31, 200, 679, 60);
						  frame.getContentPane().add(qy0);}
						  if(re2.next()){
								 String[] columnNames2 = new String[] {"球员编号", "球员姓名",  "所属球队",  "队服编号","担任位置",  "进球数" };
								 String[][] QY2 = new String[23][6];
								   int j = 0;
								    QY2[j][0]=re2.getString("PNO");
									QY2[j][1]=re2.getString("Pname");
									QY2[j][2]=re2.getString("Pteam");
									QY2[j][3]=re2.getString("Pdf");
									QY2[j][4]=re2.getString("Pwz");
									QY2[j][5]= re2.getString("Pgoal");
								   j++;
									while(re2.next()){
										 QY2[j][0]=re2.getString("PNO");
											QY2[j][1]=re2.getString("Pname");
											QY2[j][2]=re2.getString("Pteam");
											QY2[j][3]=re2.getString("Pdf");
											QY2[j][4]=re2.getString("Pwz");
											QY2[j][5]= re2.getString("Pgoal");
									   j++;
									  }
								
								 JTable t2 = new JTable(QY2, columnNames2);
								  qy02 = new JScrollPane(t2);
								 qy02.setBounds(31, 267, 679, 240);
								  frame.getContentPane().add(qy02);  
						}
						else{
							JOptionPane.showMessageDialog(null, "没有找到此球队！请确认信息是否正确！","查询失败！", JOptionPane.WARNING_MESSAGE);
						}
					} catch (HeadlessException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}}
					else if(i==1){
						String s =xinmingchaxun1.getText();
						ResultSet re = select.select("Permeter", "*", "Pname="+"'"+s+"'"+";");
						
						try {
							
							if(re.next()){
							 String[] columnNames = new String[] {"球员编号", "球员姓名",  "所属球队",  "队服编号","担任位置",  "进球数" };
							 String[][] QY = new String[4][6];
							 int j = 0;
							    QY[j][0]=re.getString("PNO");
								QY[j][1]=re.getString("Pname");
								QY[j][2]=re.getString("Pteam");
								QY[j][3]=re.getString("Pdf");
								QY[j][4]=re.getString("Pwz");
								QY[j][5]= re.getString("Pgoal");
							   j++;
								while(re.next()){
									 QY[j][0]=re.getString("PNO");
										QY[j][1]=re.getString("Pname");
										QY[j][2]=re.getString("Pteam");
										QY[j][3]=re.getString("Pdf");
										QY[j][4]=re.getString("Pwz");
										QY[j][5]= re.getString("Pgoal");
								   j++;
								  }
							
							 JTable t = new JTable(QY, columnNames);
							  qy10 = new JScrollPane(t);
							 qy10.setBounds(31, 407, 679, 285);
							  frame.getContentPane().add(qy10);}
							else{
								JOptionPane.showMessageDialog(null, "没有找到此球员！请确认信息是否正确！","查询失败！", JOptionPane.WARNING_MESSAGE);
							}
						} catch (HeadlessException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				   
				   
			}
			
		});
		btnNewButton.setBounds(587, 147, 113, 27);
		frame.getContentPane().add(btnNewButton);
		
	
		
		

		
	
		
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
