package org.gorany.service;

import java.util.List;

import org.gorany.domain.PartnerVO;
import org.springframework.stereotype.Service;

@Service
public interface PartnerService {

	public List<PartnerVO> getPartnerList();
	
	public PartnerVO getPartner(String pid);
	
	public int registerPartner(PartnerVO vo);

	public PartnerVO getPartnerBySerialNum(PartnerVO vo);
	
	public String getAuth(String pid);

}
