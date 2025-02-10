package com.delveye.dpsn.authservice.model.auth.dto.response;

public record TokenResponse(

	String accessToken,
	Long accessTokenExpiresAt,
	String refreshToken
) {

}
