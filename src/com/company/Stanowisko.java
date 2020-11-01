package com.company;

public enum Stanowisko {
    DYREKTOR("Dyrektor", 1, "A director is an elected individual who, along with other directors, is responsible for a company's corporate policy."),
    KIEROWNIK("Kierownik", 2, "Managers are responsible for the processes of getting activities completed efficiently with and through other people and setting and achieving the firm's goals through the execution of four basic management functions: planning, organizing, leading, and controlling.");

    private final String title;
    private final int level;
    private final String description;

    Stanowisko(String title, int level, String description){
        this.title = title;
        this.level = level;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
