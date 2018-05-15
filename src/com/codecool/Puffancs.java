package com.codecool;

import static com.codecool.Emission.ALFA;
import static com.codecool.Emission.NONE;

public class Puffancs extends Flowers {


    private int nutrients;
    private boolean isDead;
    private int alfaNeeded;

    Puffancs(int nutrients){
        this.nutrients = nutrients;

    }

    @Override
    public void growing(Emission emission) {
        if (emission == ALFA){
            nutrients += 2;
        } else if (emission == NONE){
            nutrients -= 1;
        } else {
            nutrients -= 2;
        }
    }

    @Override
    public int emissionNeeded() {
        alfaNeeded = 10 - nutrients;
        return alfaNeeded;
    }

    @Override
    public int getNutrients() {
        return nutrients;
    }

    @Override
    public boolean isDead() {
        if (nutrients < 1 || nutrients > 10 ){
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }
}
