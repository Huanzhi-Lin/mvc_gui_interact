package nf.demo.zmain;

import com.frm.mvc.MVC;

import nf.demo.login.LoginCtrl;

public class Main {
	
	/**
	 * 构造函数
	 * @param args
	 */
	public Main() {
		MVC.openModule(LoginCtrl.class); //step2. 实例化Controller、Model、View，然后呈现的是View。
	}
	
	/**
	 * 程序入口方法
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main(); //step1.调用构造函数 
	}

}
