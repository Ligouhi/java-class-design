package mianFrame;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class jifenframe {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JScrollPane  qy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jifenframe window = new jifenframe();
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
	public jifenframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(119, 136, 153));
		frame.setTitle("\u4E16\u754C\u676F\u79EF\u5206\u699C");
		frame.setBounds(100, 100, 816, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhdn\\Pictures\\Camera Roll\\bj0.jpg"));
//		frame.getContentPane().add(gezujifen);
		ImageIcon img = new ImageIcon("C:/Users/jhdn/Pictures/Camera Roll/bj5.jpg");
		img.setImage(img.getImage().getScaledInstance(916,574,Image.SCALE_DEFAULT));
		JLabel bgp=new JLabel(img);
		bgp.setBounds(0, 27, 798, 518);
		
		Selectdb select = new Selectdb();
		JButton btnA = new JButton("A\u7EC4");
		btnA.setBounds(37, 203, 65, 27);
		frame.getContentPane().add(btnA);
		btnA.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'A%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
            	try {
					if(re.next()){
					int j=0;
					for(int i=0;i<8;i++)
					 QY[j][i] = re.getString(i+1);	
					QY[j][8] = re.getString("Point");
					 j++;
					while(re.next()){
						for(int i=0;i<8;i++)
							 QY[j][i] = re.getString(i+1);
						QY[j][8] = re.getString("Point");
						 j++;
					}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		
		JButton btnB = new JButton("B\u7EC4");
		btnB.setBounds(126, 203, 65, 27);
		frame.getContentPane().add(btnB);
		btnB.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'B%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnC = new JButton("C\u7EC4");
		btnC.setBounds(217, 203, 65, 27);
		frame.getContentPane().add(btnC);
		btnC.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'C%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnD = new JButton("D\u7EC4");
		btnD.setBounds(307, 203, 65, 27);
		frame.getContentPane().add(btnD);
		btnD.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'D%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分"  };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnE = new JButton("E\u7EC4");
		btnE.setBounds(407, 203, 65, 27);
		frame.getContentPane().add(btnE);
		btnE.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'E%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分"  };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnF = new JButton("F\u7EC4");
		btnF.setBounds(500, 203, 65, 27);
		frame.getContentPane().add(btnF);
		btnF.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'F%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnG = new JButton("G\u7EC4");
		btnG.setBounds(600, 203, 65, 27);
		frame.getContentPane().add(btnG);
		btnG.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'G%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
		JButton btnH = new JButton("H\u7EC4");
		btnH.setBounds(702, 203, 65, 27);
		frame.getContentPane().add(btnH);
		btnH.addActionListener(new  ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ResultSet re = select.select("Tinfer ", " * ", " TNO like 'H%' ");
            	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救",  "抢断","积分" };
			     String[][] QY = new String[4][9];
			     try {
						if(re.next()){
						int j=0;
						for(int i=0;i<8;i++)
						 QY[j][i] = re.getString(i+1);	
						QY[j][8] = re.getString("Point");
						 j++;
						while(re.next()){
							for(int i=0;i<8;i++)
								 QY[j][i] = re.getString(i+1);
							QY[j][8] = re.getString("Point");
							 j++;
						}
					 JTable t2 = new JTable(QY, columnNames);
					 JScrollPane  qy = new JScrollPane(t2);
					  qy.setBounds(34, 330, 735, 90);
					  frame.getContentPane().add(qy);
					  }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
		});
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
		
		JButton button_2 = new JButton("\u8D5B\u4E8B\u65B0\u95FB");
		menuBar.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				newsframe jifen = new newsframe();
				jifen.main(null);
			}});
		
		JButton button_3 = new JButton("\u79EF\u5206\u699C");
		menuBar.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				jifenframe jifen = new jifenframe();
				jifen.main(null);
			}});
		
		JLabel label = new JLabel("xxx,\u6B22\u8FCE\u4F7F\u7528\u672C\u7CFB\u7EDF\uFF01");
		menuBar.add(label);
		
		
		
		JLabel lblNewLabel = new JLabel("\u5404\u7EC4\u79EF\u5206\u699C");
		lblNewLabel.setForeground(new Color(0, 255, 127));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 38));
		lblNewLabel.setBounds(286, 70, 209, 94);
		frame.getContentPane().add(lblNewLabel);
		
		
		frame.getContentPane().add(bgp);
		
	}
}
