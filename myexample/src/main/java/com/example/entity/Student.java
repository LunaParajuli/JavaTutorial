
	package com.example.entity;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name="tbl_student")
	public class Student {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="email")
	    private String email;
	    

	    // Getters and setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	}
	

