package com.abyssinia.mumScrum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abyssinia.mumScrum.domain.Release;
import com.abyssinia.mumScrum.repository.ReleaseRepository;
import com.abyssinia.mumScrum.service.ReleaseService;

@Service
@Transactional
public class ReleaseServiceImpl implements ReleaseService  {

	@Autowired
	private ReleaseRepository releaseRepository;

	@Override
	public void save(Release release) {
		releaseRepository.save(release);
		
	}

	@Override
	public List<Release> findAll() {
		return (List<Release>)releaseRepository.findAll();
	}

	@Override
	public Release getReleaseByNumber (Long releaseNumber) {
		return releaseRepository.locateOneReleaseByItsNumber(releaseNumber);
	}

	@Override
	public Release findByName(String releaseName) {
		// TODO Auto-generated method stub
		return releaseRepository.locateOneReleasebyItsName(releaseName);
	}
	
	

	@Override
	public void update(Release release) {
		 releaseRepository.save(release);
		
		
	}

	@Override
	public void delete(Long id) {
		releaseRepository.delete(id);;
		
	}
	
}
