package com.assessment2.Question2;

public class EmplyeeVo {
	//instance variables 
			private int empid;
			private String empname;
			private double annualincome;
			private double incometax;
			
			//we create getters and setters for all the variables
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
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
			public double getIncometax() {
				return incometax;
			}
			public void setIncometax(double incometax) {
				this.incometax = incometax;
			}
			
			//generting hashcode for Comparator
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				long temp;
				temp = Double.doubleToLongBits(annualincome);
				result = prime * result + (int) (temp ^ (temp >>> 32));
				result = prime * result + empid;
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
				
				EmplyeeVo other = (EmplyeeVo) obj;
				if (Double.doubleToLongBits(annualincome) != Double.doubleToLongBits(other.annualincome))
					return false;
				if (empid != other.empid)
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
			
			//overriding toString to get output in normal form and not in Hexadecimal code 
			@Override
			public String toString() {
				return "EmplyeeVo [empid=" + empid + ", empname=" + empname + ", annualincome=" + annualincome
						+ ", incometax=" + incometax + "]";
			}
			
			//Constructor of EmplyeeVo class
			public EmplyeeVo(int empid, String empname, double annualincome, double incometax) {
				
				
				this.empid = empid;
				this.empname = empname;
				this.annualincome = annualincome;
				
			}
}
