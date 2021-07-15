package com.pratikshat.intern.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pratikshat.intern.entity.Intern;

public interface InternRepository extends CrudRepository<Intern, Integer> {

	public Intern findById(int id);
	
	@Query(value = "SELECT intern_mobile_no from Intern", nativeQuery=true)
	public List<Long>	getMobileNo();
	
	public Intern findByInternMobileNo(Long no);
}
