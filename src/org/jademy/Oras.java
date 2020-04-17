package org.jademy;

public class Oras extends Localitate  {

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public Oras(String name) {
        super(name);

    }

    private int pointValue=5;

    public String  toString(){
        return getName();
    }
}
