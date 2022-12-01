
public class Program {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Gustavo";
		p.endereco = new Endereco();
		p.endereco.logradouro = "ABCDEF";
		System.out.println(p.endereco.logradouro);

	}

}
