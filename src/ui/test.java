package ui;

import domain.Caesar;
import domain.Strategy;

public class test {
    public static void main(String[]args){

        Strategy a = new Caesar();

        System.out.println(a.encrypteer("hallo") );

        System.out.println(a.decrypteer("ohssv") );


    }
}
