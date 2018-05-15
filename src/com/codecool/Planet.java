package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    public static Emission dailyEmission;
    public List<Flowers> flowers = new ArrayList<>();


    public void makeFlowers(){
        dailyEmission = Emission.NONE;
        Flowers pufi = new Puffancs(3);
        Flowers delt = new Deltafa(7);
        Flowers para  = new Parabokor(8);
        flowers.add(pufi);
        flowers.add(delt);
        flowers.add(para);
    }

    public void Day(int numOfDays){
        for (int i = 0; i < numOfDays; i++){
            for (Flowers flower: flowers) {
                if (!flower.isDead()) {
                    flower.growing(dailyEmission);
                    if (flower.getClass().getSimpleName().equals("Deltafa")) {
                        dailyEmission.deltaNeeded += flower.emissionNeeded();
                    } else if (flower.getClass().getSimpleName().equals("Puffancs")) {
                        dailyEmission.alfaNeeded += flower.emissionNeeded();
                    }
                }
            }
            dailyEmission = dailyEmission.getEmission();
            print();
        }
    }

    private void print(){
        for (Flowers flower: flowers){
            System.out.println("Type: " + flower.getClass().getSimpleName() + " Nutrients: " + Integer.toString(flower.getNutrients()));
        }
        System.out.println("growing :" + dailyEmission);
    }

    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.makeFlowers();
        planet.Day(3);
    }
}
