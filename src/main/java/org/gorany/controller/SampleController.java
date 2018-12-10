package org.gorany.controller;

import org.gorany.domain.PartnerVO;
import org.gorany.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/welcome")
	public void welcome() {
		log.info("회원가입....");
	}
	
	@PostMapping("/partnercreate")
	public void partnercreate(PartnerVO vo) {
		log.info("파트너 계정생성 완료....");
		log.info("파트너 회원가입 정보: " + vo);
		service.registerPartner(vo);
	}
	
	@PostMapping("/usercreate")
	public void usercreate() {
		log.info("유저 계정생성 완료....");
	}
}
