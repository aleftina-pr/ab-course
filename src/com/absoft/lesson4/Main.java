package com.absoft.lesson4;

public class Main {
    public static void main(String[] args) {
        printRobot(new BalletDancingRobot());
        printRobot(new FolkDancingRobot());

    }

    private static void printRobot(DancingRobot robot) {
        System.out.println("Dance type 1: " + robot.getDanceType1());
        System.out.println("Dance type 2: " + robot.getDanceType2());
        System.out.println("Default dance type: " + robot.getDefaultDanceType());
        System.out.println("=======================\n");
    }
}
