package com.targetindia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Square extends Rectangle{
     Square(double side){
         super(side,side);
     }
     Square(double side, String color,boolean filled){
         setLength(side);
         setWidth(side);
         setColor(color);
         setFilled(filled);
     }

    public String toString(){
        return super.toString() + "|--|--|" + "Square";
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
