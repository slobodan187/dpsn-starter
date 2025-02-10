package com.delveye.dpsn.userservice.model.user.dto.request;

import jakarta.validation.constraints.NotBlank;

public record TokenRefreshRequest(

	@NotBlank
	String refreshToken
) {
}
