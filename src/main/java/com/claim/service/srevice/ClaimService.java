package com.claim.service.srevice;

import java.util.List;

import com.claim.service.entity.ClaimServiceEntity;

public interface ClaimService {
	
	public ClaimServiceEntity addClaim(ClaimServiceEntity claimServiceEntity);
	
	public List<ClaimServiceEntity>  findall();

	public ClaimServiceEntity updatePolicy (ClaimServiceEntity claimServiceEntity);

	void deleteClaimId(int claimId);

	

	
	


}
