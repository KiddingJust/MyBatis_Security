package org.gorany;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisSecurityApplicationTests {

	@Autowired
	PasswordEncoder encoder;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testEncode() {
		
		String pw = "12345678";
		
		String enPw = encoder.encode(pw);
		
		System.out.println(enPw);
	}

}
