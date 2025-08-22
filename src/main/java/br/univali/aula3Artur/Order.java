package br.univali.aula3Artur;

import java.time.LocalDate;

public class Order {

	private LocalDate date;
	private String status;
	private Customer customer;
	private Payment[] payments;
	private int countPayment = 0;

	public Order() {
		payments = new Payment[6];
	}

	public void addPayment(Payment payment) {
		payments[countPayment] = payment;
		countPayment++;
	}

	public void calcSubTotal() {
		//implementação
	}

	public void calcTax() {
		//implementação
	}

	public void calcTotal() {
		//implementação
	}

	public void calcTotalWeight() {
		//implementação
	}
}
