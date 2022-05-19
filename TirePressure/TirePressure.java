package TirePressure;

import java.util.Scanner;

public class TirePressure {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Tire tire1 = new Tire(15);    // new object of Tire class
        tire1.checkPressure();
        System.out.println("Current Tire Pressure: " + tire1.getCurrentTirePressure());
    }
}

class Tire {

    static Scanner input = new Scanner(System.in);

    final static int ADD_AMOUNT = 2;
    final static int LET_OUT_AMOUNT = 2;

    private int minTirePressure = 28;
    private int maxTirePressure = 38;
    private int currentTirePressure;

    public Tire(int currentTirePressure) {    // constructor
        this.currentTirePressure = currentTirePressure;    // this keyword? distinguishes between parameter name and property name
    }
    
    public int getCurrentTirePressure() {
        return currentTirePressure;
    }
    
    public void setCurrentTirePressure(int currentTirePressure) {
        this.currentTirePressure = currentTirePressure;
    }
    
    public void checkPressure() {
        System.out.print("Current Tire Pressure: ");
        // get the tire pressure 
        currentTirePressure = input.nextInt();
        do {
            if (currentTirePressure < minTirePressure) {
                currentTirePressure += addAir();
            } else if (currentTirePressure > maxTirePressure) {
                currentTirePressure -= letAirOut();
            } else {
                break;
            }
        } while (true);
        System.out.println("Current Tire Pressure: " + currentTirePressure);
    }

    public int addAir() {
        System.out.println("Adding air " + currentTirePressure);
        return ADD_AMOUNT;
    }

    public int letAirOut() {
        System.out.println("Letting air out " + currentTirePressure);
        return LET_OUT_AMOUNT;
    }

}