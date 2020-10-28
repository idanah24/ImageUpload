package com.idanproject.springreacttutorial.bucket;

public enum BucketName {

	PROFILE_IMAGE("idan-aws-tutorial");
	
	private final String bucketName;
	
	BucketName(String bucketName)
	{
		this.bucketName = bucketName;
	}
	
	public String getBucketName() 
	{
		return bucketName;
	}
	
}
