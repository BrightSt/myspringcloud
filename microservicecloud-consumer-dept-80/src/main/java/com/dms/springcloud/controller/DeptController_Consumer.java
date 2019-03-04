package com.dms.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dms.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	
	public static String REDT_URL_PREFIX = "http://127.0.0.1:8001/";

	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept)
	{
		return restTemplate.postForObject(REDT_URL_PREFIX+"dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id)
	{
		return restTemplate.getForObject(REDT_URL_PREFIX+"dept/get/"+id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "consumer/dept/list", method = RequestMethod.GET)
	public List<Dept> list()
	{
		return restTemplate.getForObject(REDT_URL_PREFIX+"dept/list", List.class);
	}
	
}
