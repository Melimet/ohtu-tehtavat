package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Summa extends Komento {
    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita(){
        aikaisempi = syotekentta.getText();
        s.plus(Integer.parseInt(aikaisempi));
        tuloskentta.setText("" + s.tulos());
        syotekentta.clear();
        undo.disableProperty().set(false);
        nollaus.disableProperty().set(false);
    }
    @Override
    public void peru(){
        s.miinus(Integer.parseInt(aikaisempi));
        tuloskentta.setText("" + s.tulos());
        undo.disableProperty().set(true);
    }
}
