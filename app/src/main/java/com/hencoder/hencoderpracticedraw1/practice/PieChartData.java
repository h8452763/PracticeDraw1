package com.hencoder.hencoderpracticedraw1.practice;

/**
 * Created by jiang on 2018/3/1.
 */

public class PieChartData {

    private String title;

    private int color;

    private int value;

    private int paddingValue;

    public PieChartData(String title, int color, int value, int paddingValue) {
        this.title = title;
        this.color = color;
        this.value = value;
        this.paddingValue = paddingValue;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPaddingValue() {
        return paddingValue;
    }

    public void setPaddingValue(int paddingValue) {
        this.paddingValue = paddingValue;
    }
}