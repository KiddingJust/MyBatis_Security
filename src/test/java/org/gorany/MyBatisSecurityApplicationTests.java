package org.gorany;

import java.util.List;

import org.gorany.domain.PartnerVO;
import org.gorany.mapper.PartnerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log
public class MyBatisSecurityApplicationTests {

	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	PartnerMapper mapper;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testEncode() {
		
		String pw = "12345678";
		
		String enPw = encoder.encode(pw);
		
		System.out.println(enPw);
	}
	
	@Test
	public void test() {
		
		PartnerVO vo = new PartnerVO();
		vo.setPid("gaaaaaik");
		vo.setPpw("12345678");
		vo.setPmail("rlarkdlr@naver.com");
		vo.setOwner_name("김가익");
		vo.setOwner_num("010-1234-5678");
		
		mapper.registerPartner(vo);
		mapper.registerAuth(vo);
	}

}
