package com.claim.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.service.entity.ClaimServiceEntity;
@Repository
public interface ClaimServiceRepository extends JpaRepository<ClaimServiceEntity,Integer> {
	
	



}
