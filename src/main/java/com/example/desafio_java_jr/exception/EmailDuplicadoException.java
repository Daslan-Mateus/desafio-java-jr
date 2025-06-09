package com.example.desafio_java_jr.exception;

public class EmailDuplicadoException extends  RuntimeException {
    public EmailDuplicadoException(String message) {
        super(message);
    }
}
