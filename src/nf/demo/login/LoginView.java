package nf.demo.login;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.frm.mvc.BaseView;
import com.frm.mvc.MVC;
import com.frm.proto.PDTO;

import nf.demo.module1.Module1Ctrl;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends BaseView{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
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
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This is loginView.");
		lblNewLabel.setBounds(149, 75, 167, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("打开Module1，并关闭本界面");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MVC.openModule(Module1Ctrl.class);
				MVC.closeModule(LoginCtrl.class);
			}
		});
		btnNewButton_2.setBounds(74, 152, 279, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

	@Override
	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	@Override
	public void updateView(PDTO pdto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void mClose() {
		// TODO Auto-generated method stub
		frame.dispose();
	}
}
