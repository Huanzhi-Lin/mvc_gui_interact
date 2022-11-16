package nf.demo.module2;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.frm.mvc.BaseView;
import com.frm.proto.PDTO;
import com.frm.proto.PID;

import nf.demo.proto.pdtos.PDTO_TransferData;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Module2View extends BaseView{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module2View window = new Module2View();
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
	public Module2View() {
		initialize();
	}
	
	JTextArea textArea;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("哪里设置标题2");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("这里是界面2");
		lblNewLabel.setBounds(10, 10, 176, 20);
		frame.getContentPane().add(lblNewLabel);
		
//		JTextArea textArea = new JTextArea();
		textArea = new JTextArea();
		
		textArea.setBounds(20, 40, 388, 189);
		frame.getContentPane().add(textArea);
	}

	@Override
	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	@Override
	public void updateView(PDTO pdto) {
		// TODO Auto-generated method stub
		PID pId = pdto.getPId();
		switch (pId) {
		case MODULE1_INFO_TO_MODULE2:
			this.textArea.setText( ((PDTO_TransferData)pdto).msg );
			break;
		default:
//			unHandleMsg();
			break;
		}
	}

	@Override
	protected void mClose() {
		// TODO Auto-generated method stub
		frame.dispose();
	}
}
