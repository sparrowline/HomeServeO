package com.jsp.HomeServeO.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.HomeServeO.Dao.WorkDao;
import com.jsp.HomeServeO.Dto.Work;
import com.jsp.HomeServeO.exception.NoSuchelementFoundForWork;
import com.jsp.HomeServeO.util.ResponseStructure;

@Service
public class WorkService {

	public WorkDao dao;

	/*-------------------------------------------------------------------------------------------------------*/

	public ResponseEntity<ResponseStructure<Work>> saveWork(Work work) {

		ResponseStructure<Work> structure = new ResponseStructure<>();

		structure.setMessage("work saved successfully.");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(dao.saveWork(work));

		return new ResponseEntity<ResponseStructure<Work>>(structure, HttpStatus.ACCEPTED);
	}

	/*-------------------------------------------------------------------------------------------------------*/

	public ResponseEntity<ResponseStructure<Work>> updateWork(Work work) {

		ResponseStructure<Work> structure = new ResponseStructure<>();

		Work db = dao.getById(work.getId());

		if (db != null) {

			structure.setMessage("work updated successfully");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(dao.updateWork(work));

			return new ResponseEntity<ResponseStructure<Work>>(structure, HttpStatus.FOUND);

		} else
			throw new NoSuchelementFoundForWork();

	}
	
	/*-------------------------------------------------------------------------------------------------------*/

	
	public ResponseEntity<ResponseStructure<Work>> getWorkById(int id){
		
		ResponseStructure<Work> structure = new ResponseStructure<>();
		
		Work db2 = dao.getById(id);
		
		if(db2!=null) {
			structure.setMessage("id fetched successfully.");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(db2);
			
			return new ResponseEntity<ResponseStructure<Work>> (structure,HttpStatus.FOUND);
		}
		else 
			throw new NoSuchelementFoundForWork();
		
	}
	
	/*-------------------------------------------------------------------------------------------------------*/

	

}
