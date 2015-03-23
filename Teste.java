//Testa a classe Conta até que lance NewException.
public class Teste {
	public static void main(String[] args) throws NewException{
		Conta conta = new Conta(1500);
		conta.printSaldo();
		
		while (true) {
			try {
				conta.debita(755);
			}
			
			//catch captura a exceção
			catch(NewException e) {
				System.out.println(e.getMessage());
				break;
			}
			
			 //finally executa mesmo que seja lançado uma exceção
			finally {
				conta.printSaldo();
			}
		}
	
		System.out.println("Finalizando programa");
	}
}
