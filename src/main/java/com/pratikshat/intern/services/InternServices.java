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
		
		Intern intern=new Intern();
			
		System.out.println(n.getInternDOB().getYear()+1900);
		if(n.getInternDOB().getYear()+1900<=2003) {
			intern.setInternDOB(n.getInternDOB());
			intern.setInternId(n.getInternId());
			intern.setInternFirstName(n.getInternFirstName());
			intern.setInternLastName(n.getInternLastName());
			intern.setInternMobileNo(n.getInternMobileNo());
			intern.setInternProfile(n.getInternProfile());
			
			return internRepository.save(intern);
			} else {
				System.out.println("Age Should be 18+ for internship");
				return null;
			}
	  
	}

	public Intern getIntern(int internId) {
		return internRepository.findById(internId);
	}

	public Intern updateIntern(Intern intern, int internId) {
		Intern n=	this.internRepository.findById(internId);
		
		n.setInternFirstName(intern.getInternFirstName());
		
		if(intern.getInternLastName()!=null) {
			n.setInternLastName(intern.getInternLastName());
		}
		if(intern.getInternProfile()!=null) {
			n.setInternProfile(intern.getInternProfile());
		}
		if(intern.getInternDOB()!=null) {
			n.setInternDOB(intern.getInternDOB());
		}	
		
		System.out.println(n);
		
		return internRepository.save(n);
		
	}

	public void deleteIntern(int internId) {
		this.internRepository.deleteById(internId);

	}

}
