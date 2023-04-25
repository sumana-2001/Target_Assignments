package com.targetindia.programs;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private String address;
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return this.name + " "+this.address;
    }
}
