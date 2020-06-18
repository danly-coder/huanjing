package com.example.demo2.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostGraduate {
    private int id;
    private String banji;
    private String name;
    private String admitSchool;
    private String admitMajor;
    private String motto;
    public int getId() {
        return id;
    }

    public String getBanji() {
        return banji;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmitSchool(String admitSchool) {
        this.admitSchool = admitSchool;
    }

    public void setAdmitMajor(String admitMajor) {
        this.admitMajor = admitMajor;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public String getAdmitSchool() {
        return admitSchool;
    }

    public String getAdmitMajor() {
        return admitMajor;
    }

    public String getMotto() {
        return motto;
    }

}
