package org.jademy;

public class Localitate  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Localitate(String name) {
        this.name = name;

    }
    public String toString(){
        return getName();
    }


}



