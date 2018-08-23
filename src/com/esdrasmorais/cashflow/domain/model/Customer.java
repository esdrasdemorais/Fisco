
package com.esdrasmorais.cashflow.domain.model;

public class Customer extends IdentifiedDomainObject {
	private String cpf;
	private String cnpj;
	private String name;
	private Integer phone;

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return this.name;
	}

	public void setName() {
		this.name = name;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
}
