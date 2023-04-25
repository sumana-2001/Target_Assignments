package com.targetindia.programs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import java.lang.Math.*;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cylinder extends Circle{
    private double height = 1.0;

    Cylinder(double r,double h){
        super.setRadius(r);
        this.height = h;
    }
    Cylinder(double r, double h, String c){
        super.setRadius(r);
        super.setColor(c);
        this.height = h;
    }
    public double getVolume(double radius) {
        return Math.PI * Math.pow(radius,2) * this.height;
    }
}
