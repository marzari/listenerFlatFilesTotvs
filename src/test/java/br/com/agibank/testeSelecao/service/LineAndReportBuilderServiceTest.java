/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agibank.testeSelecao.service;

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
     * 001ç1234567891234çPedroç50000 
     * 001ç3245678865434çPauloç40000.99 
     * 002ç2345675434544345çJose da SilvaçRural 
     * 002ç2345675433444345çEduardo PereiraçRural 
     * 003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro 
     * 003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo 
     */
    @Test
    public void testLineAndReportBuilder() {
        System.out.println("LineBuilder/ReportBuilder TEST");
        List<String> lines = new ArrayList<>();
        lines.add("001ç1234567891234çPedroç50000");
        lines.add("001ç3245678865434çPauloç40000.99");
        lines.add("002ç2345675434544345çJose da SilvaçRural");
        lines.add("002ç2345675433444345çEduardo PereiraçRural");
        lines.add("003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro");
        lines.add("003ç08ç[1-34-10,2-33-1.50,3-40-0.10]çPaulo");
        LineBuilderService instance = new LineBuilderService();
        List<Line> lineBuilder = instance.LineBuilder(lines);
        // LINHAS ARQUIVO
        assertEquals(6, lineBuilder.size());
        ReportBuilderService relatorio = new ReportBuilderService();
        CalcReport dataProcess = relatorio.dataProcess(lineBuilder);
        // ID da venda mais cara
        assertEquals(10, dataProcess.getIdMmostExpensiveSale());
        // Quantidade de clientes no arquivo de entrada
        assertEquals(2, dataProcess.getSumBuyer());
        // Quantidade de vendedor no arquivo de entrada
        assertEquals(2, dataProcess.getSumSaleman());
        // O pior vendedor
        assertEquals("Paulo", dataProcess.getWorstSalesman().getName());
    }
    
}
