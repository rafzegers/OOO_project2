package domain;

public class Spiegel implements Strategy{


    public Spiegel(){ }

    private String spiegel(String tekst){
        String tussentekst = "";
        for (int i = tekst.length()-1; i >= 0 ; i--)
            tussentekst += tekst.charAt(i);
         return tussentekst;
    }

    @Override
    public String encrypteer(String string) {
        return this.spiegel(string);
    }

    @Override
    public String decrypteer(String string) {
        return this.spiegel(string);
    }

    @Override
    public String toString(){
        return "Spiegel";
    }
}
