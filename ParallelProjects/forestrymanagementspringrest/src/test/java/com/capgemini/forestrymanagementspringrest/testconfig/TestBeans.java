//package com.capgemini.forestrymanagementspringrest.testconfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.capgemini.forestrymanagementspringrest.dao.AdminDao;
//import com.capgemini.forestrymanagementspringrest.dao.AdminDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.ClientDao;
//import com.capgemini.forestrymanagementspringrest.dao.ClientDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.ContractDao;
//import com.capgemini.forestrymanagementspringrest.dao.ContractDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.CustomerDao;
//import com.capgemini.forestrymanagementspringrest.dao.CustomerDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.LandDao;
//import com.capgemini.forestrymanagementspringrest.dao.LandDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.ProductDao;
//import com.capgemini.forestrymanagementspringrest.dao.ProductDaoImpl;
//import com.capgemini.forestrymanagementspringrest.dao.SchedulerDao;
//import com.capgemini.forestrymanagementspringrest.dao.SchedulerDaoImpl;
//import com.capgemini.forestrymanagementspringrest.service.AdminService;
//import com.capgemini.forestrymanagementspringrest.service.AdminServiceImpl;
//import com.capgemini.forestrymanagementspringrest.service.ClientServices;
//import com.capgemini.forestrymanagementspringrest.service.ClientServicesImpl;
//import com.capgemini.forestrymanagementspringrest.service.ContractServices;
//import com.capgemini.forestrymanagementspringrest.service.ContractServicesImpl;
//import com.capgemini.forestrymanagementspringrest.service.CustomerService;
//import com.capgemini.forestrymanagementspringrest.service.CustomerServiceImpl;
//import com.capgemini.forestrymanagementspringrest.service.LandServices;
//import com.capgemini.forestrymanagementspringrest.service.LandServicesImpl;
//import com.capgemini.forestrymanagementspringrest.service.ProductServices;
//import com.capgemini.forestrymanagementspringrest.service.ProductServicesImpl;
//import com.capgemini.forestrymanagementspringrest.service.SchedulerServ;
//import com.capgemini.forestrymanagementspringrest.service.SchedulerServImpl;
//
//@Configuration
//public class TestBeans {
//	
//	@Bean
//	public AdminDao adminDao() {
//		return new AdminDaoImpl();
//	}
//	
//	@Bean
//	public AdminService adminService() {
//		return new AdminServiceImpl();
//	}
//	
//	@Bean 
//	public ClientDao clientDao() {
//		return new ClientDaoImpl();
//	}
//	
//	@Bean
//	public ClientServices clientServices() {
//		return new ClientServicesImpl();
//	}
//	
//	@Bean
//	public ContractDao contractDao() {
//		return new ContractDaoImpl();
//	}
//	
//	@Bean
//	public ContractServices contractService() {
//		return new ContractServicesImpl();
//	}
//	
//	@Bean
//	public CustomerDao customerDao() {
//		return new CustomerDaoImpl();
//	}
//	
//	@Bean
//	public CustomerService customerService() {
//		return new CustomerServiceImpl();
//	}
//	
//	@Bean
//	public LandDao landDao() {
//		return new LandDaoImpl();
//	}
//	
//	@Bean
//	public LandServices landServices() {
//		return new LandServicesImpl();
//	}
//	
//	@Bean
//	public ProductDao productDao() {
//		return new ProductDaoImpl();
//	}
//	
//	@Bean
//	public ProductServices productServices() {
//		return new ProductServicesImpl();
//	}
//	
//	@Bean SchedulerDao schedulerDao() {
//		return new SchedulerDaoImpl();
//	}
//	
//	@Bean SchedulerServ schedulerServ() {
//		return new SchedulerServImpl();
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
