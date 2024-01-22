import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class HesapMakinesi extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	private int operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String txt) {
		input.setText(input.getText() + txt);
	}
	
	public void calculate() {
		switch(operator) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		}
	}
	

	/**
	 * Create the frame.
	 */
	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 366, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Arial Black", Font.BOLD, 23));
		input.setBounds(0, 23, 366, 31);
		panel.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 366, 14);
		panel.add(lbl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 82, 366, 296);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_3);
		
		JButton btntopla = new JButton("+");
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
			}
		});
		btntopla.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btntopla);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_6);
		
		JButton btncikar = new JButton("-");
		btncikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btncikar.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btncikar);
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnNewButton_7);
		
		JButton btncarp = new JButton("x");
		btncarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btncarp.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btncarp);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btn0);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnequal.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnequal);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnC);
		
		JButton btnbul = new JButton("%");
		btnbul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operator = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnbul.setFont(new Font("Arial Black", Font.BOLD, 23));
		panel_1.add(btnbul);
	}
}
