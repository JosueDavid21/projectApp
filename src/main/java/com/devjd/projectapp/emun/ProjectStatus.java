package com.devjd.projectapp.emun;

import lombok.Getter;

@Getter
public enum ProjectStatus {
    PENDING("PENDING"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED"),
    CANCELLED("CANCELLED"),
    DELAYED("DELAYED"),
    WAITING("WAITING"),
    REJECTED("REJECTED");

    private final String status;

    ProjectStatus(String status) {
        this.status = status;
    }

}
