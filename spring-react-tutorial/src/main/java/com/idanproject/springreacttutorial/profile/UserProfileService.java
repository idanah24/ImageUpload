package com.idanproject.springreacttutorial.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserProfileService {
	
	private final UserProfileDataAccessService userProfileDataAccessService;

	@Autowired
	public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
		super();
		this.userProfileDataAccessService = userProfileDataAccessService;
	}
	
	List<UserProfile> getUserProfiles(){
		return userProfileDataAccessService.getUserProfiles();
	}

	public void uploadUserProfileImage(UUID userProfileId, MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

}