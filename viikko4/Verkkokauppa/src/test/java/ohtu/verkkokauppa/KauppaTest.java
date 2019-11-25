package ohtu.verkkokauppa;


import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class KauppaTest {


    Pankki pankki;

    Varasto varasto;
    Viitegeneraattori viitegeneraattori;
    Kauppa kauppa;

    @Before
    public void setUp(){
        pankki = mock(Pankki.class);
        varasto = mock(Varasto.class);
        Viitegeneraattori viite = mock(Viitegeneraattori.class);
        when(viite.uusi()).thenReturn(42);
        kauppa = new Kauppa(varasto, pankki, viite);

        when(varasto.saldo(1)).thenReturn(10);
        when(varasto.haeTuote(1)).thenReturn(new Tuote(1, "maito", 5));
        kauppa.aloitaAsiointi();
}

    @Test
    public void ostoksenPaaytyttyaPankinMetodiaTilisiirtoKutsutaan(){

        kauppa.lisaaKoriin(1);
        kauppa.poistaKorista(1);

        verify(varasto, times(1)).palautaVarastoon(any());

    }
}
