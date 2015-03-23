//Testa a classe Conta ate que lance NewException.
public class Teste {
	public static void main(String[] args) throws NewException{
		Conta conta = new Conta(1500);
		conta.printSaldo();
		
		while (true) {
			try {
				conta.debita(755);
			}
			
			//catch captura a excecao
			catch(NewException e) {
				System.out.println(e.getMessage());
				break;
			}
			
			//finally executa mesmo que seja lancado uma excecao
			finally {
				conta.printSaldo();
			}
		}
	
		System.out.println("Finalizando programa");
	}
}
