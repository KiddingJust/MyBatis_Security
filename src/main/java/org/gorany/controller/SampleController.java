package org.gorany.controller;

import org.gorany.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Setter;
import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {

	@Setter(onMethod_=@Autowired)
	private PartnerService service;
	

	@GetMapping("/secret")
	public void secret() {
		log.info("secret");
	}
	
	@GetMapping("/partner")
	public void partner() {
		log.info("partner");
			
	}
	
}
