package com.delveye.dpsn.userservice.model.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

	@Email(message = "Please enter valid email address")
	@Size(min=7, message = "Minimum email length is 7 characters")
	String email,

	@Size(min = 8, message = "Minimum password length is 8 characters")
	String password,

	@NotBlank(message = "First name is required")
	String firstName,

	@NotBlank(message = "Last name is required")
	String lastName,

	@NotBlank(message = "Phone number is required")
	@Size(min = 11, max = 20)
	String phoneNumber,

	@NotBlank(message = "Role is required")
	String role
) {
}
