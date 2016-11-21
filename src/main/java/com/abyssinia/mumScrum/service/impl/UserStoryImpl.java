package com.abyssinia.mumScrum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abyssinia.mumScrum.domain.UserStory;
import com.abyssinia.mumScrum.repository.UserStoryRepository;
import com.abyssinia.mumScrum.service.UserStoryService;


@Service
@Transactional
public class UserStoryImpl implements UserStoryService  {

	@Autowired
	private UserStoryRepository userStoryRepository;

	@Override
	public void save(UserStory userStory) {
		userStoryRepository.save(userStory);
		
	}

	@Override
	public List<UserStory> findAll() {
		return (List<UserStory>) userStoryRepository.findAll();
	}

	@Override
	public UserStory getUserStoryByNumber (Long UserStoryNumber) {
		return userStoryRepository.locateUserStoryByHisNumber(UserStoryNumber);
	}

	@Override
	public UserStory findByName(String UserStoryFirstName) {
		// TODO Auto-generated method stub
		return userStoryRepository.locateOneUserStorytbyHisFirstName(UserStoryFirstName);
	}

	@Override
	public void update(UserStory userStory) {
		userStoryRepository.save(userStory);
		
		
	}

	@Override
	public void delete(Long id) {
		userStoryRepository.delete(id);;
		
	}
	
}



