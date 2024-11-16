package com.devjd.projectapp.emun;

import lombok.Getter;

@Getter
public enum ImportanceLevel {
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    CRITICAL("CRITICAL");

    private final String level;

    private ImportanceLevel(String level) {
        this.level = level;
    }
}
