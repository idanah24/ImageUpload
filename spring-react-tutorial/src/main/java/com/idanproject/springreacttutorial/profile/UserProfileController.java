package com.idanproject.springreacttutorial.profile;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {

	private final UserProfileService userProfileService;
	
	
	@Autowired
	public UserProfileController(UserProfileService userProfileService) {
		super();
		this.userProfileService = userProfileService;
		
	}

	@GetMapping
	public List<UserProfile> getUserProfiles(){
		
		return userProfileService.getUserProfiles();
	}
	
	@PostMapping(
			consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId,
			@RequestParam("file") MultipartFile file) {
		this.userProfileService.uploadUserProfileImage(userProfileId, file);
	}
}
