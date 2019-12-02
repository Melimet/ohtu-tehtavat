package laskin;

import javafx.scene.control.*;


public abstract class Komento {

    Sovelluslogiikka s;
    TextField syotekentta;
    TextField tuloskentta;
    Button nollaus;
    Button undo;
    String aikaisempi;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaus, Button undo, Sovelluslogiikka s){
        this.s=s;
        this.nollaus=nollaus;
        this.syotekentta=syotekentta;
        this.tuloskentta=tuloskentta;
        this.undo=undo;
        this.aikaisempi="";
    }

    public abstract void suorita();
    public abstract void peru();


}
