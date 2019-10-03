package domain;

import java.util.ArrayList;
import java.util.HashMap;

public class Caesar extends EncriptieStrategy {

    private HashMap<String, String> sleutel = new HashMap<>();



    public Caesar(){
        super();

        sleutel.put("a","b");

    }

    @Override
    public String encrypteer(String string) {


        char[] array = string.toCharArray();

        for(int i=0 ; i < array.length ; i++){
            array[0] = array[1];
        }

        return new String(array) ;
    }

    @Override
    public String decrypteer(String string) {
        return null;
    }
}
