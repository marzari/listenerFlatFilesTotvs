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

import br.com.totvs.testeSelecao.domain.LineBuyerFactory;
import br.com.totvs.testeSelecao.domain.LineSalesmanFactory;
import br.com.totvs.testeSelecao.parse.LineParseSaleman;

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
     * 001ç3245678865434çPauloç40000.99 
     */
    @Test
    public void testParse() {
        System.out.println("LineParseSaleman/LineSalesmanFactory TEST");
        String[] data = {"001", "3245678865434", "Paulo", "40000.99"};
        LineParseSaleman instance = new LineParseSaleman();
        LineSalesmanFactory result = (LineSalesmanFactory) instance.parse(data);
        // CPF
        assertEquals("3245678865434", result.getCpf());
        // NOME
        assertEquals("Paulo", result.getName());
        // SALARIO
        assertEquals(new Double(40000.99), result.getSalary());
        //RELATORIO
        assertEquals("Nome: Paulo, CPF: 3245678865434, Salário: R$ 40000,99", result.toString());
    }
    
}
