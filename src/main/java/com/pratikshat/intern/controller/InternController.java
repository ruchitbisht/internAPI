package com.pratikshat.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratikshat.intern.entity.Intern;
import com.pratikshat.intern.services.InternServices;

@RestController
@CrossOrigin
public class InternController {
	@Autowired
	private InternServices internServices;
	
	@GetMapping("/intern")
	public List<Intern> getAllIntern() {
		return this.internServices.getAllInterns();
	}
	
	@GetMapping("/intern/{id}")
	public Intern getIntern(@PathVariable("id") int interId) {
		return this.internServices.getIntern(interId);
	}
	
	@PostMapping("/intern")
	public Intern postIntern( @RequestBody Intern n) {
		Intern intern=	this.internServices.saveIntern(n);
		return intern;	
	}
	
	@PutMapping("/intern/{id}")
	public Intern updateIntern(@RequestBody Intern intern,@PathVariable("id") int internId) {
		return internServices.updateIntern(intern,internId);
		
	}	
		
	@DeleteMapping("/intern/{id}")
	public Intern deleteIntern(@PathVariable("id") int internId) {
		this.internServices.deleteIntern(internId);
		return null;
		
	}
		
	

}
