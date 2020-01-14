package com.app.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	private Integer sid,uid;
	private String name,email,gender,street,city,district,state,skill1,skill2,skill3;
	private HiredStatus status;
	private Qualification qualification;
	private Date Dob;
	private byte[] image;
	private List<Application> applications=new ArrayList<>();
	
	public Student() {
		
	}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
    @Column(length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 20)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Column(length = 20)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(length = 20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Column(length = 20)
	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
   
	@Column(length = 20)
	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	@Column(length = 20)
	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}
    
	
   @Enumerated(EnumType.STRING)
   @Column(name ="h_status",length = 20)
	public HiredStatus getStatus() {
		return status;
	}

	public void setStatus(HiredStatus status) {
		this.status = status;
	}
   @Temporal(TemporalType.DATE)
   @Column(name = "dob")
	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		Dob = dob;
	}
    
	@Lob
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
    @Embedded
	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
   
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	
	public void addApplication(Application app)
	{
		applications.add(app);
		app.setStudent(this);
	}
	
	public void removeApplication(Application app)
	{
		applications.remove(app);
		app.setStudent(null);
	}
	
	
    
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", street="
				+ street + ", city=" + city + ", district=" + district + ", state=" + state + ", skill1=" + skill1
				+ ", skill2=" + skill2 + ", skill3=" + skill3 + ", status=" + status + ", qualification="
				+ qualification + ", Dob=" + Dob + ", image=" + Arrays.toString(image) + ", applications="
				+ applications + "]";
	}
	
	
	
}
