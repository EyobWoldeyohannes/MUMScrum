package com.abyssinia.mumScrum.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Sprint {
		
	@Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	 	private Long sid;
	
	   @Column(name= "startDate")
		private String startDate;
	   
	   @Column(name="dueDate")
		private String dueDate;
	   
	   @Column(name="sprintNo")
		private Long sprintNo;
	  
	   
	   @Column(name="sprintId")
		private String sprintId;
	   
	   @Column(name="Role")
	 		private String role;
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name="userStoryId")
		private List<UserStory> userStory;
		
		
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="releaseBacklogId")
		private ReleaseBackLog releaseBackLog;


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getDueDate() {
		return dueDate;
	}
	
	 public String getStartDate() {
			return startDate;
		}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}


	public String getId() {
		return sprintId;
	}


	public void setId(String sprintId) {
		this.sprintId = sprintId;
	}


	


	public ReleaseBackLog getReleaseBackLog() {
		return releaseBackLog;
	}


	public void setReleaseBackLog(ReleaseBackLog releaseBackLog) {
		this.releaseBackLog = releaseBackLog;
	}


	public String getSprintId() {
		return sprintId;
	}


	public void setSprintId(String sprintId) {
		this.sprintId = sprintId;
	}


	public List<UserStory> getUserStory() {
		return userStory;
	}


	public void setUserStory(List<UserStory> userStory) {
		this.userStory = userStory;
	}


	public Long getSid() {
		return sid;
	}


	public void setSid(Long sid) {
		this.sid = sid;
	}


	public Long getSprintNo() {
		return sprintNo;
	}


	public void setSprintNo(Long sprintNo) {
		this.sprintNo = sprintNo;
	}


	


	
	
	
	}


	
		
		
		


