package com.bezkoder.spring.jpa.postgresql.repository;

public class Calculator {

    public int sum(int a, int b){

        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public double divide(int a, int b){
        return (double)a/b;
    }


}
