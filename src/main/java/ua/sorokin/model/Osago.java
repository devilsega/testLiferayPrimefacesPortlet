package ua.sorokin.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Osago {
	private Map<String,Double>k1 = new LinkedHashMap<>();
	private Map<String,Double>k2 = new LinkedHashMap<>();
	private Map<String,Double>k3 = new LinkedHashMap<>();
	private Map<String,Double>k4 = new LinkedHashMap<>();
	private Map<String,Double>k5 = new LinkedHashMap<>();
	private Map<String,Double>k6 = new LinkedHashMap<>();
	private Map<String,Double>k7 = new LinkedHashMap<>();
	private Map<String,Double>kBM = new LinkedHashMap<>();
	private Map<String,Double>kPark = new LinkedHashMap<>();
	private Map<String,Double>kPrivileges = new LinkedHashMap<>();
	
	public Osago(){
		k1.put("Легкові з об''ємом двигуна до 1600 куб.см", 1.00);
		k1.put("Легкові з об''ємом двигуна від 1601 до 2000 куб.см", 1.14);
		k1.put("Легкові з об''ємом двигуна від 2001 до 3000 куб.см", 1.18);
		k1.put("Легкові з об''ємом двигуна більше 3001 куб.см", 1.82);
		k1.put("Вантажний транспорт вантажопідйом. до 2-х тон", 2.00);
		k1.put("Вантажний транспорт вантажопідйом. більше 2-х тон", 2.18);
		k1.put("Автобуси з кільк. місць для сидіння до 20-ти чоловік", 2.55);
		k1.put("Автобуси з кільк. місць для сидіння більше 20-ти чоловік", 3.00);
		k1.put("Причепи до легкового транспорту", 0.34);
		k1.put("Причепи до вантажного транспорту", 0.50);
		k1.put("Мотоцикли з об''ємом двигуна до 300 куб.см", 0.34);
		k1.put("Мотоцикли з об''ємом двигуна більше 300 куб.см", 0.68);
		
		k2.put("Зона 1", 4.8);
		k2.put("Зона 2", 2.5);
		k2.put("Зона 3", 3.4);
		k2.put("Зона 4", 2.8);
		k2.put("Зона 5", 2.2);
		k2.put("Зона 6", 1.5);
		k2.put("Зона 7", 3.0);
		
		k3.put("Фізична особа, авто-мото, не таксі", 1.00);
		k3.put("Фізична особа, авто-мото, таксі", 1.40);
		k3.put("Фізична особа, вантажівка-автобус, не таксі", 1.00);
		k3.put("Фізична особа, вантажівка-автобус, таксі", 1.40);
		k3.put("Юридична особа, авто-мото, не таксі", 1.30);
		k3.put("Юридична особа, авто-мото, таксі", 1.50);
		k3.put("Юридична особа, вантажівка-автобус, не таксі", 1.00);
		k3.put("Юридична особа, вантажівка-автобус, таксі", 1.50);
		
		k4.put("Франшиза 0 незалежно від стажу", 1.76);
		k4.put("Франшиза 0 стаж меньше 3х років", 1.76);
		k4.put("Франшиза 0 стаж 3 роки та більше", 1.76);
		k4.put("Франшиза 0 юридична особа", 1.2);
		k4.put("Франшиза не 0 незалежно від стажу", 1.5);
		k4.put("Франшиза не 0 стаж меньше 3х років", 1.5);
		k4.put("Франшиза не 0 стаж 3 роки та більше", 1.5);
		k4.put("Франшиза не 0 юридична особа", 1.2);
		
		k5.put("Дорівнює строку дії договору",1.00);
		k5.put("6 місяців",0.70);
		k5.put("7 місяців",0.75);
		k5.put("8 місяців",0.80);
		k5.put("9 місяців",0.85);
		k5.put("10 місяців",0.90);
		k5.put("11 місяців",0.95);
		
		k6.put("Ні", 1.00);
		k6.put("Так", 2.00);
		
		k7.put("1 рік",1.00);
		k7.put("11 місяців",0.95);
		k7.put("10 місяців",0.90);
		k7.put("9 місяців",0.85);
		k7.put("8 місяців",0.80);
		k7.put("7 місяців",0.75);
		k7.put("6 місяців",0.70);
		k7.put("5 місяців",0.60);
		k7.put("4 місяці",0.50);
		k7.put("3 місяці",0.40);
		k7.put("2 місяці",0.30);
		k7.put("1 місяць",0.20);
		k7.put("15 днів",0.15);
		
		kBM.put("M", 2.45);
		kBM.put("0", 2.30);
		kBM.put("1", 1.55);
		kBM.put("2", 1.40);
		kBM.put("3", 1.00);
		kBM.put("4", 0.95);
		kBM.put("5", 0.90);
		kBM.put("6", 0.85);
		kBM.put("7", 0.80);
		
		kPark.put("до 4", 1.00);
		kPark.put("від 5 до 9", 0.95);
		kPark.put("від 10 до 19", 0.90);
		kPark.put("від 20 до 99", 0.85);
		kPark.put("від 100 до 499", 0.80);
		kPark.put("від 500 до 1999", 0.75);
		kPark.put("від 2000 і більше", 0.70);
		
		kPrivileges.put("Ні", 1.00);
		kPrivileges.put("Так", 2.00);
	}
	
	public Map<String, Double> getK1(){
		return k1;
	}
	
	public Map<String, Double> getK2(){
		return k2;
	}

	public Map<String, Double> getK3() {
		return k3;
	}

	public Map<String, Double> getK4() {
		return k4;
	}

	public Map<String, Double> getK5() {
		return k5;
	}

	public Map<String, Double> getK6() {
		return k6;
	}

	public Map<String, Double> getK7() {
		return k7;
	}

	public Map<String, Double> getkBM() {
		return kBM;
	}

	public Map<String, Double> getkPark() {
		return kPark;
	}

	public Map<String, Double> getkPrivileges() {
		return kPrivileges;
	}
}
