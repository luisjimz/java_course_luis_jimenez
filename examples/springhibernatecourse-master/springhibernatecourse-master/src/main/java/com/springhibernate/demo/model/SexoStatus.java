package com.springhibernate.demo.model;

public enum SexoStatus {

    HOMBRE("HOMBRE"),
    MUJER("MUJER");

    private String sexo;

    SexoStatus(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

}
