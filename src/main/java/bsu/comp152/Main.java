package bsu.comp152;

import java.util.Random;

public class Main {

    // A class constant is a value you don't want to change.
    // A convention is to use all caps for a constant name.
    public static final int STANDARD_DIE = 6;

    public static void main(String[] args) {
        // Compiler complains if you try to change a constant.
        // STANDARD_DIE = 7;
        System.out.println(returnRoll(STANDARD_DIE));
        System.out.println("Your wages: " +
                returnWages(40, 5, 20));
        System.out.println("Your wages: " +
                returnWages(39.5, 0, 15));
    }

    /**
     * Static method dieRoll -
     * Print the result of rolling a six-sided die.
     * @param
     */
    public static void dieRoll() {
        /*
         * This static method is in the class Week02.
         */
        Random rand = new Random();
        System.out.println("The die roll is a " +
                rand.nextInt(1, 7));
    }

    /**
     * multiSidedDieRoll -
     * Print the result of rolling a die with sides
     * faces.
     * @param sides
     */
    public static void multiSidedRoll(int sides){
        Random rand = new Random();
        System.out.println("The die roll is a " +
                rand.nextInt(1, sides+1));
    }

    /**
     * Return the result of rolling a die with sides
     * faces.
     * @param sides
     * @return
     */
    public static int returnRoll (int sides){
        Random rand = new Random();
        return rand.nextInt(1, sides+1);
    }

    /**
     * returnWages-
     * Method to calculate and return wages based on
     * initial hours, overtime hours, hourlyWage,
     * assuming time and a half for overtime.
     */
    public static double returnWages(double initialHours,
                                     double overTimeHours,
                                     double hourlyWage){
        return initialHours*hourlyWage +
                overTimeHours*1.5*hourlyWage;
    }
}