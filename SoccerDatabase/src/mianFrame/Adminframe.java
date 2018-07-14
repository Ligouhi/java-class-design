package mianFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Adminframe {

	private JFrame frmAdminsistorFrame;
	private JTextField xinmingg;
	private JTextField textField_1;
	private JTextField userid;
	private JTextField password;
	private JTextField uid;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminframe window = new Adminframe();
					window.frmAdminsistorFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Adminframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frmAdminsistorFrame = new JFrame();
		frmAdminsistorFrame.setTitle("Adminsistor Frame");
		frmAdminsistorFrame.setBounds(100, 100, 758, 560);
		frmAdminsistorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminsistorFrame.getContentPane().setLayout(null);
	
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 740, 26);
		frmAdminsistorFrame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("users");
		menuBar.add(mnNewMenu);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("change password");
		rdbtnmntmNewRadioItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
			}
		});
		mnNewMenu.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("delete user");
		rdbtnmntmNewRadioItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu.add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("exit");
		rdbtnmntmNewRadioItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNewMenu.add(rdbtnmntmNewRadioItem_2);
		
		JMenu mnCompetition = new JMenu("competition");
		menuBar.add(mnCompetition);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_4 = new JRadioButtonMenuItem("change team info");
		
		mnCompetition.add(rdbtnmntmNewRadioItem_4);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_5 = new JRadioButtonMenuItem("change permeter info");
		
		mnCompetition.add(rdbtnmntmNewRadioItem_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 26, 740, 474);
		frmAdminsistorFrame.getContentPane().add(panel);
		CardLayout c = new CardLayout(0, 0);
		panel.setLayout(c);
		
		JPanel Permeter = new JPanel();
		Permeter.setBounds(14, 31, 712, 426);
		frmAdminsistorFrame.getContentPane().add(Permeter);
		Permeter.setLayout(null);
		
		
		JLabel xinming = new JLabel("\u7403\u5458\u59D3\u540D\uFF1A");
		xinming.setBounds(49, 108, 103, 26);
		Permeter.add(xinming);
		
		JLabel jinqiushu = new JLabel("\u8FDB\u7403\u6570\uFF1A");
		jinqiushu.setBounds(49, 187, 103, 26);
		Permeter.add(jinqiushu);
		
		xinmingg = new JTextField();
		xinmingg.setBounds(320, 108, 184, 26);
		Permeter.add(xinmingg);
		xinmingg.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(320, 187, 184, 26);
		Permeter.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("\u66F4\u65B0");
		btnNewButton.setBounds(258, 260, 135, 47);
		Permeter.add(btnNewButton);
		
		JPanel user_password = new JPanel();
		user_password.setBounds(0, 40, 740, 434);
		frmAdminsistorFrame.getContentPane().add(user_password);
		user_password.setLayout(null);
		
		JLabel usernaem = new JLabel("\u9700\u8981\u4FEE\u6539\u7684\u7528\u6237\u540D\uFF1A");
		usernaem.setBounds(42, 85, 170, 46);
		user_password.add(usernaem);
		
		userid = new JTextField();
		userid.setBounds(334, 85, 353, 46);
		user_password.add(userid);
		userid.setColumns(10);
		
		JLabel mima = new JLabel("\u6539\u540E\u5BC6\u7801");
		mima.setBounds(42, 167, 170, 46);
		user_password.add(mima);
		
		password = new JTextField();
		password.setBounds(334, 161, 353, 46);
		user_password.add(password);
		password.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4");
		btnNewButton_1.setBounds(281, 328, 200, 46);
		user_password.add(btnNewButton_1);
		
		JPanel delete = new JPanel();
		delete.setBounds(24, 39, 702, 450);
		frmAdminsistorFrame.getContentPane().add(delete);
		delete.setLayout(null);
		
		JLabel dname = new JLabel("\u60F3\u5220\u9664\u7684\u7528\u6237\u540D\uFF1A");
		dname.setBounds(68, 91, 130, 46);
		delete.add(dname);
		
		uid = new JTextField();
		uid.setBounds(228, 91, 350, 46);
		delete.add(uid);
		uid.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("\u786E\u8BA4");
		btnNewButton_2.setBounds(230, 298, 196, 51);
		delete.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = uid.getText();
				
				DeleteDB delete = new DeleteDB();
				delete.delete("Users", "Uname = "+name);
				JOptionPane.showMessageDialog(null, "更新成功！","信息确认", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userid.getText();
				String passwords = password.getText();
				UpdateDB update = new UpdateDB();
				boolean f = update.update("Users", "Upassword = "+passwords, "UID = "+"'"+id+"'");
			
				if(f)
					JOptionPane.showMessageDialog(null, "更新成功！","信息确认", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "没有找到该项！","更新失败", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = xinmingg.getText();
				String num = textField_1.getText();
				UpdateDB update = new UpdateDB();
				boolean f = update.update("Permeter", "Pgoal = "+num, "Pname = "+"'"+name+"'");
				if(f)
				JOptionPane.showMessageDialog(null, "更新成功！","信息确认", JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "没有找到该项！","更新失败", JOptionPane.WARNING_MESSAGE);
			}
		});
		Selectdb select = new Selectdb();
