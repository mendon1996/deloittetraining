package incomeTax;

public class EmployeeVo
{
	double empid;
	String empname;
	double annualincome;
	double incometax;
	
	
	public double getEmpid() {
		return empid;
	}
	
	
	public void setEmpid(double empid) {
		this.empid = empid;
	}
	
	
	@Override
	public String toString() {
		return "EmplyeeVo [empid=" + empid + ", empname=" + empname + ", annualincome=" + annualincome + ", incometax="
				+ incometax + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualincome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(empid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		temp = Double.doubleToLongBits(incometax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(annualincome) != Double.doubleToLongBits(other.annualincome))
			return false;
		if (Double.doubleToLongBits(empid) != Double.doubleToLongBits(other.empid))
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (Double.doubleToLongBits(incometax) != Double.doubleToLongBits(other.incometax))
			return false;
		return true;
	}
	
	
	public String getEmpname() {
		return empname;
	}
	
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	public double getAnnualincome() {
		return annualincome;
	}
	
	
	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}
	
	
	public EmployeeVo(double empid, String empname, double annualincome) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;
		//this.incometax = incometax;
	}


	public double getIncometax() {
		return incometax;
	}
	
	
	
	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}
	


}
