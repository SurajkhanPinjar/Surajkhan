package com.capgemini.forestrymanagementspringrest.exception;

public class ClientExceptions extends RuntimeException {
	String msg;

	public ClientExceptions(String msg) {
		this.msg = msg;

	}

	@Override
	public String getMessage() {
		return msg;
	}

}
