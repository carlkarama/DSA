package com.dsa.streams.timetable;

public class Mark {

    private int markId;
    private int mark;

    public Mark(int markId, int mark) {
        this.markId = markId;
        this.mark = mark;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
