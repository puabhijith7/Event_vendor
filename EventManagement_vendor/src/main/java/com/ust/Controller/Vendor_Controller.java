package com.ust.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.Model.Vendor;
import com.ust.Service.VendorService;



@RestController
public class Vendor_Controller {
	@Autowired	
	VendorService vs;		
	
	@GetMapping("/vendor/{id}")
	public Vendor getVendor(@PathVariable String id) {	
		Vendor vendor;		
		vendor= vs.findVendorById(id);			
		return vendor;      
	}
	
	@GetMapping("/vendors") 
	public List<Vendor> getAllVendors() {	
	    List<Vendor> vendors= vs.GetAllVendors();
		return vendors;				
	}
	
	@PostMapping("/vendors")
	public String createVendor(@RequestBody Vendor vendor) {
		vs.addVendor(vendor);				
		return "Successfully Added";				
	}
	
	@DeleteMapping("/vendor/{id}")
	public String deleteVendor(@PathVariable String id) {		
		try {
			vs.deleteVendor(id);
			return "DELETED";
		} catch (Exception e) {			
			return "ID NOT EXIST";
		}			
	}
	
	@PutMapping("/vendor/{id}") 
	public String updateCountry(@RequestBody Vendor vendor ) {			
		try {
			vs.updateVendor(vendor);
			return "UPDATED";
		} catch (Exception e) {			
			return "ID NOT EXIST";
		}		
	}

}
