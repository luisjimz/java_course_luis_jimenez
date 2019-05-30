package com.springhibernate.demo.model;

public enum AcademicStatus {
    REGULAR("REGULAR"),
    EXTERNAL("EXTERNAL"),
    REMOTE("REMOTE");

    private String status;

    AcademicStatus(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }

}
