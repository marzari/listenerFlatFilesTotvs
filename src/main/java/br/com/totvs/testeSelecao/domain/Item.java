package br.com.totvs.testeSelecao.domain;

import java.math.BigDecimal;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
public class Item {

	private Long idItem;
	private Integer quantity;
	private BigDecimal cost;

	/**
	 * @param idItem
	 * @param quantity
	 * @param cost
	 */
	public Item(String idItem, String quantity, String cost) {
		super();
		this.idItem = Long.parseLong(idItem);
		this.quantity = Integer.parseInt(quantity);
		this.cost = new BigDecimal(cost);
	}

	/**
	 * @return the idItem
	 */
	public final Long getIdItem() {
		return idItem;
	}

	/**
	 * @param idItem the idItem to set
	 */
	public final void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	/**
	 * @return the quantity
	 */
	public final Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public final void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the cost
	 */
	public final BigDecimal getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public final void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", quantity=" + quantity + ", cost=" + cost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		return true;
	}

}
