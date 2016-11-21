package com.abyssinia.mumScrum.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abyssinia.mumScrum.domain.Sprint;
import com.abyssinia.mumScrum.repository.SprintRepository;
import com.abyssinia.mumScrum.service.SprintService;

@Service
@Transactional
public class SprintServiceImpl implements SprintService  {

	@Autowired
	private SprintRepository sprintRepository;

	@Override
	public void save(Sprint sprint) {
		sprintRepository.save(sprint);
		
	}

	@Override
	public List<Sprint> findAll() {
		return (List<Sprint>)sprintRepository.findAll();
	}

	@Override
	public Sprint getSprintByNumber (Long sprintNumber) {
		return sprintRepository.locateOnesprintByHisNumber(sprintNumber);
	}

	@Override
	public Sprint findByName(String sprintFirstName) {
		// TODO Auto-generated method stub
		return sprintRepository.locateOneSprintbyHisFirstName(sprintFirstName);
	}

	@Override
	public void update(Sprint sprint) {
		sprintRepository.save(sprint);
		
		
	}

	@Override
	public void delete(Long id) {
		sprintRepository.delete(id);;
		
	}
	
}



