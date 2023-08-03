package com.jsp.HomeServeO.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.HomeServeO.Dto.Work;

public interface WorkRepo extends JpaRepository<Work, Integer> {
	
	//works which are not started or mapped with vendors 
	@Query("select a from Work a where a.startDate=null")
	public  List<Work> listWorks();

}
