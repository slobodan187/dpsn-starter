package com.delveye.dpsn.userservice.model.user.entity;

import com.delveye.dpsn.userservice.model.common.entity.BaseEntity;
import com.delveye.dpsn.userservice.model.user.enums.TokenClaims;
import com.delveye.dpsn.userservice.model.user.enums.UserStatus;
import com.delveye.dpsn.userservice.model.user.enums.UserType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;

	private String email;

	@JsonIgnore
	private String password;

	private String firstName;

	private String lastName;

	@Column(
		name = "phone_number",
		length = 20
	)
	private String phoneNumber;


	@Enumerated(EnumType.STRING)
	private UserType userType;

	@Builder.Default
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus = UserStatus.ACTIVE;

	/**
	 * Constructs a map of claims based on the user's attributes.
	 * This map is typically used to create JWT claims for the user.
	 * @return a map of claims containing user attributes
	 */
	public Map<String, Object> getClaims() {

		final Map<String, Object> claims = new HashMap<>();

		claims.put(TokenClaims.USER_ID.getValue(), this.id);
		claims.put(TokenClaims.USER_TYPE.getValue(), this.userType);
		claims.put(TokenClaims.USER_STATUS.getValue(), this.userStatus);
		claims.put(TokenClaims.USER_FIRST_NAME.getValue(), this.firstName);
		claims.put(TokenClaims.USER_LAST_NAME.getValue(), this.lastName);
		claims.put(TokenClaims.USER_EMAIL.getValue(), this.email);
		claims.put(TokenClaims.USER_PHONE_NUMBER.getValue(), this.phoneNumber);

		return claims;

	}

}
