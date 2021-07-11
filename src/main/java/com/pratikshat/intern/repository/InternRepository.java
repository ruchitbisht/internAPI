package com.pratikshat.intern.repository;

import org.springframework.data.repository.CrudRepository;

import com.pratikshat.intern.entity.Intern;

public interface InternRepository extends CrudRepository<Intern, Integer> {

	public Intern findById(int id);
}
