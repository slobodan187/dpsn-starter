package com.delveye.dpsn.userservice.model.user.dto.response;

public record TokenResponse(
	String accessToken,
	String refreshTokenExpiresAt,
	String refreshToken
) {
}
