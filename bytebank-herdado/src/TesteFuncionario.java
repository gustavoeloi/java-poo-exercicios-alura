
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Designer gustavo = new Designer();
		gustavo.setNome("Gustavo Henrique");
		gustavo.setCpf("083.235.781-55");
		gustavo.setSalario(1250.00);
		
		System.out.println(gustavo.getNome());
		System.out.println(gustavo.getCpf());
		System.out.println(gustavo.getBonificacao());
		System.out.println(gustavo.getBonificacao() + gustavo.getSalario());
	}

}
