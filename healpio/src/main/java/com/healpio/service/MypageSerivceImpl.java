package com.healpio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healpio.mapper.MypageMapper;
import com.healpio.vo.MemberVO;
import com.healpio.vo.MyReservationVO;
import com.healpio.vo.ViewScrapVO;

@Service
public class MypageSerivceImpl implements MypageService{
	
	@Autowired
	MypageMapper mypageMapper;
	
	@Override
	public List<ViewScrapVO> getScrapList(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getScrapList(member_no);
	}

	@Override
	public List<MyReservationVO> getReservationList(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getReservationList(member_no);
	}

	@Override
	public int reservationDelete(String reservation_no) {
		// TODO Auto-generated method stub
		return mypageMapper.reservationDelete(reservation_no);
	}

	@Override
	public List<MyReservationVO> getPreviousCourses(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getPreviousCourses(member_no);
	}

	@Override
	public MemberVO getInfoList(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getInfoList(member_no);
	}

	@Override
	public int myInfoEdit(MemberVO vo) {
		// TODO Auto-generated method stub
		return mypageMapper.myInfoEdit(vo);
	}

	@Override
	public List<ViewScrapVO> getRegisterList(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getRegisterList(member_no);
	}

	@Override
	public List<MyReservationVO> resCheckList(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.resCheckList(member_no);
	}

	@Override
	public List<MyReservationVO> getPreviousBookings(String member_no) {
		// TODO Auto-generated method stub
		return mypageMapper.getPreviousBookings(member_no);
	}

}
