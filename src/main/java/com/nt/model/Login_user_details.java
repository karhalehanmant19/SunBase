package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="login_user_details")
@Data
public class Login_user_details {

	@Id
	private String login_id;
	private String password;
	
}
