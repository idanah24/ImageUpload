package com.idanproject.springreacttutorial.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.idanproject.springreacttutorial.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {

	private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Idan", null));
	}
	
	public List<UserProfile> getUserProfiles(){
		return USER_PROFILES;
	}
	
}
