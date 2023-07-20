package programa;

/*
 *  Programado por JulianoMarthins
 */

public class Main {

	public static void main(String[] args) {
		
		//Banco cliente = new Banco(5439, "CP", "Juliano Marthins");
		
		//Banco cliente2 = new Banco(1539, "CC", "Thiele Gringer");
		
		Banco ClienteTeste = new Banco(3597, "CP", "Jubileu");
		
		ClienteTeste.deposito(150);
		ClienteTeste.saque(35);
		ClienteTeste.mensalidade();
		ClienteTeste.saque(130);
		ClienteTeste.fecharConta();
		ClienteTeste.saque(125);
		ClienteTeste.fecharConta();
		
		
		
		ClienteTeste.dados();
		
	}

}
