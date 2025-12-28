package com.opp.constructor.passByValue;

public class Boss {
	private int bossId;
	private String bossName;
	
	public Boss(Employee emp) {
		this.bossId=emp.getEmployeeId();
		this.bossName=emp.getEmployeeName();
	}
	

	@Override
	public String toString() {
		return "Boss [bossId=" + bossId + ", bossName=" + bossName + "]";
	}
	

}
