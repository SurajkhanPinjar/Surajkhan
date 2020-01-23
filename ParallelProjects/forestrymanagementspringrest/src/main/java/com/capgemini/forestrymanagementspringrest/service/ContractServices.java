package com.capgemini.forestrymanagementspringrest.service;

import java.util.ArrayList;

import com.capgemini.forestrymanagementspringrest.dto.Contracts;

public interface ContractServices {

	public boolean addContract(Contracts c);

	public boolean deleteContract(int contractId);

	public Contracts getContract(int contractNo);

	public ArrayList<Contracts> getAllContract();

	public boolean scheduleContracts(Contracts contract);
	
	public boolean modifyContracts(Contracts contract);

}
