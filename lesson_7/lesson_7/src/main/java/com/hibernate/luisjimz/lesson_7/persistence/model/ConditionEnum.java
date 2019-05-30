package com.hibernate.luisjimz.lesson_7.persistence.model;

import lombok.Getter;

@Getter
public enum ConditionEnum {
    REGULAR ("REGULAR"),
    REMOTE ("REMOTE"),
    FREE ("FREE");
    private String value;

    ConditionEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
