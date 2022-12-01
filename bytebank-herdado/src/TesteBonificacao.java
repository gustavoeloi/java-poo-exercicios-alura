
public class TesteBonificacao {

	public static void main(String[] args) {
		
		ControleBonificacao cb = new ControleBonificacao();
		
		System.out.println(cb.getSoma());
		//System.out.println(f1.getBonificacao());
		
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel Rodrigues");
		g1.setSalario(2500);
		cb.registra(g1);
		
		System.out.println(cb.getSoma());
		//System.out.println(g1.getBonificacao());
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Kauã Morais");
		ev.setSalario(2500);
		
		cb.registra(ev);
		System.out.println(cb.getSoma());
		//System.out.println(ev.getBonificacao());
		
		Designer d = new Designer();
		d.setNome("Dougla Aquino");
		d.setSalario(2500);
		
		cb.registra(d);
		System.out.println(cb.getSoma());
	}

}
