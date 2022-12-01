
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.00;
		primeiraConta.saldo += 300.00;
		
		System.out.println("Saldo da conta: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		segundaConta.saldo += 150.00;
		
		System.out.println(primeiraConta.saldo);
	}

}
