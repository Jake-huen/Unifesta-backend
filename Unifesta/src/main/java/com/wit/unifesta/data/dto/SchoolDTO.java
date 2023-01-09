package com.wit.unifesta.data.dto;

public class SchoolDTO {

    private long schoolID; // 학교 아이디
    private String schoolName; // 학교 이름
    private String festivalCalendar; // 축제 일정
    private String festivalDescription; // 축제 소개

    public long getSchoolID() {
        return schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getFestivalCalendar() {
        return festivalCalendar;
    }

    public void setFestivalCalendar(String festivalCalendar) {
        this.festivalCalendar = festivalCalendar;
    }

    public String getFestivalDescription() {
        return festivalDescription;
    }

    public void setFestivalDescription(String festivalDescription) {
        this.festivalDescription = festivalDescription;
    }

    @Override
    public String toString() {
        return "SchoolDTO{" +
                "schoolID=" + schoolID +
                ", schoolName='" + schoolName + '\'' +
                ", festivalCalendar='" + festivalCalendar + '\'' +
                ", festivalDescription='" + festivalDescription + '\'' +
                '}';
    }
}
