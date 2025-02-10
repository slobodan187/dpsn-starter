package com.delveye.dpsn.authservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.delveye.dpsn.authservice.client.UserServiceClient;
import com.delveye.dpsn.authservice.model.auth.dto.request.TokenInvalidateRequest;
import com.delveye.dpsn.authservice.model.common.dto.response.CustomResponse;
import com.delveye.dpsn.authservice.service.LogoutService;

/**
 * Implementation of the {@link LogoutService} interface.
 * Handles the logic for user logout by invalidating tokens via the
 * {@link UserServiceClient}.
 */
@Service
@RequiredArgsConstructor
public class LogoutServiceImpl implements LogoutService {

	private final UserServiceClient userServiceClient;

	/**
	 * Logs out a user by invalidating the provided tokens.
	 *
	 * @param tokenInvalidateRequest the request containing the access and refresh
	 *                               tokens to be invalidated
	 * @return a {@link CustomResponse} indicating the result of the logout
	 *         operation
	 */
	@Override
	public CustomResponse<Void> logout(TokenInvalidateRequest tokenInvalidateRequest) {
		return userServiceClient.logout(tokenInvalidateRequest);
	}

}
