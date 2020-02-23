package com.telstra.purple.knockknock.exercise.utils;

public enum TriangleType {
    EQUILATERAL("Equilateral"),
    ISOSCELES("Isosceles"),
    SCALENE("Scalene"),
    ERROR("Error");

    private String type;

    private TriangleType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
