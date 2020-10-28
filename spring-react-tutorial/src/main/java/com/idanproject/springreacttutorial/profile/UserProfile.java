package com.idanproject.springreacttutorial.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {

	private UUID userProfileId;
	private String UserName;
	private String userProfileImageLink;
	
	
	public UserProfile(UUID userProfileId, String userName, String userProfileImageLink) {
		super();
		this.userProfileId = userProfileId;
		this.UserName = userName;
		this.userProfileImageLink = userProfileImageLink;
		
	}


	public UUID getUserProfileId() {
		return userProfileId;
	}


	public void setUserProfileId(UUID userProfileId) {
		this.userProfileId = userProfileId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public Optional <String> getUserProfileImageLink() {
		return Optional.ofNullable(userProfileImageLink);
	}


	public void setUserProfileImageLink(String userProfileImageLink) {
		this.userProfileImageLink = userProfileImageLink;
	}


	@Override
	public int hashCode() {
		return Objects.hash(UserName, userProfileId, userProfileImageLink);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		return Objects.equals(UserName, other.UserName) && Objects.equals(userProfileId, other.userProfileId)
				&& Objects.equals(userProfileImageLink, other.userProfileImageLink);
	}
	
	

	
	
}
