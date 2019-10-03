package ui;

import domain.Caesar;
import domain.Context;
import domain.Spiegel;

public class Main {

    public static void main(String[] args){

        Context spiegelCodeer = new Context("Hallo dit is een van de testen");
        Context spiegeldecodeer = new Context("an tein siuht tid teod");
        Context caeserCodeer = new Context("Hallo dit is een van de testen");

        spiegelCodeer.setStrategy(new Spiegel());
        spiegelCodeer.setStrategy(new Spiegel());
        spiegelCodeer.setStrategy(new Caesar());


        System.out.println(spiegelCodeer.encrypteer());
        System.out.println(spiegeldecodeer.decrypteer());
        System.out.println(caeserCodeer.encrypteer());
    }
}
