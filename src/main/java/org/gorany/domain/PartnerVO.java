package org.gorany.domain;

import java.util.List;

import org.gorany.domain.AuthVO;

import lombok.Data;

@Data
public class PartnerVO {
	private int pno;
	private String pid;
	private String ppw;
	private String serialNum;
	
	private List<AuthVO> authList;

}