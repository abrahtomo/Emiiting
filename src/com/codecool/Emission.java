package com.codecool;

public enum Emission {
    ALFA, DELTA, NONE;

    public int alfaNeeded;
    public int deltaNeeded;

    public Emission getEmission(){
        if (deltaNeeded-alfaNeeded >= 3){
            return DELTA;
        } else if (alfaNeeded-deltaNeeded >= 3){
            return ALFA;
        } else {
        return NONE;
        }
    }


}
