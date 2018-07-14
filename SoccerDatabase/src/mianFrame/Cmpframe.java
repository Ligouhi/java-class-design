package mianFrame;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class Cmpframe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cmpframe window = new Cmpframe();
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
	public Cmpframe() {
		initialize();
	}

class BackgroundPanel extends JPanel
{
	Image im;
	public BackgroundPanel(Image im)
	{
		this.im=im;
		this.setOpaque(true);
	}
	//Draw the back ground.
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);
		
	}
}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u8FD1\u671F\u8D5B\u4E8B");
		frame.setBounds(100, 100, 916, 574);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jhdn\\Pictures\\Camera Roll\\bj0.jpg"));
		
		
		//‘⁄’‚¿ÔÀÊ±„’““ª’≈400*300µƒ’’∆¨º»ø…“‘ø¥µΩ≤‚ ‘Ω·π˚°£
		ImageIcon img = new ImageIcon("C:/Users/jhdn/Pictures/Camera Roll/bj5.jpg");
		img.setImage(img.getImage().getScaledInstance(916,574,Image.SCALE_DEFAULT));
		JLabel bgp=new JLabel(img);
		bgp.setBounds(0, 27, 898, 500);
		
		
		
		Selectdb select = new Selectdb();
		
		JLabel lblNewLabel = new JLabel("\u8FD1\u671F\u8D5B\u4E8B");
		lblNewLabel.setForeground(new Color(0, 255, 127));
		lblNewLabel.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.BOLD, 30));
		lblNewLabel.setBounds(346, 54, 156, 64);
		frame.getContentPane().add(lblNewLabel);
		

	
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int ri = now.get(Calendar.DAY_OF_MONTH);
		
		DefaultListModel jintian = new DefaultListModel();
		ResultSet res = select.select("Competition", "Cdate,Cclock,T1name,T2name", "Cdate = "+"'"+Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(ri)+"'");
		String[][] today = new String[3][4];
		int j = 0;
		try {
			while(res.next()){
				today[j][0] = res.getString("Cdate");
				today[j][1] = res.getString("Cclock");
				today[j][2] = res.getString("T1name");
				today[j][3] = res.getString("T2name");
				jintian.addElement(today[j][0]+"    "+today[j][1]+"   "+today[j][2]+"   "+today[j][3]);
				j++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DefaultListModel ming = new DefaultListModel();
		
		res = select.select("Competition", "Cdate,Cclock,T1name,T2name", "Cdate = "+"'"+Integer.toString(year)+"/"+Integer.toString(month)+"/"+Integer.toString(ri+1)+"'");
		String[][] torrow = new String[3][4];
		j = 0;
		try {
			while(res.next()){
				torrow[j][0] = res.getString("Cdate");
				torrow[j][1] = res.getString("Cclock");
				torrow[j][2] = res.getString("T1name");
				torrow[j][3] = res.getString("T2name");
				
				ming.addElement(torrow[j][0]+"    "+torrow[j][1]+"    "+torrow[j][2]+"    "+torrow[j][3]);
				j++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JList list = new JList(jintian);
		list.setForeground(Color.RED);
		list.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		list.setBounds(228, 170, 613, 64);
		frame.getContentPane().add(list);
		
		
		
		JList list_1 = new JList(ming);
		list_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 20));
		list_1.setForeground(Color.RED);
		list_1.setBounds(228, 347, 613, 64);
		frame.getContentPane().add(list_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u4ECA\u5929");
		lblNewLabel_1.setForeground(new Color(127, 255, 212));
		lblNewLabel_1.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(102, 182, 72, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u660E\u5929");
		lblNewLabel_2.setForeground(new Color(127, 255, 212));
		lblNewLabel_2.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(102, 361, 72, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 898, 29);
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
		frame.getContentPane().add(bgp);
	}
}
