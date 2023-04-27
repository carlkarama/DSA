package com.dsa.queue.nightclub;

public class HipHopNightGoers {

    private int photoID;
    private int age;
    private boolean isFashionable;
    private String name;
    private int status;

    public HipHopNightGoers(int photoID, int status, String name, int age, boolean isFashionable) {
        this.photoID = photoID;
        this.name = name;
        this.age = age;
        this.status = status;
        this.isFashionable = isFashionable;
    }

    public boolean isFashionable() {
        return isFashionable;
    }

    public void setFashionable(boolean fashionable) {
        isFashionable = fashionable;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPhotoID() {
        return photoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsFashionable() {
        return isFashionable;
    }

    public void setIsFashionable(boolean isFashionable) {
        this.isFashionable = isFashionable;
    }

    @Override
    public String toString() {
        return "HipHopNightGoers{" +
                "photoID=" + photoID +
                ", age=" + age +
                ", isFashionable=" + isFashionable +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
