package ohtu.verkkokauppa;

public interface VarastoInterface {

    int saldo(int id);

    Tuote haeTuote(int id);

    void otaVarastosta(Tuote tuote);

    void palautaVarastoon(Tuote tuote);

}
