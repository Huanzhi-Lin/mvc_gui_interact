package nf.demo.module2;

import com.frm.mvc.BaseCtrl;
import com.frm.proto.PDTO;
import com.frm.proto.PID;

public class Module2Ctrl extends BaseCtrl{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.view = new Module2View();
		this.model = new Module2Model();
	}

	@Override
	public PID[] registerPIDList() {
		// TODO Auto-generated method stub
//		return null;
		PID[] pIdList = {
				PID.MODULE1_INFO_TO_MODULE2,
		};
		return pIdList;
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
