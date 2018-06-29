package com.prookie.pinedlistviewdemo;




/**
 * 开门记录
 * Created by brin on 2018/5/25.
 */

public class OpenHistory  {

    private String Date;
    private String Time;
    private String type;
    private String opener;


    public OpenHistory() {
    }

    public OpenHistory(String date, String time, String type, String opener) {
        Date = date;
        Time = time;
        this.type = type;
        this.opener = opener;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOpener() {
        return opener;
    }

    public void setOpener(String opener) {
        this.opener = opener;
    }


    @Override
    public String toString() {
        return "OpenHistory{" +
                "Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", type='" + type + '\'' +
                ", opener='" + opener + '\'' +
                '}';
    }


}
