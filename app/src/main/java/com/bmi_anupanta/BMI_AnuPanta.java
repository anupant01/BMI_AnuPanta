package com.bmi_anupanta;

public class BMI_AnuPanta {

    private double height;
    private double weight;

    public BMI_AnuPanta(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double Calculate(){
        return weight/(height/100 * height/100);
    }
}
