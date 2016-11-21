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

import javax.persistence.OneToMany;

@Entity
public class ReleaseBackLog {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	 	private Long rblid;
	
	@Column(name= "startDate")
	private String startDate;
   
   @Column(name="dueDate")
	private String dueDate;
   
   
   @Column(name="releaseBackLogId")
	private String releaseBackLogId;
   
   public String getStartDate() {
	return startDate;
}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="userStoryId")
	private List<UserStory> userStory;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="sprintId")
	private List<Sprint> sprint;
	
	
   



public void setStartDate(String startDate) {
	this.startDate = startDate;
}


public String getDueDate() {
	return dueDate;
}


public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
}







public String getReleaseBackLogId() {
	return releaseBackLogId;
}


public void setReleaseBackLogId(String releaseBackLogId) {
	this.releaseBackLogId = releaseBackLogId;
}


public List<UserStory> getUserStory() {
	return userStory;
}


public void setUserStory(List<UserStory> userStory) {
	this.userStory = userStory;
}





public Long getRblid() {
	return rblid;
}


public void setRblid(Long rblid) {
	this.rblid = rblid;
}


public List<Sprint> getSprint() {
	return sprint;
}


public void setSprint(List<Sprint> sprint) {
	this.sprint = sprint;
}






	
	

}
