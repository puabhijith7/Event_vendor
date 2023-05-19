package com.ust.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.Model.Vendor;
import com.ust.Repo.VendorRepo;



@Service
public class VendorService {
	@Autowired
	private VendorRepo vp;

	public Vendor findVendorById(String id) {
		
		  Optional<Vendor> result = vp.findById(id);  
		  Vendor vendor = result.get();
		  return vendor;
		
	}

	public List<Vendor> GetAllVendors() {
		
		List<Vendor> vendors= vp.findAll();
		return vendors;
	}

	public void addVendor(Vendor vendor) {
		vp.save(vendor);
		
		
	}

	public void updateVendor(Vendor vendor1) {
		
		Optional<Vendor> result = vp.findById(vendor1.getV_id());
		if(result.isPresent())
		{
			vp.save(vendor1);
		}		
	}

	public void deleteVendor(String id) {
		
		vp.deleteById(id);
		
	}

}
