package com.codecool;

import static com.codecool.Emission.ALFA;
import static com.codecool.Emission.NONE;

public class Deltafa extends Flowers {

    private int nutrients;
    private boolean isDead;
    private int deltaNeeded;

    Deltafa(int nutrients){
        this.nutrients = nutrients;
    }

    @Override
    public void growing(Emission emission) {
        if (emission == ALFA){
            nutrients -= 3;
        } else if (emission == NONE){
            nutrients -= 1;
        } else {
            nutrients += 4;
        }
    }

    @Override
    public int getNutrients() {
        return nutrients;
    }

    @Override
    public int emissionNeeded() {
        if (nutrients < 5 && nutrients > 0){
            deltaNeeded = 4;
        } else if (nutrients >= 5 && nutrients <= 10) {
            deltaNeeded = 1;
        } else {
            deltaNeeded = 1;
        }
        return deltaNeeded;
    }

    @Override
    public boolean isDead() {
        if (nutrients == 0){
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }
}
