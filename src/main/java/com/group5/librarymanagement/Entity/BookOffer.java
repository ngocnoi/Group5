package com.group5.librarymanagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookoffer")
public class BookOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String bookName;
	
	@Column
	private String bookImage;
	
	@Column
	private String description;
	
	@Column
	private Boolean status;
}
