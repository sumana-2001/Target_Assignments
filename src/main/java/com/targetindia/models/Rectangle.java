package com.targetindia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(double w,double l,String c,boolean f){
        super(c,f);
        setWidth(w);
        setLength(l);
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public String toString(){
        return super.toString() + "|--|--|" + "Rectangle";
    }
}
