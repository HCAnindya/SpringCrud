package com;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Home {

	public Home(String header, String description, String footer) {
		this.header = header;
		this.description = description;
		this.footer = footer;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "header", length = 50, nullable = false)
	private String header;
	
	@Column(name = "description", length = 500, nullable = false)
	private String description;
	
	@Column(name = "footer", length = 50, nullable = false)
	private String footer;
	
	@CreationTimestamp
	@Column(name = "created_at", nullable = false)
	private Instant created_at;
	
	@UpdateTimestamp
	@Column(name = "modified_at", nullable = false)
	private Instant modified_at;
	
	
	
}
