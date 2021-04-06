package com;

public class Calculator {

    private double ret = 0.0;
    public void add(double a) {
        ret += a;
    }
    public void sub(double a) {
        ret -= a;
    }
    public void muti(double a) {
        ret *= a;
    }
    public void div(double a) {
        ret /= a;
    }
    public void clear(){
        ret = 0;
    }
    public double getRet() {
        return ret;
    }
}
