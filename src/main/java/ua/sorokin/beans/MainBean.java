package ua.sorokin.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import ua.sorokin.model.Osago;
import ua.sorokin.model.OsagoDTO;
import ua.sorokin.service.OsagoCalc;

@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Osago osago = new Osago();
	private OsagoDTO osagoDTO = new OsagoDTO();
	private OsagoCalc osagoCalc = new OsagoCalc();

	private String resultMessage = "";
	
	public String getResultMessage(){
		return resultMessage;
	}
	
	public void setResultMessage(String resultMessage){
		this.resultMessage = resultMessage;
	}
	
	public Osago getOsago(){
		return osago;
	}
	
	public OsagoDTO getOsagoDTO(){
		return osagoDTO;
	}

	public void listener(AjaxBehaviorEvent event) {
		String key = (String)event.getComponent().getAttributes().get("id");
		double value = (Double.parseDouble((String) event.getComponent().getAttributes().get("value")));
		
		switch (key){
		case "k1":
			osagoDTO.setK1(value);
			break;
		case "k2":
			osagoDTO.setK2(value);
			break;
		case "k3":
			osagoDTO.setK3(value);
			break;
		case "k4":
			osagoDTO.setK4(value);
			break;
		case "k5":
			osagoDTO.setK5(value);
			break;
		case "k6":
			osagoDTO.setK6(value);
			break;
		case "k7":
			osagoDTO.setK7(value);
			break;
		case "kBM":
			osagoDTO.setkBM(value);
			break;
		case "kPark":
			osagoDTO.setkPark(value);
			break;
		case "kPrivileges":
			osagoDTO.setkPrivileges(value);
			break;

		default: break;
		}
		
		osagoDTO = osagoCalc.calculate(osagoDTO);
		setResultMessage(String.valueOf(osagoDTO.getResult()));
    }
}
