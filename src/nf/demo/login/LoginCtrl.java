package nf.demo.login;

import com.frm.mvc.BaseCtrl;
import com.frm.proto.PDTO;
import com.frm.proto.PID;

public class LoginCtrl extends BaseCtrl{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		this.view = new LoginView();
		this.model = new LoginModel();
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
