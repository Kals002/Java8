package com.test;

public class Employee 
{
	private int empId;
	private String empName;
	private String empDeptName;
	private int empGrade;
	
	public Employee(int empId, String empName, String empDeptName, int empGrade)
	{
		this.empId = empId;
		this.empName = empName;
		this.empDeptName = empDeptName;
		this.empGrade = empGrade;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDeptName() {
		return empDeptName;
	}
	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}
	public int getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;
	}
	
	@Override
	public String toString() {
		return " [empId=" + empId + ", empName=" + empName + ", empDeptName=" + empDeptName + ", empGrade="
				+ empGrade + "]";
	}
}
