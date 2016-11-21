package com.abyssinia.mumScrum.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;


@Entity
public class ProductBacklog {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	 	private Long pblid;
	
	
	 @Column(name= "id")
		private String productproductBacklogIdBacklogId;
	   
	   @Column(name="name")
		private String name;
	   
	   
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="userStoryId")
		private List<UserStory> userStory;
		
		
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name="releaseBacklogId")
		private List<ReleaseBackLog> releaseBackLog;


	


		


		public Long getPblid() {
			return pblid;
		}


		public void setPblid(Long pblid) {
			this.pblid = pblid;
		}


		public String getProductproductBacklogIdBacklogId() {
			return productproductBacklogIdBacklogId;
		}


		public void setProductproductBacklogIdBacklogId(String productproductBacklogIdBacklogId) {
			this.productproductBacklogIdBacklogId = productproductBacklogIdBacklogId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public List<UserStory> getUserStory() {
			return userStory;
		}


		public void setUserStory(List<UserStory> userStory) {
			this.userStory = userStory;
		}


		public List<ReleaseBackLog> getReleaseBackLog() {
			return releaseBackLog;
		}


		public void setReleaseBackLog(List<ReleaseBackLog> releaseBackLog) {
			this.releaseBackLog = releaseBackLog;
		}


		
		
		

}
