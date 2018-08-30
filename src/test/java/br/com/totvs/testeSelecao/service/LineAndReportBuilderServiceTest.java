/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.totvs.testeSelecao.service;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.totvs.testeSelecao.domain.CalcReport;
import br.com.totvs.testeSelecao.domain.Line;
import br.com.totvs.testeSelecao.service.LineBuilderService;
import br.com.totvs.testeSelecao.service.ReportBuilderService;

import static org.junit.Assert.*;

/**
 *
 * @author tiago.marzari
 */
public class LineAndReportBuilderServiceTest {
    
    public LineAndReportBuilderServiceTest() {
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
     * Test of LineBuilder method, of class LineBuilderService and ReportBuilderService, dataProcess method .
     * 
     * 001;1234567891234;Diego;5000.00
     * 002;2345675434544345;Jose da Silva;Rural
     * 002;2345675433444345;Eduardo Gonsalvez Pereira;Rural 
     * 001;3245678865434;Renato;4000.00 
     * 003;10;11010;300;3403.30;Diego 
     * 003;08;13410;540;2400.10;Renato
     */
    @Test
    public void testLineAndReportBuilder() {
        System.out.println("LineBuilder/ReportBuilder TEST");
        List<String> lines = new ArrayList<>();
        lines.add("001;1234567891234;Diego;5000.00");
        lines.add("002;2345675434544345;Jose da Silva;Rural");
        lines.add("002;2345675433444345;Eduardo Gonsalvez Pereira;Rural");
        lines.add("001;3245678865434;Renato;4000.00");
        lines.add("003;10;11010;300;3403.30;Diego");
        lines.add("003;08;13410;540;2400.10;Renato");
        LineBuilderService instance = new LineBuilderService();
        List<Line> lineBuilder = instance.LineBuilder(lines);
        // LINHAS ARQUIVO
        assertEquals(6, lineBuilder.size());
        ReportBuilderService relatorio = new ReportBuilderService();
        CalcReport dataProcess = relatorio.dataProcess(lineBuilder);
        // ID da venda mais cara
        assertEquals(8, dataProcess.getIdMmostExpensiveSale());
        // Quantidade de clientes no arquivo de entrada
        assertEquals(2, dataProcess.getSumBuyer());
        // Quantidade de vendedor no arquivo de entrada
        assertEquals(2, dataProcess.getSumSaleman());
        // O pior vendedor
        assertEquals("Diego", dataProcess.getWorstSalesman().getName());
    }
    
}
