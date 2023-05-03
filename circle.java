import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class circle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField l;
	private JTextField rr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circle frame = new circle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public circle() {
		setForeground(new Color(248, 248, 255));
		setBackground(new Color(178, 34, 34));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(178, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area  of cirle");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(210, 69, 189, 57);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(423, 108, -30, 4);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a redius");
		lblNewLabel_1.setForeground(new Color(123, 104, 238));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(68, 149, 264, 63);
		contentPane.add(lblNewLabel_1);
		
		l = new JTextField();
		l.setFont(new Font("Tahoma", Font.PLAIN, 28));
		l.setBounds(342, 154, 177, 43);
		contentPane.add(l);
		l.setColumns(10);
		
		JButton btnNewButton = new JButton("To find  area of circle");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				float area;
				int a=	Integer.valueOf(l.getText());
				
				area=3.14f*a*a;
				String hh=String.valueOf(area);
				rr.setText(hh);
			}
		});
		btnNewButton.setForeground(new Color(147, 112, 219));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(175, 253, 307, 35);
		contentPane.add(btnNewButton);
		
		rr = new JTextField();
		rr.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rr.setColumns(10);
		rr.setBounds(97, 313, 483, 43);
		contentPane.add(rr);
	}

}
