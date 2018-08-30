package br.com.totvs.testeSelecao.domain;

/**
 * @author tiago marzari
 * @since 29/08/2018
 */
public class LineBuyerFactory extends Line{
	
	private String cnpj;
	private String name;
	private String businessArea;
	
	/**
	 * @param cnpj
	 * @param name
	 * @param businessArea
	 */
	public LineBuyerFactory(String cnpj, String name, String businessArea) {
		super();
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}

	/**
	 * @return the cnpj
	 */
	public final String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public final void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the businessArea
	 */
	public final String getBusinessArea() {
		return businessArea;
	}

	/**
	 * @param businessArea the businessArea to set
	 */
	public final void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineBuyerFactory [cnpj=");
		builder.append(cnpj);
		builder.append(", name=");
		builder.append(name);
		builder.append(", businessArea=");
		builder.append(businessArea);
		builder.append("]");
		return builder.toString();
	}

}
