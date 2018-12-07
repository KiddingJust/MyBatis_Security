package org.gorany.mapper;

import java.util.List;

import org.gorany.domain.PartnerVO;

public interface PartnerMapper {

	
	public List<PartnerVO> getPartnerList();
	
	public PartnerVO getPartner(String pid);
	
	public int registerPartner(PartnerVO vo);
	
	public PartnerVO getPartnerBySerialNum(PartnerVO vo);
	
	public String getAuth(String pid);
}
