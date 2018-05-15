package com.codecool;

import static com.codecool.Emission.ALFA;
import static com.codecool.Emission.DELTA;

public class Parabokor extends Flowers {

    private int nutrients;
    private boolean isDead;

    Parabokor(int nutrients){
        this.nutrients = nutrients;
    }

    @Override
    public int getNutrients() {
        return nutrients;
    }

    @Override
    public void growing(Emission emission) {
        if (emission == ALFA || emission == DELTA){
            nutrients += 1;
        } else {
            nutrients -= 1;
        }
    }

    @Override
    public int emissionNeeded() {
        return 0;
    }

    @Override
    public boolean isDead() {
        if (nutrients < 1){
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }
}
