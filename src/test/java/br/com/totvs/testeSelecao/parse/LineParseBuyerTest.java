/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.totvs.testeSelecao.parse;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.totvs.testeSelecao.domain.LineBuyerFactory;
import br.com.totvs.testeSelecao.parse.LineParseBuyer;

/**
 *
 * @author tiago.marzari
 */
public class LineParseBuyerTest {

	public LineParseBuyerTest() {
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
	 * Test of parse method, of class LineParseBuyer. 
	 * 002;2345675434544345;Jose da Silva;Rural
	 */
	@Test
	public void testParse() {
		System.out.println("LineParseBuyer/LineBuyerFactory TEST");
		String[] data = { "002", "2345675434544345", "Jose da Silva", "Rural" };
		LineParseBuyer instance = new LineParseBuyer();
		LineBuyerFactory result = (LineBuyerFactory) instance.parse(data);
		// CNPJ
		assertEquals("2345675434544345", result.getCnpj());
		// NOME
		assertEquals("Jose da Silva", result.getName());
		// AREA NEGOCIO
		assertEquals("Rural", result.getBusinessArea());
		// RELATORIO
		assertEquals("LineBuyerFactory [cnpj=2345675434544345, name=Jose da Silva, businessArea=Rural]", result.toString());
	}

}
