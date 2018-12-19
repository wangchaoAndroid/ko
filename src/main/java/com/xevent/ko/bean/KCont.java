package com.xevent.ko.bean;

import java.io.Serializable;

public class KCont implements Serializable {
    private boolean isKo;

    private String startTime;

    private String endTime;

    public boolean isKo() {
        return isKo;
    }

    public void setKo(boolean ko) {
        isKo = ko;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
