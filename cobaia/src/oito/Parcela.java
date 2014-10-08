package oito;

import java.util.Date;

public class Parcela {

	private int numero;
	private Date vencimento;
	private Date pagamento;

	public Parcela(int numero, Date vencimento) {
		this.numero = numero;
		this.vencimento = vencimento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

}
