package org.gorany.security;

import org.gorany.domain.PartnerVO;
import org.gorany.mapper.PartnerMapper;
import org.gorany.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Setter;
import lombok.extern.java.Log;

@Log
public class CustomUserDetailsService implements UserDetailsService {

	@Setter(onMethod_=@Autowired)
	private PartnerMapper mapper;
	
	@Setter(onMethod_=@Autowired)
	private PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.info("loadUserByUsername..................................");
		log.info("PARM: " + username);
		
		PartnerVO vo = mapper.getPartner(username);	
		
		log.info("" + vo);
		
		vo.setPpw( encoder.encode(vo.getPpw()));
		
		CustomUser user = new CustomUser(vo);
		
		log.info("" + user);
		
		return user;
	}

}