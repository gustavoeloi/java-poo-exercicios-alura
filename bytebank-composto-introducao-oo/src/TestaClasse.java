
public class TestaClasse {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Desenvolvedor";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}

}
