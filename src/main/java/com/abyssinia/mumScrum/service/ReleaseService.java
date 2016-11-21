package com.abyssinia.mumScrum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abyssinia.mumScrum.domain.Release;


public interface ReleaseService {

	public void save(Release release);
	public List<Release> findAll();
	public Release getReleaseByNumber (Long id);
	public Release findByName(String resourceName);
	public void update(Release release);
	public void delete(Long id);
	
	
}