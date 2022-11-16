package com.frm.mvc;

//import com.frm.cnet.CSocketMgr;
import com.frm.proto.PDTO;
import com.frm.proto.PDTO_Empty;
import com.frm.proto.PID;

/**
 * @author LinHuanZhi
 * @time 2021年12月16日
 * @email lhz034069@163.com
 * @description 
 */
public class BaseMVCCom {

	/**
	 * @param pdto 发包
	 */
	protected void sendPack(PID pId, PDTO pdto) {
//		CSocketMgr.cs.send(pId, pdto);
	}
	/**
	 * @param pdto 发消息
	 */
	protected void sendMsg(PID pId, PDTO pdto) {
		pdto.setPId(pId);
		MVC.dispatch(pdto);
	}
	protected void sendMsg(PID pId) {
		this.sendMsg(pId, new PDTO_Empty());
	}

	public void unHandleMsg() {
		System.err.println("未找到匹配MSG_ID");
	}
}
