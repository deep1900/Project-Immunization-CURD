package com.howtodoinjava.example.async.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.howtodoinjava.example.async.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.example.async.service.AsyncService;

import static java.util.stream.Collectors.toList;

@RestController
public class AsyncController {

	private static Logger log = LoggerFactory.getLogger(AsyncController.class);

	@Autowired
	private AsyncService service;






	@RequestMapping(value = "/testAsynch", method = RequestMethod.GET)
	public Allofit testAsynch() throws InterruptedException, ExecutionException
	{
		log.info("testAsynch Start");

		CompletableFuture<EmployeeAddresses> employeeAddress = service.getEmployeeAddress();
		CompletableFuture<EmployeeNames> employeeName = service.getEmployeeName();
		CompletableFuture<EmployeePhone> employeePhone = service.getEmployeePhone();
		System.out.println(employeeAddress.get().toString());

		// Wait until they are all done
		   CompletableFuture.allOf(employeeAddress, employeeName, employeePhone).join();
		Allofit a = new Allofit();


		   EmployeeAddresses e = employeeAddress.get();
		   EmployeePhone p = employeePhone.get();
		   EmployeeNames n = employeeName.get();
		 //  e.getEmployeeAddressList().stream().forEach(x-> System.out.println(x));
		List<EmployeeAddress> collect = e.getEmployeeAddressList().stream().collect(toList());
		List<String> collect1 = p.getPhoneNumbers().stream().collect(toList());
		List<EmployeeName> collect2 = n.getEmployeeNameList().stream().collect(toList());
		System.out.println("New Collector"+collect.toString());
		a.setEmployeeAddressList(collect);
		p.setPhoneNumbers(collect1);
		n.setEmployeeNameList(collect2);





		log.info("EmployeeAddress--> " + employeeAddress.get());
		log.info("EmployeeName--> " + employeeName.get());
		log.info("EmployeePhone--> " + employeePhone.get());

		return a;

	}



}
