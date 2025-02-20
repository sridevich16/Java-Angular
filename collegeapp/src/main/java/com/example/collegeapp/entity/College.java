package com.example.collegeapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @Column
    private String name;
    public College() {}
    public College(Long id, String name, String location, List<Department> departments) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.departments = departments;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	@Column
    private String location;
    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    //@JoinColumn
    private List<Department> departments;
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", location=" + location +" ]";
	}

}
