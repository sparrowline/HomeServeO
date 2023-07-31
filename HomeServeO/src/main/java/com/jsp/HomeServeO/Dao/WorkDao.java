package com.jsp.HomeServeO.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.HomeServeO.Dto.Work;
import com.jsp.HomeServeO.Repo.WorkRepo;

@Repository
public class WorkDao {

	@Autowired
	WorkRepo repo;

	// save() ,getbyid(),listOfWorks(),update()

	/*-------------------------------------------------------------------------------------------------------*/

	public Work saveWork(Work work) {
		return saveWork(work);

	}
	/*-------------------------------------------------------------------------------------------------------*/

	public Work getById(int id) {
		Work work = repo.findById(id).get();
		if (work != null) {
			return work;
		} else {
			return null;
		}
	}

	/*-------------------------------------------------------------------------------------------------------*/

	public List<Work> listOfWork() {
		List<Work> list = repo.listWorks();

		if (list != null) {
			return list;
		} else
			return null;
	}

	/*-------------------------------------------------------------------------------------------------------*/

	public Work updateWork(Work work) {
		Work db = repo.findById(work.getId()).get();

		if (db != null) {

			if (work.getType() == null) {
				work.setType(db.getType());
			}
			if (work.getAddress() == null) {
				work.setAddress(db.getAddress());
			}
			if (work.getCost() == null) {
				work.setCost(db.getCost());
			}
			if (work.getCustomer() == null) {
				work.setCustomer(db.getCustomer());
			}
			if (work.getEndDate() == null) {
				work.setEndDate(db.getEndDate());
			}
			if (work.getStartDate() == null) {
				work.setStartDate(db.getStartDate());
			}
			if (work.getVendor() == null) {
				work.setVendor(db.getVendor());
			}

			repo.save(work);
			return work;
			
		} else

			return null;

	}

}
