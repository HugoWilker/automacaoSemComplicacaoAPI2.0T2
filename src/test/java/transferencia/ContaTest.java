package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvioSantos;

    @BeforeEach
    void setUp() {

        xuxa = new Cliente("Xuxa", "12345678900", "1234567");
        silvioSantos = new Cliente("Silvio Santos", "12345678901", "1234568");

        contaXuxa = new Conta("0025", "1025", 2500.00, xuxa);
        contaSilvioSantos = new Conta("0026", "102", 3500.00, silvioSantos);

    }



    @Test
    public void realizarTransacao() {

        contaXuxa.realizarTransferencia(1000.00, contaSilvioSantos);
        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvioSantos.getSaldo());
    }

    @Test
         public void validarTransacaoInvalida(){

            contaXuxa.realizarTransferencia(3000.00, contaSilvioSantos);

            boolean resultado = contaXuxa.realizarTransferencia(3000.00, contaSilvioSantos);
            assertFalse(resultado);

        }



    }

