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

import br.com.totvs.testeSelecao.domain.LineSalesmanFactory;

/**
 *
 * @author tiago.marzari
 */
public class LineParseSalemanTest {
    
    public LineParseSalemanTest() {
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
     * Test of parse method, of class LineParseSaleman.
     * 001;1234567891234;Diego;5000.00
     */
    @Test
    public void testParse() {
        System.out.println("LineParseSaleman/LineSalesmanFactory TEST");
        String[] data = {"001", "3245678865434", "Diego", "5000.00"};
        LineParseSaleman instance = new LineParseSaleman();
        LineSalesmanFactory result = (LineSalesmanFactory) instance.parse(data);
        // CPF
        assertEquals("3245678865434", result.getCpf());
        // NOME
        assertEquals("Diego", result.getName());
        // SALARIO
        assertEquals(new BigDecimal("5000.00"), result.getSalary());
        //RELATORIO
        assertEquals("Nome: Diego, CPF: 3245678865434, Salário: R$ 5000,00", result.toString());
    }
    
}
