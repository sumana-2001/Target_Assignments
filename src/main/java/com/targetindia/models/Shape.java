package com.targetindia.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Shape {
     private String color  = "red";
     private boolean filled = true;


     public boolean isFilled(){
         return this.filled;
     }

     public String toString(){
         return "| Shape |"+"A shape with color " + this.getColor()+" which is filled : "+ this.isFilled();
     }
}
