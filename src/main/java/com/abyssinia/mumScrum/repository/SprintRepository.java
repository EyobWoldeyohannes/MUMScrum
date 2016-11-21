package com.abyssinia.mumScrum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.abyssinia.mumScrum.domain.Sprint;

@Repository
public interface SprintRepository extends  CrudRepository<Sprint, Long> 
{
	@Query("select s from Sprint  s where s.sprintNo= :sprintNo")
	public Sprint locateOnesprintByHisNumber(@Param("sprintNo") Long sprintNo);

	
	@Query("select s from Sprint  s where s.startDate= :startDate")
	public Sprint locateOneSprintbyHisFirstName(@Param("startDate") String startDate);
	

}
