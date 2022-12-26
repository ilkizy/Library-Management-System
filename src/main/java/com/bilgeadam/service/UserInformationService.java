package com.bilgeadam.service;

import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.repository.UserInformationRepository;
import com.bilgeadam.utiliy.MyFactoryRepository;
import com.bilgeadam.utiliy.MyFactoryService;

public class UserInformationService extends MyFactoryService<MyFactoryRepository, UserInformation, Long> {

	public UserInformationService() {
		super(new UserInformationRepository());

	}

}
