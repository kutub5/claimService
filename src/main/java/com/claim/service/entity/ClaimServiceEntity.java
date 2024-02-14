package com.claim.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "claimservice")

public class ClaimServiceEntity {

	private String claimName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int claimNo;
	private int claimAmount;

	public ClaimServiceEntity() {
		super();
	}

	public String getClaimName() {
		return claimName;
	}

	public void setClaimName(String claimName) {
		this.claimName = claimName;
	}

	public int getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(int claimNo) {
		this.claimNo = claimNo;
	}

	public int getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(int claimAmount) {
		this.claimAmount = claimAmount;
	}

	public ClaimServiceEntity(String claimName, int claimNo, int claimAmount) {
		super();

		this.claimName = claimName;
		this.claimNo = claimNo;
		this.claimAmount = claimAmount;
	}

}
