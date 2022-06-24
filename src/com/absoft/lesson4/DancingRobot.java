package com.absoft.lesson4;

public abstract class DancingRobot {
    public String getDefaultDanceType(){
        return getDanceType1();
    }
    public abstract String getDanceType1();

    public abstract String getDanceType2();
}
