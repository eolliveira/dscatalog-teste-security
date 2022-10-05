package com.devsuperior.dscatalog.resources.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ValidationError extends StandardError {

    //corpo json de erro customizado
    private List<FieldMessage> errors = new ArrayList<>();

    public void addError(String field, String defaultMessage) {
        errors.add(new FieldMessage(field, defaultMessage));
    }
}
