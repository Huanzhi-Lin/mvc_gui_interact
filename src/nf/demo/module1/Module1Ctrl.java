package nf.demo.module1;

import com.frm.mvc.BaseCtrl;
import com.frm.proto.PDTO;
import com.frm.proto.PID;

public class Module1Ctrl extends BaseCtrl{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.view = new Module1View();
		this.model = new Module1Model();
	}

	@Override
	public PID[] registerPIDList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateModel(PDTO pdto) {
		// TODO Auto-generated method stub
		this.model.updateDt(pdto);
	}

	@Override
	public void updateView(PDTO pdto) {
		// TODO Auto-generated method stub
		this.view.updateView(pdto);
	}

}
