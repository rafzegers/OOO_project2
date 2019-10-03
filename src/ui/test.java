package ui;

import domain.Caesar;
import domain.EncriptieStrategy;

public class test {
    public static void main(String[]args){

        EncriptieStrategy a = new Caesar();

        System.out.println(a.encrypteer("hallo") );

        System.out.println(a.decrypteer("ohssv") );


    }
}
