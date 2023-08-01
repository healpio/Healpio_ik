
  package com.healpio.service;
  
  import java.util.List;
  
  import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.healpio.vo.ClassVO;
import com.healpio.vo.Criteria;
import com.healpio.vo.ExerciseVO;
import com.healpio.vo.LocationVO;

  
  
  @Service 
  public interface BoardService {
  
  public List<ClassVO> getList(Criteria cri, Model model);
  
  public List<ExerciseVO> exerciseList(Model model);
  
  public List<LocationVO> provinceList(Model model);
  
  public List<LocationVO> locationList(Model model);
  
  public int getTotalCnt(Criteria cri);
  }
 