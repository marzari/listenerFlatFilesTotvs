/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.totvs.testeSelecao.parse;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.totvs.testeSelecao.domain.LineSalesFactory;

/**
 *
 * @author tiago.marzari
 */
public class LineParseSalesTest {
    
    public LineParseSalesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of parse method, of class LineParseSales.
     * 003;10;11010;300;3403.30;Diego
     */
    @Test
    public void testParse() {
        System.out.println("LineParseSales/LineSalesFactory TEST");
        String[] data = {"003", "10", "11010", "300", "3403.30", "Pedro"};
        LineParseSales instance = new LineParseSales();
        LineSalesFactory result = (LineSalesFactory) instance.parse(data);
        // ID DA VENDA
        assertEquals(10L, result.getIdSale());
        // NOME DO VENDEDOR
        assertEquals("Pedro", result.getSalesman());
        // SOMATORIO DAS VENDAS
        assertEquals(new BigDecimal("1020990.00"), result.getCost());
    }
    
    /**
     * Test of parse method, of class LineParseSales.
     * 003;08;13410;540;2400.10;Renato
     */
    @Test
    public void testParse2() {
        System.out.println("LineParseSales/LineSalesFactory TEST");
        String[] data = {"003", "08", "13410", "540", "2400.10", "Renato"};
        LineParseSales instance = new LineParseSales();
        LineSalesFactory result = (LineSalesFactory) instance.parse(data);
        // ID DA VENDA
        assertEquals(8L, result.getIdSale());
        // NOME DO VENDEDOR
        assertEquals("Renato", result.getSalesman());
        // SOMATORIO DAS VENDAS
        assertEquals(new BigDecimal("1296054.00"), result.getCost());
    }
}
