package com.onlineshopping.notification.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alert_info")
public class User {

	@Id
	private String id;

	// @NotBlank(message="email is mandatory")
	private String email;
	private String startPrice;
	private String contactNo;
	private String dropPercent;
	private String expectedPrice;
	// @NotBlank(message="anyprice is mandatory")
	private String anyPrice;
	private String stop;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDropPercent() {
		return dropPercent;
	}

	public void setDropPercent(String dropPercent) {
		this.dropPercent = dropPercent;
	}

	public String getExpectedPrice() {
		return expectedPrice;
	}

	public void setExpectedPrice(String expectedPrice) {
		this.expectedPrice = expectedPrice;
	}

	public String getAnyPrice() {
		return anyPrice;
	}

	public void setAnyPrice(String anyPrice) {
		this.anyPrice = anyPrice;
	}

	public String getStop() {
		return stop;
	}

	public void setStop(String stop) {
		this.stop = stop;
	}

}
