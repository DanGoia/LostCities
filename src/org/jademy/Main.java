package org.jademy;

public class Main {
    public static void main(String[] args) {
        Jucator user = new Jucator("user");
        Jucator calculator = new Jucator("calculator");
        Oras o1 = new Oras("sm");
        Oras o2 = new Oras("mm");
        Oras o3= new Oras("bh");
        Resedinta r1 = new Resedinta("CJ");
        Resedinta r2 = new Resedinta("TM");
        Resedinta r3 = new Resedinta("SB");
        Resedinta r4 = new Resedinta("AB");

        Oras o4 = new Oras("aa");
        Oras o5 = new Oras("xx");
        Oras o6= new Oras("yy");
        Resedinta r5 = new Resedinta("ZZ");
        Resedinta r6 = new Resedinta("EE");
        Resedinta r7 = new Resedinta("TT");
        Resedinta r8 = new Resedinta("DD");

        user.setareLista(o1,o2,o3,r1,r2,r3,r4);
        calculator.setareLista(o4,o5,o6,r5,r6,r7,r8);
        user.display();
        calculator.display();
   

    }
}
