package com.lcwd.gateway.models;

import lombok.*;

import java.util.Collection;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String userId;
    private String accessToken;
    private String refreshToken;

    private long expireAt;

    private Collection<String> authorities;

	public void setUserId(String email) {
		// TODO Auto-generated method stub
		
	}

	public void setAccessToken(String tokenValue) {
		// TODO Auto-generated method stub
		
	}

	public void setRefreshToken(String tokenValue) {
		// TODO Auto-generated method stub
		
	}

	public void setExpireAt(long epochSecond) {
		// TODO Auto-generated method stub
		
	}

	public void setAuthorities(List<String> authorities2) {
		// TODO Auto-generated method stub
		
	}
}
