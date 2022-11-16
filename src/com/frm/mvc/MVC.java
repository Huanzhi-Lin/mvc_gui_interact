package com.frm.mvc;

import com.frm.proto.PDTO;
import com.frm.proto.PdtoDispatch;

/**
 * @author LinHuanZhi
 * @time 2021年12月18日
 * @email lhz034069@163.com
 * @description 
 */
public class MVC {
	
	/**
	 * @param <T>
	 * @param clz
	 * @return
	 * @description 打开模块
	 */
	public static <T extends BaseCtrl> T openModule(Class<T> clz){
		return CCenter.c.openCtrl(clz);
	}
	public static <T extends BaseCtrl> T openModule(Class<T> clz, IModelArgsExt args){
		return CCenter.c.openCtrl(clz, args);
	}
	
	/**
	 * 
	 * @description 关闭模块
	 */
	public static <T extends BaseCtrl> void closeModule(Class<T> clz){
		CCenter.c.closeCtrl(clz);
	}
	
	
	/**
	 * 
	 * @description 仅关闭模块的View界面，保留model
	 */
	public static <T extends BaseCtrl> void closeView(Class<T> clz) {
		CCenter.c.closeView(clz);
	}
	
	
	/**
	 * @param <T>
	 * @param clz
	 * @return
	 * @description 得到model
	 */
	@SuppressWarnings("unchecked")
	public static <T extends BaseCtrl, E extends BaseModel> E getModel(Class<T> clz, Class<E> e) {
		return (E) CCenter.getModel(clz);
	}
	/**
	 * @param clz
	 * @return
	 * @description 得到ctrl
	 */
	@SuppressWarnings("unchecked")
	public static <T extends BaseCtrl> T getCtrl(Class<T> clz) {
		return (T) CCenter.getCtrl(clz);
	}
	/**
	 * 派发消息
	 * @param pdto
	 */
	public static void dispatch(PDTO pdto) {
		PdtoDispatch.p.dispatch(pdto);
	}
}
