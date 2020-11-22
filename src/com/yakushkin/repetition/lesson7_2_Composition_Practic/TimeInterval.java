package com.yakushkin.repetition.lesson7_2_Composition_Practic;

public class TimeInterval {

    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public TimeInterval plus(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

    public void printInfo() {
        System.out.println(String.format("%s:%s:%s", hours, minutes, seconds));
    }
}
