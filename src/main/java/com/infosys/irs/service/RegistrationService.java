package com.infosys.irs.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.irs.entity.UserEntity;
import com.infosys.irs.exception.InfyGoBootException;

import com.infosys.irs.exception.UserIdAlreadyPresentException;
import com.infosys.irs.model.User;
import com.infosys.irs.repository.UserRepository;

@Service
public class RegistrationService {

	@Autowired
	public UserRepository userRepository;

	public String registerUser(User user) throws UserIdAlreadyPresentException {

		System.out.println("*****Validated**********");
		boolean existId = userRepository.existsById(user.getUserId());
		if (existId)
			throw new UserIdAlreadyPresentException("RegistrationService.USERID_PRESENT");

		UserEntity entity = new UserEntity();
		entity.setUserId(1234);
		entity.setName(user.getName());
		entity.setPassword(user.getPassword());
		entity.setEmail(user.getEmail());
		entity.setCity(user.getCity());
		entity.setPhone(user.getPhone());
		userRepository.saveAndFlush(entity);

		System.out.println(
				"************************************UserEntity persisted**********************************************");

		return "UserEntity Persisted Succesfully";

	}

}
