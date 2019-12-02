package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }


    @Override
    public void suorita(){
        s.nollaa();
        tuloskentta.clear();
        syotekentta.clear();
        nollaus.disableProperty().set(false);
        undo.disableProperty().set(true);
    }
    @Override
    public void peru(){
        tuloskentta.setText(aikaisempi);
        nollaus.disableProperty().set(true);
        undo.disableProperty().set(false);
    }
}
