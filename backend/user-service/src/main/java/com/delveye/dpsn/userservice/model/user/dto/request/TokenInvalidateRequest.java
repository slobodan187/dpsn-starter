package com.delveye.dpsn.userservice.model.user.dto.request;

import jakarta.validation.constraints.NotBlank;

public record TokenInvalidateRequest(

	@NotBlank
	String accessToken,

	@NotBlank
	String refreshToken
) {
}
