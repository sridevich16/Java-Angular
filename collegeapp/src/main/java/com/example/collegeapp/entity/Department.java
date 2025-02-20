package com.example.collegeapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    
    @ManyToOne
    private College college;
    
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    //@JoinColumn
    private List<Faculty> faculties;
    public Department() {}
    

	public Department(Long id, String name, College college, List<Faculty> faculties) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.faculties = faculties;
	}

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

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + " ]";
	}

	

}
