package com.targetindia.programs;

import lombok.extern.slf4j.Slf4j;
import java.util.Scanner;
@Slf4j
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Circle,Cylinder \n 2. Person,Student and Staff");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                Circle[] c = {
                    new Cylinder(12.11),
                    new Cylinder(12.34, 11),
                    new Cylinder(12.34, 10, "blue")
                };
                for (Circle cc : c) {
                    log.trace("Area of Circle with radius : {} is {} sq units", cc.getRadius(), cc.getArea());
                    if (cc instanceof Cylinder) {
                       Cylinder c1 = (Cylinder) cc;
                       log.trace("Volume of cylinder is {} units", c1.getVolume(c1.getRadius()));
                     }
                 }
                 break;

            case 2:
                Person[] p = {
                        new Student("shyam","Banglore","java fundamentals",2010,4500.0),
                        new Staff("Anand","Banglore","DPS",35000.0),
                        new Staff("Umesh","Banglore","National public school",42000.0),
                        new Student("Suresh","Hassan","java fundamentals",2012,4750),
                        new Student("kiran","Vasco","Reactjs",2017,12500.0)
                };

                for (Person pp : p) {
                    if(pp instanceof Student) {
                        log.trace("Details of Student are : {}", pp);
                    }
                    if (pp instanceof Staff) {
                        log.trace("Details of Staff are : {}",pp);
                    }
                }
                break;

            default:
                System.out.println("Have a good day!!");
                break;

        }
    }
}
