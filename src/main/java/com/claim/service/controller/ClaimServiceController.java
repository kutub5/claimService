package com.claim.service.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.claim.service.entity.ClaimServiceEntity;
import com.claim.service.srevice.ClaimServiceImpl;

   @RestController
   public class ClaimServiceController {

	@Autowired   
	private ClaimServiceImpl claimServiceImpl;
	
	@PostMapping("/saveclaim")
   	public ClaimServiceEntity addClaim(@RequestBody ClaimServiceEntity claimServiceEntity) {
		return claimServiceImpl.addClaim(claimServiceEntity);
				
   }
	
	@GetMapping("/findall")
	public List<ClaimServiceEntity>  findallPolicy() {
		return claimServiceImpl.findall();
    
	}	
	
	@PutMapping("/updateclaim")
	public ResponseEntity<ClaimServiceEntity> updateClaim(@RequestBody ClaimServiceEntity claimServiceIntity){
		ClaimServiceEntity policytest = new ClaimServiceEntity();
		try {
	
			policytest = claimServiceImpl.updatePolicy(claimServiceIntity);
			return ResponseEntity.of(Optional.of(policytest));
		}catch (NoSuchElementException e) {
//		  Map<String,String> responseBody = new HashMap();
//		  responseBody.put("error",e.getMessage());
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
			
	 @DeleteMapping("/deleteClaimId")
     public ResponseEntity<?>deletePolicy(@RequestParam(value = "userId") int claimId){
		try {	
			
			claimServiceImpl.deleteClaimId(claimId);
			return ResponseEntity.status(HttpStatus.OK).build();
		}catch (NoSuchElementException e) {
//			Map<String,String> responseBody = new HashMap<>();
//			responseBody.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
	}	
			
			
   }  
      
   
    

