package com.bilgeadam.repository;

import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.utiliy.MyFactoryRepository;

public class UserInformationRepository extends MyFactoryRepository<UserInformation, Long> {

	public UserInformationRepository() {
		super(new UserInformation());

	}

}
