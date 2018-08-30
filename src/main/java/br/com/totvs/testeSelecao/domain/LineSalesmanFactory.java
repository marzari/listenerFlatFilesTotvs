package br.com.totvs.testeSelecao.domain;

import java.math.BigDecimal;

/**
 * @author tiago
 * @since 29/08/2018
 */
public class LineSalesmanFactory extends Line {

	private String cpf;
	private String name;
	private BigDecimal salary;

	public LineSalesmanFactory(String cpf, String name, String salary) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.salary = new BigDecimal(salary);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + ", CPF: " + cpf + ", Salário: R$ " + salary.toString().replace(".", ",");
	}

}
