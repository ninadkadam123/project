package com.app.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	private Integer cid,uid;
	private String cname,street,city,disrtict,state,contact,email;
    private List<Job> jobs=new ArrayList<>();
	public Company()
	{
		
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
    
	@Column(length = 20)
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
  
	@Column(length = 20)
	public String getStreet() {
		return street;
	}
    
	
	public void setStreet(String street) {
		this.street = street;
	}
    
	@Column(length = 20)
	public String getCity() {
		return city;
	}
      
	public void setCity(String city) {
		this.city = city;
	}
   
	@Column(length = 20)
	public String getDisrtict() {
		return disrtict;
	}

	public void setDisrtict(String disrtict) {
		this.disrtict = disrtict;
	}
    
	@Column(length = 20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
   
	@Column(length = 20)
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
    
	@OneToMany( mappedBy = "company",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}
	
	public void addJob(Job job)
	{
		jobs.add(job);
		job.setCompany(this);
	}
    
	public void removeJob(Job job)
	{
		jobs.remove(job);
		job.setCompany(null);
	}
    @Column(length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    
	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", street=" + street + ", city=" + city + ", disrtict="
				+ disrtict + ", state=" + state + ", contact=" + contact + ", email=" + email + ", jobs=" + jobs + "]";
	}

	
	
	
}
