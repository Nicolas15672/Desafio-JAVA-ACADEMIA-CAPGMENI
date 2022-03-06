import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class TestesDesafioCapgemini {
    @Test
     public void ObterMiedana(){
      java.util.List<Float> numeros = new ArrayList<>();

        numeros.add(9.0f);
        numeros.add(2.0f);
        numeros.add(1.0f);
        numeros.add(4.0f);
        numeros.add(6.0f);
        numeros.add(10.0F);
        numeros.add(7.0F);
        Collections.sort(numeros);
        float resultado = Desafio01.calcularMediana(numeros);
        assertEquals(6,resultado);
    }
   @Test
   public void ContarParesPorDiferencaTest(){
       List<Float> numeros = new ArrayList<>();

       numeros.add(1.0f);
       numeros.add(5.0f);
       numeros.add(3.0f);
       numeros.add(4.0f);
       numeros.add(2.0f);
       Collections.sort(numeros);
       int diferenca = 2;

       float resultado = Desafio02.calcularDiferenca(numeros,diferenca);
          assertEquals(3,resultado);
   }
   @Test
   public void EncriptarTexto(){
        String resultato1 = Desafio03.formatarFrase("tenha um bom dia");
        String resultado2 = Desafio03.formatarFrase("ola mundo");
        assertEquals("taoa eum nmd hbi",resultato1);
        assertEquals("omd luo an",resultado2);
   }
}
