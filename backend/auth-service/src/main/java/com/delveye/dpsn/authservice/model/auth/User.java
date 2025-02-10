package com.delveye.dpsn.authservice.model.auth;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
public class User {

	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String userStatus;
	private String userType;
}
