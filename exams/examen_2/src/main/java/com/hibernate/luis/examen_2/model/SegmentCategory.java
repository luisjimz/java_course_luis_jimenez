package com.hibernate.luis.examen_2.model;

public enum SegmentCategory {
    SEDAN("SEDAN"),
    HATCHBACK("HATCHBACK"),
    COUPE("COUPE");

    private String segment;

    private SegmentCategory(String segment){
        this.segment = segment;
    }

    public String getSegment(){
        return this.segment;
    }
}
