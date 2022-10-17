package app;

import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class RaizTest {
    
    Raiz raiz;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void before() {
        raiz = new Raiz();
    }

    @AfterEach
    public void after() {
        // deixando aqui como forma de documentar que existe.
        System.out.println("AfterEach");
    }


    @Test
    public void verificaCasoBase() {
        double resultado = raiz.raiz(4);
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificaRaizDouble() {
        double resultado = raiz.raiz(5);
        assertEquals(2.2360, resultado, 0.0001);
    }

    @Test
    public void verficaRaizNumeroNegativo() {
        assertThrows(BadRequestException.class, ()->{
            raiz.calcula("-4");
        });
    }
}
