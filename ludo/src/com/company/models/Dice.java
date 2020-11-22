package com.company.models;


import com.company.constants.LudoConstants;

public class Dice {
    public static int roll(){
        return LudoConstants.random.nextInt(6) + 1;
    }
}
