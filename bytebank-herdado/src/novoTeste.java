
public class novoTeste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gustavo Henrique");
		g1.setCpf("033.335.278-99");
		g1.setSalario(1580.00);
		g1.setSenha("123080704@Cg");
		boolean autenticou = g1.autentica("2334hhchf");
		
		System.out.println(g1.getNome());
		System.out.println(g1.getBonificacao() + g1.getSalario());
		System.out.println(g1.getSenha());
		System.out.println(autenticou);
		
	}

}
