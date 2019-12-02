package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Erotus extends Komento {
    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }


    @Override
    public void peru() {
        s.plus(Integer.parseInt(aikaisempi));
        tuloskentta.setText("" + s.tulos());
        undo.disableProperty().set(true);
    }

    @Override
    public void suorita(){
        aikaisempi = syotekentta.getText();
        s.miinus(Integer.parseInt(aikaisempi));
        tuloskentta.setText("" + s.tulos());
        syotekentta.clear();
        undo.disableProperty().set(false);
        nollaus.disableProperty().set(false);
    }
}
