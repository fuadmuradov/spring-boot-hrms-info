package com.hrmsinformationmanagement.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RelationTypeEnum {
    FATHER("Father"),
    MATHER("Mather"),
    SPOUSE("Spouse"),
    CHILD("Child");

    private final String label;



}
