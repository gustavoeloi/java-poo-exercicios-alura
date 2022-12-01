
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 200.00;
		
		contaPaulo.deposita(75.00);
		System.out.println("Valor atual: R$" + contaPaulo.saldo);
		
		contaPaulo.saca(300.00);
		System.out.println("Valor atual: R$" + contaPaulo.saldo);
		
		Conta contaGustavo = new Conta();
		contaGustavo.deposita(50);
		System.out.println("Valor da conta do Gustavo: " + contaGustavo.saldo);
		
		contaPaulo.transfere(150, contaGustavo);
		System.out.println("Valor da conta do Gustavo: " + contaGustavo.saldo);
		
		contaGustavo.transfere(200.00, contaPaulo);
		System.out.println(contaPaulo.saldo);
		System.out.println(contaGustavo.saldo);
		contaPaulo.transfere(250, contaGustavo);
		System.out.println(contaPaulo.saldo);
		
		System.out.println(contaPaulo.titular);
	}
}
