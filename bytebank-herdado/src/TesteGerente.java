
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Gustavo Henrique");
		g1.setCpf("009.337.184-32");
		g1.setSalario(2500.00);
		
		System.out.println(g1.getBonificacao());
	}

}
