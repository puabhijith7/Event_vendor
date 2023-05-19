package com.ust.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.Model.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor,String>{

	

}
