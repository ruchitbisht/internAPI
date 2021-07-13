package com.pratikshat.intern.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pratikshat.intern.entity.Intern;
import com.pratikshat.intern.repository.InternRepository;

@Component
public class InternServices {
	
	@Autowired
	private InternRepository internRepository;

	public List<Intern> getAllInterns() {
		List<Intern> intern = (List<Intern>) internRepository.findAll();
		return intern;
	}

	public Intern saveIntern(Intern n) {
		Intern intern = internRepository.save(n);
		return intern;
	}

	public Intern getIntern(int internId) {
		return internRepository.findById(internId);
	}

	public Intern updateIntern(Intern intern, int internId) {
		this.internRepository.save(intern);
		return intern;
	}
	
	public void deleteIntern(int internId) {
		 this.internRepository.deleteById(internId);
		
	}

}
