package com.joenpaco.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.SEE_OTHER)
public class NotDateParseException extends RuntimeException {

	public NotDateParseException(String message) {
		super(message);
	}

}
