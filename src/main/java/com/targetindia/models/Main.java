package com.targetindia.models;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Shape[] s = {
                new Circle(13.4),
                new Circle(19,"Green",true),
                new Rectangle(12,13),
                new Square(),
                new Square(8),
                new Circle(15,"blue",false),
                new Rectangle(12,11,"Violet",false),
                new Rectangle()
        };

        for(Shape ss : s){
            if(ss instanceof Circle){
                log.trace("A Circle with radius of {} which is subclass of {} has an area of {} and perimeter of {} ",((Circle) ss).getRadius(),ss.toString(),((Circle) ss).getArea(),((Circle) ss).getPerimeter());
            }
            if(ss instanceof Rectangle){
                log.trace("A Rectangle with width of {} and length of {} which is subclass of {} has an area of {} and perimeter of {}",((Rectangle) ss).getWidth(),((Rectangle) ss).getLength(),ss.toString(),((Rectangle) ss).getArea(),((Rectangle) ss).getPerimeter());
            }
            if(ss instanceof Square){
                log.trace("A Square with side of {} which is subclass of {} has an area of {} and perimeter of {}",((Rectangle) ss).getWidth(),ss.toString(),((Square) ss).getArea(),((Square) ss).getPerimeter());
            }
        }

    }
}
