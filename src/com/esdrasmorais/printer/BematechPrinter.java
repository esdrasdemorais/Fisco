package com.esdrasmorais.printer;

import bemajava.*;
import java.util.Date;

import com.esdrasmorais.cashflow.domain.model.PaymentMethod;
import com.esdrasmorais.cashflow.domain.model.Unity;

public class BematechPrinter implements IPrinter {
	private String returns = "";
	private Integer result;

	protected void setStatusBarFunctionReturn(int value) {
		returns += "Function Return: " + Integer.toString(value);
	}

	protected String setStatusBarPrinterStatus() {
		BemaInteger ack = new BemaInteger();
		BemaInteger st1 = new BemaInteger();
		BemaInteger st2 = new BemaInteger();
		BemaInteger st3 = new BemaInteger();
		Bematech.RetornoImpressoraMFD(ack, st1, st2, st3);
		return returns + "\nPrinter Status:\n ACK: " + 
			Integer.toString(ack.number) + ",\n ST1: "
			+ Integer.toString(st1.number) + ",\n ST2: " 
			+ Integer.toString(st2.number) + ",\n ST3: "
			+ Integer.toString(st3.number);
	}

	@Override
	public void xReading() {
		this.result = Bematech.LeituraX();
	}

	@Override
	public void zReading() {
		Date date = new Date();
		this.result = Bematech.LeituraMemoriaFiscalSerialDataMFD(
			date.toString(), date.toString(), "Z"
		);
	}

	@Override
	public void setWorker(String name) {
		this.result = Bematech.ProgramaOperador(name);
		this.setStatusBarFunctionReturn(this.result);
	}

	@Override
	public void openCoupon(String cpf, String name, String address) {
		this.result = Bematech.AbreCupomMFD(cpf, name, address);
		this.setStatusBarFunctionReturn(this.result);
	}

	@Override
	public void saleItemRound(Long code, String description, Float rate, 
		Unity unity, FractionalQuantity fractionalQuantity, 
		UnitaryValue unitaryValue, Unitary unitary, String addition, 
		String discount, boolean toRound
	) {
		this.result = Bematech.VendeItemArredondamentoMFD(
			code.toString(), description, rate.toString(), unity.toString(), 
			fractionalQuantity.toString(), unitaryValue.toString(), 
			addition, discount, toRound);
		this.setStatusBarFunctionReturn(this.result);
	}

	@Override
	public void commitPaymentMethod(PaymentMethod paymentMethod, Float value) {
		this.result = Bematech.EfetuaFormaPagamento(
			paymentMethod.toString(), value.toString()
		);
		this.setStatusBarFunctionReturn(this.result);
	}

	@Override
	public Boolean finishClosureCoupon(String message) {
		this.result = Bematech.TerminaFechamentoCupom(message);
		this.setStatusBarFunctionReturn(this.result);
		return this.result > 0;
	}

	@Override
	public void cancelCoupon() {
		this.result = Bematech.CancelaCupom();
		this.setStatusBarFunctionReturn(this.result);
	}

	@Override
	public void saleItemRound(Long code, String description, Unity unity, FractionalQuantity fractionalQuantity,
			UnitaryValue unitaryValue, Unitary unitary, String Addition, String Discount, boolean toRound) {
		// TODO Auto-generated method stub
		
	}
}