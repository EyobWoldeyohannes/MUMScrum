package com.abyssinia.mumScrum.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abyssinia.mumScrum.domain.Release;

	@Repository
	public interface ReleaseRepository extends  CrudRepository<Release, Long> 
	{
		@Query("select r from Release  r where r.releaseNumber= :releaseNumber")
		public Release locateOneReleaseByItsNumber(@Param("releaseNumber") Long releaseNumber);

		
		@Query("select r from Release  r where r.name= :name")
		public Release locateOneReleasebyItsName(@Param("name") String name);
		
		@Query("select r from Release r where r.name = :name")
		Release findByName(@Param("name") String name);
		
	
	}
	
	