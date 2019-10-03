package domain;

public class Caesar extends EncriptieStrategy{
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private int n = (int) Math.floor(Math.random()*26);

    public String encrypteer(String message){
        return cipher(message,this.n);
    }

    public String decrypteer(String message){
        return cipher(message,26 - this.n);
    }

    private String cipher(String message,int n){
        String result = "";
        for (char c : message.toLowerCase().toCharArray()){
            if (alphabet.indexOf(c) >= 0){
                int index = (alphabet.indexOf(c) + n) % 26;
                result += alphabet.charAt(index);
            }
            if (c == ' '){
                result += " ";
            }
        }
        return result;
    }

    @Override
    public String toString(){
        return "Caeser";
    }

    public void setN(int n){
        this.n = (n % 26 + 26) % 26;
    }
}