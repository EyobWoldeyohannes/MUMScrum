package com.abyssinia.mumScrum.service;

import java.util.List;

import com.abyssinia.mumScrum.domain.Sprint;

public interface ProductBackLogService {

	public void save(Sprint sprint);
	public List<Sprint> findAll();
	public Sprint getSprintByNumber (Long id);
	public Sprint findByName(String resourceName);
	public void update(Sprint sprint);
	public void delete(Long id);
	

}
