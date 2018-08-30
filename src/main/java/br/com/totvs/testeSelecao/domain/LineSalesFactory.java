package br.com.totvs.testeSelecao.domain;

import java.math.BigDecimal;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
public class LineSalesFactory extends Line {
	
	private long idSale;
	private Item item;
	private String salesman;
	
	/**
	 * @param idSale
	 * @param item
	 * @param salesman
	 */
	public LineSalesFactory(String idSale, Item item, String salesman) {
		super();
		this.idSale = Long.parseLong(idSale);
		this.item = item;
		this.salesman = salesman;
	}
	
	public BigDecimal getCost() {
		return this.item.getCost().multiply(new BigDecimal(this.item.getQuantity()));
	}

	/**
	 * @return the idSale
	 */
	public final long getIdSale() {
		return idSale;
	}

	/**
	 * @param idSale the idSale to set
	 */
	public final void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	/**
	 * @return the item
	 */
	public final Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public final void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the salesman
	 */
	public final String getSalesman() {
		return salesman;
	}

	/**
	 * @param salesman the salesman to set
	 */
	public final void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	@Override
	public String toString() {
		return "LineSalesFactory [idSale=" + idSale + ", item=" + item + ", salesman=" + salesman + "]";
	}
	
}
