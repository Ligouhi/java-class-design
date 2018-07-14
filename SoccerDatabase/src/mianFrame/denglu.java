package mianFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class denglu extends JDialog {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			denglu dialog = new denglu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public denglu() {
		setBounds(100, 100, 846, 756);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 823, 505);
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("\u7528\u6237\u540D:");
				label.setBounds(291, 215, 53, 18);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setBounds(410, 212, 155, 24);
				textField.setColumns(10);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("\u5BC6\u7801:");
				label.setBounds(291, 276, 38, 18);
				panel.add(label);
			}
			{
				passwordField = new JPasswordField();
				passwordField.setBounds(410, 273, 155, 24);
				passwordField.setColumns(10);
				panel.add(passwordField);
			}
			{
				JButton button = new JButton("\u767B\u5F55");
				button.setBounds(389, 439, 63, 27);
				panel.add(button);
			}
			{
				JButton button = new JButton("\u9000\u51FA");
				button.setBounds(531, 439, 63, 27);
				panel.add(button);
			}
			{
				JButton button = new JButton("\u6CE8\u518C");
				button.setBounds(263, 439, 63, 27);
				panel.add(button);
			}
			{
				JLabel label = new JLabel("\u8DB3\u7403\u8D5B\u4E8B\u67E5\u8BE2\u7CFB\u7EDF");
				label.setBounds(277, 78, 272, 45);
				label.setVerticalAlignment(SwingConstants.TOP);
				label.setForeground(new Color(0, 100, 0));
				label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 34));
				panel.add(label);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 503, 830, 262);
				panel_1.setLayout(null);
				panel_1.setToolTipText("\u6CE8\u518C");
				panel_1.setBorder(new TitledBorder(null, "\u6CE8\u518C\u7528\u6237", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel.add(panel_1);
				{
					JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
					label.setBounds(246, 84, 83, 18);
					panel_1.add(label);
				}
				{
					JLabel label = new JLabel("\u5BC6 \u7801\uFF1A");
					label.setBounds(246, 115, 55, 18);
					panel_1.add(label);
				}
				{
					JLabel label = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
					label.setBounds(246, 145, 93, 18);
					panel_1.add(label);
				}
				{
					textField_1 = new JTextField();
					textField_1.setColumns(10);
					textField_1.setBounds(420, 81, 217, 25);
					panel_1.add(textField_1);
				}
				{
					textField_2 = new JTextField();
					textField_2.setColumns(10);
					textField_2.setBounds(420, 112, 217, 25);
					panel_1.add(textField_2);
				}
				{
					textField_3 = new JTextField();
					textField_3.setColumns(10);
					textField_3.setBounds(420, 142, 217, 25);
					panel_1.add(textField_3);
				}
				{
					JButton button = new JButton("\u53D6 \u6D88");
					button.setBounds(506, 206, 83, 27);
					panel_1.add(button);
				}
				{
					JButton button = new JButton("\u786E \u8BA4");
					button.setBounds(246, 206, 83, 27);
					panel_1.add(button);
				}
			}
		}
	}

}
