package org.project.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.project.services.Service;

@RunWith(MockitoJUnitRunner.class)
public class TestService {

	@InjectMocks
	Service service;
	
	@Test
	public void validateQueryParams() {
		
	}
	
	@Test
	public void testService() {
		
	}

}