package com.targetindia.programs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import java.lang.Math.*;

@Slf4j
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Circle {
      private double radius = 1.0;
      private String color = "red";
      Circle(double radius){
          this.radius = radius;
      }

      public double getArea() {
            return Math.PI * Math.pow(radius,2);
      }
}
