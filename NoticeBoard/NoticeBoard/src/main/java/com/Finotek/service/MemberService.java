package com.Finotek.service;

import com.Finotek.vo.MemberVO;

public interface MemberService {

	public void register(MemberVO vo) throws Exception;
	
	public MemberVO login(MemberVO vo) throws Exception;
	
	public void memberUpdate(MemberVO vo) throws Exception;
	
	public void memberDelete(MemberVO vo) throws Exception;
	
	public int passChk(MemberVO vo) throws Exception;
	
	public int idChk(MemberVO vo) throws Exception;
}