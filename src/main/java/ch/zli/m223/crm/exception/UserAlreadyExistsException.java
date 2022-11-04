package ch.zli.m223.crm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.IM_USED, reason = "User already exists")
public class UserAlreadyExistsException extends NotraceException {

}
