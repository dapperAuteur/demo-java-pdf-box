package com.awe.BuildingRESTServices.bookmarks;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String userId) {
		super("cound not find user '" + userId + "'.");

	}
}
