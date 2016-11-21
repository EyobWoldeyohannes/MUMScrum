package com.abyssinia.mumScrum.service;

import java.util.List;

import com.abyssinia.mumScrum.domain.UserStory;



public interface UserStoryService {
	
	public void save(UserStory userStory);
	public List<UserStory> findAll();
	public UserStory getUserStoryByNumber (Long id);
	public UserStory findByName(String resourceName);
	public void update(UserStory userStory);
	public void delete(Long id);

}
