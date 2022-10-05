package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

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