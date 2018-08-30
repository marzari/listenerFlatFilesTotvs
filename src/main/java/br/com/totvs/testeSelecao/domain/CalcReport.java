package br.com.totvs.testeSelecao.domain;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
public class CalcReport {
	
	private long idMmostExpensiveSale;
	private long sumBuyer;
	private long sumSaleman;
	private LineSalesmanFactory worstSalesman;
	
	/**
	 * @param idMmostExpensiveSale
	 * @param sumBuyer
	 * @param sumSaleman
	 * @param worstSalesman
	 */
	public CalcReport(long idMmostExpensiveSale, long sumBuyer, long sumSaleman, LineSalesmanFactory worstSalesman) {
		super();
		this.idMmostExpensiveSale = idMmostExpensiveSale;
		this.sumBuyer = sumBuyer;
		this.sumSaleman = sumSaleman;
		this.worstSalesman = worstSalesman;
	}
	
	

	/**
	 * @return the idMmostExpensiveSale
	 */
	public final long getIdMmostExpensiveSale() {
		return idMmostExpensiveSale;
	}



	/**
	 * @param idMmostExpensiveSale the idMmostExpensiveSale to set
	 */
	public final void setIdMmostExpensiveSale(long idMmostExpensiveSale) {
		this.idMmostExpensiveSale = idMmostExpensiveSale;
	}



	/**
	 * @return the sumBuyer
	 */
	public final long getSumBuyer() {
		return sumBuyer;
	}



	/**
	 * @param sumBuyer the sumBuyer to set
	 */
	public final void setSumBuyer(long sumBuyer) {
		this.sumBuyer = sumBuyer;
	}



	/**
	 * @return the sumSaleman
	 */
	public final long getSumSaleman() {
		return sumSaleman;
	}



	/**
	 * @param sumSaleman the sumSaleman to set
	 */
	public final void setSumSaleman(long sumSaleman) {
		this.sumSaleman = sumSaleman;
	}



	/**
	 * @return the worstSalesman
	 */
	public final LineSalesmanFactory getWorstSalesman() {
		return worstSalesman;
	}



	/**
	 * @param worstSalesman the worstSalesman to set
	 */
	public final void setWorstSalesman(LineSalesmanFactory worstSalesman) {
		this.worstSalesman = worstSalesman;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RELATÓRIO:");
		builder.append("\nID da Venda de valor mais alto: ");
		builder.append(idMmostExpensiveSale);
		builder.append("\nQuantidade de Clientes: ");
		builder.append(sumBuyer);
		builder.append("\nQuantidade de Vendedores: ");
		builder.append(sumSaleman);
		builder.append("\nNome do Vendedor que menos vendeu: ");
		builder.append(worstSalesman.getName());
		return builder.toString();
	}

}
