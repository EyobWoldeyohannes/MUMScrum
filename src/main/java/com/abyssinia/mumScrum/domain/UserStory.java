package com.abyssinia.mumScrum.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class UserStory {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	 	private Long usid;
	
	
	@Column(name= "startDate")
	private String startDate;
   
   @Column(name="dueDate")
	private String dueDate;
   
   
   @Column(name="discription")
	private String discription;
   
   @Column(name="originalEstimation")
	private String originalEstimation;
   
   @Column(name="remainEstimation")
	private String remainEstimation;
	
   @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sprintId")
	private Sprint sprint;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ReleaseBackLogId")
	private ReleaseBackLog releaseBackLog;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="employeeId")
	private Sprint employee;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getOriginalEstimation() {
		return originalEstimation;
	}

	public void setOriginalEstimation(String originalEstimation) {
		this.originalEstimation = originalEstimation;
	}

	public String getRemainEstimation() {
		return remainEstimation;
	}

	public void setRemainEstimation(String remainEstimation) {
		this.remainEstimation = remainEstimation;
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	public ReleaseBackLog getReleaseBackLog() {
		return releaseBackLog;
	}

	public void setReleaseBackLog(ReleaseBackLog releaseBackLog) {
		this.releaseBackLog = releaseBackLog;
	}

	public Sprint getEmployee() {
		return employee;
	}

	public void setEmployee(Sprint employee) {
		this.employee = employee;
	}

	public Long getUsid() {
		return usid;
	}

	public void setUsid(Long usid) {
		this.usid = usid;
	}


	
	
	

}
