package com.devsuperior.dscatalog.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FieldMessage {
    //corpo da mensagem de erro de cada campo

    private String field;
    private String message;
}
