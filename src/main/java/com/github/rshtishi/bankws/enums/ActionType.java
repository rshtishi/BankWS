package com.github.rshtishi.bankws.enums;

public enum ActionType {
	
	WITHDRAW("Withdraw"),
	DEPOSIT("Deposit");
	
	private final String action;
	
	ActionType(String action){
		this.action =action;
	}
	
	public String getAction() {
		return action;
	}
	
	

}
