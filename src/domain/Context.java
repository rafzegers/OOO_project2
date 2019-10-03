package domain;

public class Context {
    private Strategy strategy;
    private String tekst;


    public Context(String tekst){
        this.tekst = tekst;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy(){
        return strategy;
    }

    public String encrypteer(){
        return   strategy.encrypteer(tekst);
    }

    public String decrypteer(){
        return   strategy.decrypteer(tekst);
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
