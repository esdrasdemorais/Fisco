package com.esdrasmorais.printer;

import bemajava.*;
import java.util.Date;

public class BematechPrinter implements IPrinter {
	private String returns = "";
	private Integer result;
	
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
			Integer.toString(ack.number) + ",\n ST1: " +
			Integer.toString(st1.number) + ",\n ST2: " +
			Integer.toString(st2.number) + ",\n ST3: " +
			Integer.toString(st3.number);
	}

	@Override
	public void openCoupon(String cpf, String name, String address) {
		this.result = Bematech.AbreCupomMFD(cpf, name, address);
		this.setStatusBarFunctionReturn(this.result);
	}
	
	@Override
	public boolean finishCoupon() {
		return false;
	}
}