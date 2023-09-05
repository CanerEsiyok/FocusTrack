package com.blackstar.utilities;

public class Browser {
    public static void sleep(int seconds){
        int miliSeconds=seconds*1000;
        try {
            Thread.sleep(miliSeconds);
        }catch (Exception e){}
    }
}
