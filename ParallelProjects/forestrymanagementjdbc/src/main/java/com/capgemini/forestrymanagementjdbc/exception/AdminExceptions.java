package com.capgemini.forestrymanagementjdbc.exception;

public class AdminExceptions extends RuntimeException {

	String msg;

	public AdminExceptions(String msg) {
		this.msg = msg;

	}

	@Override
	public String getMessage() {
		return msg;
	}

}
