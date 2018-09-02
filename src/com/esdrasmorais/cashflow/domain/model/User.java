
package com.esdrasmorais.cashflow.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="User")
public class User {
	@Id
	private Long id;
	private String name;
	private String email;
	private PhoneNumber mobile;

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
