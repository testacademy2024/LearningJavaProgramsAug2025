package ex_22082025.accessModifiers.criminal;

import ex_22082025.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
       Cop c=new Cop(100);
        System.out.println(c.gun); //instance variable is private so Thief cannot access it now
       c.canIShoot(); // method is private so Thief cannot access it no


    }
}
