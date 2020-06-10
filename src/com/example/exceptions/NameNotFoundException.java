package com.example.exceptions;

public class NameNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1703462842141901817L;

	public NameNotFoundException() {
		super();
	}

	public NameNotFoundException(final String message) {
		super(message);
	}

	public NameNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public NameNotFoundException(final Throwable cause) {
		super(cause);
	}

	protected NameNotFoundException(final String message, final Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
