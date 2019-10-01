package domain;

public class Spiegel {


    public Spiegel(){
    }

    public String spiegel(String tekst){
        String tussentekst = "";
        for (int i = tekst.length()-1; i >= 0 ; i--)
            tussentekst += tekst.charAt(i);
        return tussentekst;
    }
}
