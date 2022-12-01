
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1336, 455);
		conta.setNumero(443);
		
		conta.setAgencia(455);
		
		Conta conta2 = new Conta(1336, 456);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("Total de contas " + conta.getTotal());
	}

}
