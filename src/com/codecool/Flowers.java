package com.codecool;

public abstract class Flowers {

    private int nutrients;
    private boolean isDead;
    private int needEmission;


    public boolean isDead() {
        return isDead;
    }

    public int emissionNeeded(){
        return needEmission;
    }

    public void growing(Emission emission){

    }

    public int getNutrients() {
        return nutrients;
    }
}
