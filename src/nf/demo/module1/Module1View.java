package nf.demo.module1;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.frm.mvc.BaseView;
import com.frm.mvc.MVC;
import com.frm.proto.PDTO;
import com.frm.proto.PID;

import nf.demo.login.LoginCtrl;
import nf.demo.module2.Module2Ctrl;
import nf.demo.proto.pdtos.PDTO_TransferData;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Module1View extends BaseView{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module1View window = new Module1View();
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
	public Module1View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("哪里设置标题1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("这里是界面1");
		lblNewLabel.setBounds(10, 20, 201, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("打开界面2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MVC.openModule(Module2Ctrl.class);
//				MVC.closeModule(Module1Ctrl.class); //关闭本界面
			}
		});
		btnNewButton.setBounds(297, 16, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setText("可输入信息");
		textField.setBounds(23, 82, 305, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("发送消息到界面2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1、获取文本
				String s = textField.getText();
				//2、构造消息体
				PDTO_TransferData p = new PDTO_TransferData();
				p.msg = s;
				//3、发送消息（消息号+消息体）
				sendMsg(PID.MODULE1_INFO_TO_MODULE2, p);
			}
		});
		btnNewButton_1.setBounds(23, 156, 305, 23);
		frame.getContentPane().add(btnNewButton_1);
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
