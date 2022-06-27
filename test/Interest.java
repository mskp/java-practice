package com.sush.test;

public class Interest {

    public static void main(String[] args) {
        System.out.printf("Simple interest: %.2f\n", simpleInterest(4045.50f, 4.9f, 0.6f));
        System.out.printf("Compound interest: %.2f", compoundInterest(6000, 9, 2));
    }

    /**
     * Simple interest
     *
     * @param principleAmount Principle amount (float)
     * @param rateOfInterest            Rate of interest (float)
     * @param time            No. of years (float)
     * @return (pAmount * rate * time)/100
     */
    public static float simpleInterest(float principleAmount, float rateOfInterest, float time) {
        return (principleAmount * rateOfInterest * time) / 100;
    }

    /**
     * Compound interest
     *
     * @param principleAmount Principle amount (float)
     * @param rateOfInterest            Rate of interest (float)
     * @param time            No. of years (float)
     * @return principleAmount * (1 + (rate / 100)) ^ time
     */
    public static float compoundInterest(int principleAmount, float rateOfInterest, int time) {
        return (float) ((float) principleAmount * Math.pow((1 + (rateOfInterest / 100)), time)) - principleAmount;
    }
}