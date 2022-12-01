
public class SistemaInterno {
	
	private int senha = 222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no Sistema!");
		} else {
			System.out.println("Acesso inválido!");
		}
	}
	
}
