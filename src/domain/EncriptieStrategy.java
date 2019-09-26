package domain;

public abstract class EncriptieStrategy {

    public EncriptieStrategy(){

    }


    public abstract void encrypteer(String string);


    public abstract String decrypteer();


}
