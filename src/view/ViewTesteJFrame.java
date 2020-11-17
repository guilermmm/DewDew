package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ViewTesteJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtOpa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTesteJFrame frame = new ViewTesteJFrame();
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
	public ViewTesteJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\Artur\\Documents\\GitHub\\DewDew\\iconWhite.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOpaTudoBom = new JLabel("Opa tudo bom me diga seu nome c:");
		lblOpaTudoBom.setBounds(129, 138, 301, 14);
		contentPane.add(lblOpaTudoBom);
		
		txtOpa = new JTextField();
		txtOpa.setBounds(129, 163, 301, 20);
		contentPane.add(txtOpa);
		txtOpa.setColumns(10);
		
		JButton btnOpa = new JButton("Opa");
		btnOpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Oi, " + txtOpa.getText() + ", tudo bom?");				
			}
		});
		btnOpa.setBounds(240, 216, 89, 23);
		contentPane.add(btnOpa);
	}
}
