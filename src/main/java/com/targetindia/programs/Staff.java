package com.targetindia.programs;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter

public class Staff extends Person{
    private String school;
    private double pay;

    Staff(String name, String address,String school,double pay) {
        super(name, address);
        setSchool(school);
        setPay(pay);
    }

    @Override
    public String toString(){
        return getName() + " " + getAddress()+" " + getSchool()+" " + getPay();
    }
}
