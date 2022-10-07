package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserInsertValid;

import java.io.Serializable;

@UserInsertValid
public class UserInsertDTO extends UserDTO implements Serializable {

    private String password;

    public UserInsertDTO (){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
