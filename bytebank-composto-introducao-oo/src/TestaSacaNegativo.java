
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta =  new Conta();
		conta.deposita(100);
		
		System.out.println("Saldo da conta " + conta.getSaldo());
		
	}
}
