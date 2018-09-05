package com.cg.capstoreapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {

	/*@RequestMapping(value="/payment")
	public String wel() {
		return "payment";
	}
	
*/	
	@RequestMapping(value="/order")
	public String getDispatchReport() {
		return "order";
	}

	@RequestMapping(value="/merchant")
	public String getParticularProductDetails() {
		return "merchant";
	}
	
	@RequestMapping(value="/transactionAnalysis")
	public String getTransactionalDetails() {
		return "transactionAnalysis";
	}

		
	}

