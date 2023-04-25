package com.targetindia.programs;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    Student(String name,String address,String program,int year,double fee){
        super(name,address);
        setProgram(program);
        setYear(year);
        setFee(fee);
    }
    @Override
    public String toString(){
        return getName()+" "+ getAddress()+" " + getProgram()+" " + getYear()+" " + getFee();
    }
}
