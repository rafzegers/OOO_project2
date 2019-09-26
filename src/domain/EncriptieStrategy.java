package domain;

public abstract class EncriptieStrategy {

    public EncriptieStrategy(){

    }


    public abstract String encrypteer(String string);


    public abstract String decrypteer(String string);


}
