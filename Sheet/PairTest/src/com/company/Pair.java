package com.company;

public class Pair <F, S> {
    F first;
    S second;
    public Pair(){

    }
    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
