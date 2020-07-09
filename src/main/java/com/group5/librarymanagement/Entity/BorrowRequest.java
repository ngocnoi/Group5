package com.group5.librarymanagement.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "borrowrequest")
public class BorrowRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private LocalDate borrowDate;
	
	@Column
	private LocalDate returnDate;
	
	@Column
	private Double penaltyMoney;
	
	@Column
	private Boolean isDelete;
	
	@Column
	private Boolean isApproved;
	
	@Column
	private Boolean status;
	
}
