package edu.cs.birzeit.cv;

public class Person_Info {
    String name,email,university,education,WOE;
    int phone;//WOF means work of experience

    public Person_Info(){

    }

    public Person_Info(String name, String email, String major, int phone, String WOE, String education) {
        this.name = name;
        this.email = email;
        this.university = major;
        this.phone = phone;
        this.WOE = WOE;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getuniversity() {
        return university;
    }

    public void setuniversity(String university) {
        this.university = university;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getWOE() {
        return WOE;
    }

    public void setWOE(String WOE) {
        this.WOE = WOE;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person_Info{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", major='" + university + '\'' +
                ", phone=" + phone +
                ", WOE=" + WOE +
                ", education=" + education +
                '}';
    }
}
