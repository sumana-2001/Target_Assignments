package com.targetindia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Circle extends Shape{
    private double radius = 1.0;
    Circle(double r,String c,boolean f){
        super(c,f);
        this.radius = r;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    public String toString(){
        return super.toString() + "|--|--|" + "Circle";
    }

}
