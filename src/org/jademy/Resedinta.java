package org.jademy;

public class Resedinta extends Localitate {

    private int pointValue=5;

    public Resedinta(String name) {
        super(name);

    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
