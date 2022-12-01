
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		return  super.getSalario() + super.getSalario() * 0.5;
	}
}
