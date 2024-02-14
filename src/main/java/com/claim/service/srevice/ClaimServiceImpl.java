package com.claim.service.srevice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.service.entity.ClaimServiceEntity;
import com.claim.service.repository.ClaimServiceRepository;

@Service
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private ClaimServiceRepository claimServiceRepository;

	@Override
	public ClaimServiceEntity addClaim(ClaimServiceEntity claimServiceEntity) {
	return claimServiceRepository.save(claimServiceEntity);

   }

	 @Override
	  public List<ClaimServiceEntity> findall() {
     List<ClaimServiceEntity> list = claimServiceRepository.findAll();
	  return list;
	}

	 @Override
     public ClaimServiceEntity updatePolicy(ClaimServiceEntity claimServiceEntity) {
	   Optional<ClaimServiceEntity> ClaimService = claimServiceRepository
			   .findById(claimServiceEntity.getClaimNo());
	   if(ClaimService.isEmpty()) {
		   throw new NoSuchElementException("No data found for claim Id" + "ClaimService" + "in database"); 
	   }
	   return claimServiceRepository.save(claimServiceEntity);
 }
 
//	 @Override
//     public void deleteclaimId(int claimId) {
//    	 Optional<ClaimServiceEntity> policyServiceEntity = claimServiceRepository.findById(claimId);
//    	 if(policyServiceEntity.isEmpty()) {
//    		 throw new NoSuchElementException("no data found for Policy id " + claimId + "in database");
//    	 }
//
//     }

	@Override
	public void deleteClaimId(int claimId) {
		 Optional<ClaimServiceEntity> claimServiceEntity = claimServiceRepository.findById(claimId);
    	 if(claimServiceEntity.isEmpty()) {
    		 throw new NoSuchElementException("no data found for Policy id " + claimId + "in database");
    	 }
		
	}
	 
}


