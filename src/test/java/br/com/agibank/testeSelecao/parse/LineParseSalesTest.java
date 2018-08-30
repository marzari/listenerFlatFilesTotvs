/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agibank.testeSelecao.parse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.totvs.testeSelecao.domain.LineSalesFactory;
import br.com.totvs.testeSelecao.domain.LineSalesmanFactory;
import br.com.totvs.testeSelecao.parse.LineParseSales;

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
     * 003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro
     */
    @Test
    public void testParse() {
        System.out.println("LineParseSales/LineSalesFactory TEST");
        String[] data = {"003", "10", "[1-10-100,2-30-2.50,3-40-3.10]", "Pedro"};
        LineParseSales instance = new LineParseSales();
        LineSalesFactory result = (LineSalesFactory) instance.parse(data);
        // ID DA VENDA
        assertEquals(10L, result.getIdSale());
        // NOME DO VENDEDOR
        assertEquals("Pedro", result.getSalesman());
        // SOMATORIO DAS VENDAS
        assertEquals(new Double(1199), result.getCost());
        // ITENS VENDIDOS
        assertEquals(3, result.getItems().size());
    }
}
