package org.project.services;

import org.apache.commons.lang.StringUtils;
import org.project.constants.Constants;
import org.project.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Service implements IService{

	private static final Logger logger = LoggerFactory.getLogger(Service.class);
	
	@Override
	public void method1(String params) {
		
		//validate request params
		validateRequestParams(params);

		//logic

	}

	private void validateRequestParams(String params) {
		if(StringUtils.isBlank(params)) {
			throw new ServiceException(Constants.ErrorConstants.ERROR1);
		}
		
	}
    
}
