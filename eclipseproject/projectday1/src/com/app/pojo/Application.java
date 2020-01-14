package com.app.pojo;

import javax.persistence.*;
import javax.persistence.Id;
@Entity
@Table(name = "applications")
public class Application {
	private Integer aid;
	private String status;
	private Student student;
	private Job job;
	
	Application()
	{}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}
    @Column(length = 20)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@ManyToOne
	@JoinColumn(name = "s_id")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@ManyToOne
	@JoinColumn(name = "j_id")
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Application [aid=" + aid + ", status=" + status + ", student=" + student + ", job=" + job + "]";
	}
    
	
	

}