//		ResultSet re0 = select.select("select * from Permeter ");
//    	String[] columnNames0 = new String[] {"球员编号 ", "球员姓名","所属球队", "担任位置","累计进球",  "队服号码" };
//    	try {
//    	re0.last();
//	    int row = re0.getRow();
//	    re0.beforeFirst();
//    	String[][] QY0 = new String[row][6];
//    
//			if(re0.next()){
//			int j=0;
//			for(int i=0;i<6;i++)
//			 QY0[j][i] = re0.getString(i+1);		
//			 j++;
//			while(re0.next()){
//				for(int i=0;i<6;i++)
//					 QY0[j][i] = re0.getString(i+1);
//				 j++;
//			}
//			 JTable t1 = new JTable(QY0, columnNames0);
//			 
//		JScrollPane scrollPane = new JScrollPane(t1);
//		panel.add(scrollPane, "Permeter");
//			  }
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
		
		ResultSet re = select.select("select * from Tinfer");
	
    	String[] columnNames = new String[] {"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救","抢断","犯规","越位","传球","控球率","黄牌","红牌","角球" };
	     
    	try {
    	
    	    String[][] QY = new String[32][15];
			if(re.next()){
			 int j=0;
			for(int i=0;i<15;i++)
			 QY[j][i] = re.getString(i+1);		
			 j++;
			while(re.next()){
				for(int i=0;i<15;i++)
					 QY[j][i] = re.getString(i+1);
				 j++;
			}
			DefaultTableModel Tmodel = new DefaultTableModel(QY,columnNames){
				public boolean isCellEditable(int row,int column){

				return true;  

				}

				}; 	
			 JTable t2 = new JTable(Tmodel);
			 t2.setModel(Tmodel);
			 ListSelectionModel model = t2.getSelectionModel();
			 model.addListSelectionListener(new ListSelectionListener() {
			 public void valueChanged(ListSelectionEvent e) {
			        //事件处理代码
				 int row = e.getFirstIndex();
//				"球队编号 ", "球队名称","比赛场数", "进球数","失球数","助攻","扑救","抢断","犯规","越位","传球","控球率","黄牌","红牌","角球" 
				 String count = t2.getValueAt(row, 2).toString();
				 String countw = t2.getValueAt(row, 3).toString();
				 String countp = t2.getValueAt(row, 4).toString();
				 String countf = t2.getValueAt(row, 5).toString();
				 String countj = t2.getValueAt(row, 6).toString();
				 String counts = t2.getValueAt(row, 7).toString();
				 String countjf = t2.getValueAt(row, 8).toString();
				 String count10 = t2.getValueAt(row, 9).toString();
				 String count11 = t2.getValueAt(row, 10).toString();
				 String count12 = t2.getValueAt(row, 11).toString();
				 String count13 = t2.getValueAt(row, 12).toString();
				 String count14 = t2.getValueAt(row, 13).toString();
				 String count15 = t2.getValueAt(row, 14).toString();
			      UpdateDB update = new UpdateDB();
			     update.update("Tinfer", "Tcs = "+count+" ,Goals = "+countw+" ,Loss_goal = "+countp+" ,Zg = "+countf+" ,Pj = "+countj+" ,Qd = "+counts+" ,Fg = "+countjf+" ,Yw ="+count10+" ,Cq ="+count11+" ,Kqrate ="+count12+" ,Yellow ="+count13+" ,Red = "+count14+" ,Jq = "+count15," Tname = "+"'"+t2.getValueAt(row, 1).toString()+"'");
			      
			 }

			 });

			 //设置只能选中单行
			 t2.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

			 
		JScrollPane scrollPane_1 = new JScrollPane(t2);
		panel.add(scrollPane_1, "Tinfer");
			  }
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        panel.setVisible(false);
		Permeter.setVisible(false);
		user_password.setVisible(false);
		delete.setVisible(false);
		
        rdbtnmntmNewRadioItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.setVisible(false);
				user_password.setVisible(false);
				Permeter.setVisible(false);
				panel.setVisible(true);
				c.show(panel, "Tinfer");
			}
		});
        
        rdbtnmntmNewRadioItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.setVisible(false);
				user_password.setVisible(false);
				panel.setVisible(false);
				Permeter.setVisible(true);
			}
		});
        rdbtnmntmNewRadioItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.setVisible(false);
				user_password.setVisible(true);
				panel.setVisible(false);
				Permeter.setVisible(false);
			}
		});
        rdbtnmntmNewRadioItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete.setVisible(true);
				user_password.setVisible(false);
				panel.setVisible(false);
				Permeter.setVisible(false);
			}
		});
        rdbtnmntmNewRadioItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdminsistorFrame.dispose();
			}
		});
	}
    	}
