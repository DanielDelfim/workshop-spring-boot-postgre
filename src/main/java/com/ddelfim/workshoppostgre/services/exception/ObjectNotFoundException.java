package com.ddelfim.workshoppostgre.services.exception;

//@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
