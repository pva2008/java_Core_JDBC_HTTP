package com.vpdev.http.validator;

public interface Validator<T> {

    ValidationResult isValid(T object);
}