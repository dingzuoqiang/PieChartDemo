package com.dzq.piechart;

import java.text.DecimalFormat;

/**
 * Created by DingZuoQiang on 2018/8/20.
 * 530858106@qq.com
 */

public class PieData {
    private String text;
    private float value;
    private float Angle;
    private float Percentage;
    private int color;
    private float currentStartAngle;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getCurrentStartAngle() {
        return currentStartAngle;
    }

    public void setCurrentStartAngle(float currentStartAngle) {
        this.currentStartAngle = currentStartAngle;
    }

    public String getPercentage() {
        //保留两位小数点
        DecimalFormat decimalFormat = new DecimalFormat("00.00");
        return decimalFormat.format(Percentage * 100) + "%";
    }


    public void setPercentage(float percentage) {
        Percentage = percentage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getAngle() {
        return Angle;
    }

    public void setAngle(float angle) {
        Angle = angle;
    }

    public PieData(String text, float value, int color) {
        this.text = text;
        this.value = value;
        this.color = color;
    }
}
