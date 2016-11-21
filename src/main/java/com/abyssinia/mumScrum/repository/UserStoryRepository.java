package com.abyssinia.mumScrum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abyssinia.mumScrum.domain.Sprint;
import com.abyssinia.mumScrum.domain.UserStory;

@Repository
public interface UserStoryRepository extends  CrudRepository<UserStory, Long> 
{
	@Query("select u from UserStory u where u.usid= :usid")
	public UserStory locateUserStoryByHisNumber(@Param("usid") Long usid);

	
	@Query("select s from Sprint  s where s.startDate= :startDate")
	public UserStory locateOneUserStorytbyHisFirstName(@Param("startDate") String startDate);
	
}