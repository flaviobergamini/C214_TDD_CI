package br.inatel.c14.teste;

import br.inatel.c14.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteBuscaInimigo {
    InimigoService service;
    BuscaInimigo buscaInimigo;


    @Before
    public void setup(){
        service = new MockInimigoService();
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testeBuscaInimigoSkeleton(){
        Inimigo inimigo = buscaInimigo.buscaInimigo(10);
        assertEquals("SKELETON", inimigo.getNome());
    }

    @Test
    public void testeBuscaInimigo20(){
        Inimigo inimigo20 = buscaInimigo.buscaInimigo(20);
        assertEquals("Dragao", inimigo20.getNome());
    }

    @Test
    public void testeBuscaInimigo(){
        Inimigo inimigo = buscaInimigo.buscaInimigo(0);
        assertEquals("Aranha", inimigo.getNome());
    }

    @Test
    public void testeBuscaInimigoM(){
        Inimigo inimigoM = buscaInimigo.buscaInimigo(-30);
        assertEquals("Inexistente", inimigoM.getNome());
    }

    @Test
    public void testeInimigoExiste(){

        assertEquals(true, service.array(20)
        );
    }

    @Test
    public void testeInimigoNaoExiste(){
        assertEquals(false, service.array(40));
    }
}
