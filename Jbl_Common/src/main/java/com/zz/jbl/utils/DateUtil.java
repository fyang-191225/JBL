package com.zz.jbl.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zz
 * @version 1.0
 * @date 2020/1/18 21:15
 */
public class DateUtil {
    //获取指定年 的今天
    public static Date addYear(int y){
        //日历 类 完成实例化
        Calendar calendar=Calendar.getInstance();
        //计算日期
        calendar.add(Calendar.YEAR,y);
        return calendar.getTime();
    }

    //获取指定今天
    public static Date addDays(int days){
        //日历 类 完成实例化
        Calendar calendar=Calendar.getInstance();
        //计算日期
        calendar.add(Calendar.DAY_OF_MONTH,days);
        return calendar.getTime();
    }

    //获取今日的  date
    public static Date getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

    //获取今日的  date
    public static Date getDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(sdf.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
            return date;
        }
    }
}
