package domain;

import java.util.HashMap;

public class Caesar extends EncriptieStrategy {

    private HashMap<String, String> sleutel = new HashMap<>();



    public Caesar(){
        super();

        sleutel.put("a","b");

    }

    @Override
    public void encrypteer(String string) {

    }

    @Override
    public String decrypteer() {
        return null;
    }
}
