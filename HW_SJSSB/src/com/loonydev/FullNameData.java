package com.loonydev;

public class FullNameData {

    private String mSurname;
    private String mName;
    private String mPatronymic;

    public FullNameData(String surname, String name, String patronymic) {
        this.mSurname = surname;
        this.mName = name;
        this.mPatronymic = patronymic;
    }

    // -- Setters
    public void setSurname(String surname) {
        this.mSurname = surname;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public void setPatronymic(String patronymic) {
        this.mPatronymic = patronymic;
    }

    // -- Getters
    public String getSurname() {
        return this.mSurname;
    }

    public String getName() {
        return this.mName;
    }

    public String getPatronymic() {
        return this.mPatronymic;
    }
}
