
public class novoTeste {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		
		Gerente g = new Gerente();
		g.setSenha(222);
		si.autentica(g);
		
		Administrador adm = new Administrador();
		adm.setSenha(222);
		si.autentica(adm);
		
		Chefe cf = new Chefe();
		cf.setSenha(222);
		si.autentica(cf);
	}

}
