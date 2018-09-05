package com.cg.capstoreapp.controller;





import java.sql.Date;
import java.util.List;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import com.cg.capstoreapp.beans.MerchantBean;
import com.cg.capstoreapp.beans.OrderBean;
import com.cg.capstoreapp.beans.PaymentDetailsBean;
import com.cg.capstoreapp.beans.ProductBean;


@RestController
public class RestConsumer {
	
	@RequestMapping(value="/")
	public String wel() {
		return "admin";
	}
	
	@RequestMapping("/getDispatchReport")
	public ModelAndView getDetails(String orderId) {
		System.out.println("***********"+orderId);
		ModelAndView mav1 = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
		OrderBean response = restTemplate.getForObject("http://localhost:1122/report?orderId="+orderId, OrderBean.class);
		mav1.addObject("customer", response);
		System.out.println(response);
		mav1.setViewName("getDispatchReport");
		return mav1;
	}
	@RequestMapping("/getParticularProductDetails")
	public  ModelAndView category(String emailId) {
		System.out.println("***********"+emailId);
		System.err.println("Hi");
		ModelAndView mav1 = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
	
	
		MerchantBean response = restTemplate.getForObject("http://localhost:1122/merchant?emailId="+emailId, MerchantBean.class);
		mav1.addObject("customer",response);
		//modelMap.put("emailId",response);
		System.out.println(response);
		mav1.setViewName("getParticularProductDetails");
		return mav1;
		//return modelMap;
	}
	@RequestMapping("/getTransactionalDetails")
	public  ModelAndView transactionAnalysis(Date start, Date end) {
		System.out.println("***********"+start+"*******"+end);
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<Date, Date> map = new LinkedMultiValueMap<Date, Date>();
		map.add(start, end);
		System.out.println(map);
		PaymentDetailsBean response = restTemplate.postForObject("http://localhost:1122/generateanalysis?", map,PaymentDetailsBean.class);
		mav.addObject("customer", response);
		mav.setViewName("getTransactionalDetails");
		return mav;
	}
	
	
	
	
}
