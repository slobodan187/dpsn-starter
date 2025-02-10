package com.delveye.dpsn.authservice.model.auth.dto.request;

import jakarta.validation.constraints.NotBlank;

public record TokenInvalidateRequest(

	@NotBlank
	String accessToken,

	@NotBlank
	String refreshToken
) {

}
