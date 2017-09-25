package ua.sorokin.model;

public class OsagoDTO {
	private double k1;
	private double k2;
	private double k3; 
	private double k4; 
	private double k5;
	private double k6;
	private double k7;
	private double kBM;
	private double kPark;
	private double kPrivileges;
	private double result;

	public double getK1() {
		return k1;
	}

	public void setK1(double k1) {
		this.k1 = k1;
	}

	public double getK2() {
		return k2;
	}

	public void setK2(double k2) {
		this.k2 = k2;
	}

	public double getK3() {
		return k3;
	}

	public void setK3(double k3) {
		this.k3 = k3;
	}

	public double getK4() {
		return k4;
	}

	public void setK4(double k4) {
		this.k4 = k4;
	}

	public double getK5() {
		return k5;
	}

	public void setK5(double k5) {
		this.k5 = k5;
	}

	public double getK6() {
		return k6;
	}

	public void setK6(double k6) {
		this.k6 = k6;
	}

	public double getK7() {
		return k7;
	}

	public void setK7(double k7) {
		this.k7 = k7;
	}

	public double getkBM() {
		return kBM;
	}

	public void setkBM(double kBM) {
		this.kBM = kBM;
	}

	public double getkPark() {
		return kPark;
	}

	public void setkPark(double kPark) {
		this.kPark = kPark;
	}

	public double getkPrivileges() {
		return kPrivileges;
	}

	public void setkPrivileges(double kPrivileges) {
		this.kPrivileges = kPrivileges;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public boolean notNull(){
		return (k1!=0 && k2!=0 && k3!=0 && k4!=0 && k5!=0 && k6!=0 && k7!=0 
				&& kBM!=0 && kPark!=0 && kPrivileges!=0);
	}
}
