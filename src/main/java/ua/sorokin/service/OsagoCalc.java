package ua.sorokin.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import ua.sorokin.model.OsagoDTO;

public class OsagoCalc {
	private final double K_BASE = 180.00;
	private OsagoDTO osagoDTO;
	
	public OsagoDTO calculate(OsagoDTO osagoDTO){
		this.osagoDTO = osagoDTO;
		if (osagoDTO.notNull()){
			osagoDTO.setResult(new BigDecimal((K_BASE*osagoDTO.getK1()*osagoDTO.getK2()*osagoDTO.getK3()
					*osagoDTO.getK4()*osagoDTO.getK5()*osagoDTO.getK6()*osagoDTO.getK7()*osagoDTO.getkBM()
					*osagoDTO.getkPark())/osagoDTO.getkPrivileges()).setScale(2, RoundingMode.HALF_EVEN).doubleValue());
		} else {
			osagoDTO.setResult(0.0);
		}
		return osagoDTO;
	}
}
