public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	//Avisa ao desenvolvedor que o metodo debita pode lancar uma 
	//excecao  e que deve ser tratada ao utilizar a classe Conta
	public void debita(double valor) throws NewException {
		if (valor > this.saldo) {
			throw new NewException("Saldo insuficiente.");
		} else {
			saldo -= valor;
		}
	}
	
	public void printSaldo() {
		System.out.println("Saldo: R$"+this.saldo);
	}
	
}

