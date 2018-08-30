/**
 * 
 */
package br.com.totvs.testeSelecao.config;

/**
 * @author tiago marzari
 *
 */
public class PositionFileConfig {

	public static final Integer PLACE_SALESMAN_CPF = 1;
	public static final Integer PLACE_SALESMAN_NAME = 2;
	public static final Integer PLACE_SALESMAN_SALARY = 3;

	public static final Integer PLACE_BUYER_CNPJ = 1;
	public static final Integer PLACE_BUYER_NAME = 2;
	public static final Integer PLACE_BUYER_BUSINESS_AREA = 3;
	
	//(0	;	1			;	2			;	3				;	4				;	5	
	//(003	;	ID da venda	;	ID do item	;	qtde do item	;	preço do item	;	Nome do Vendedor)
	public static final Integer PLACE_SALE_ID = 1;
	public static final Integer PLACE_SALE_ITEM_ID = 2;
	public static final Integer PLACE_SALE_ITEM_QUANTITY = 3;
	public static final Integer PLACE_SALE_ITEM_COST = 4;
	public static final Integer PLACE_SALE_SALESMAN = 5;


}
