package ohtu.verkkokauppa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
    public class Viitegeneraattori implements ViiteGeneraattoriInterface{


    private int seuraava;
    @Autowired
    private Viitegeneraattori(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
}
