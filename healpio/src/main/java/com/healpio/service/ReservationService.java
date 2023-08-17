package com.healpio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healpio.vo.ClassVO;
import com.healpio.vo.MemberVO;
import com.healpio.vo.ReservationVO;

@Service
public interface ReservationService {
	
    public void insertReservation(ReservationVO reservation);
    
    public void updateReservation(ReservationVO reservation);
    
    public void deleteReservation(String reservation_no);
    
    public List<ReservationVO> getAllReservations();
    
    public List<ClassVO> getAllClasses();
    
    public ClassVO getClassDetailsByClassNo(String class_no);
    
    ReservationVO getReservationByNo(String reservation_no);
    
    public List<Integer> getActiveDays(String class_no);
    
    public List<String> getClassTimes(String class_no);
    
    public int getMaxReservationCountForClass(String class_no);
    
    public List<ReservationVO> getReservationCountsByDateAndTimes(String class_no, String reservation_date, List<String> availableTimes);

	public int increaseReservationCountIfNotMax(ReservationVO reservation);
    
	public MemberVO getMemberDetailsByMemberNo(String member_no);
	
}
