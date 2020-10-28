package com.idanproject.springreacttutorial.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;




@Configuration
public class AmazonConfig {
	


	@Bean
	public AmazonS3 s3() throws FileNotFoundException, IOException {
		List<List<String>> cred = this.getCredentials();
		AWSCredentials  awsCredentials = new BasicAWSCredentials(cred.get(0).get(1), cred.get(1).get(1));
		return AmazonS3ClientBuilder.standard().withRegion(Regions.EU_WEST_3).withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
	}
	
	private List<List<String>> getCredentials() throws FileNotFoundException, IOException{
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\cred.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split("=");
		        records.add(Arrays.asList(values));
		    }
		}
		catch(Exception e){
			System.out.println("Error while reading credentials");
		}
		return records;
	}
	
}

