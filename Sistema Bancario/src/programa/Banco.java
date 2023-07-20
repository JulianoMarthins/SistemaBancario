package programa;

public class Banco {

	// Atributos
	public int numConta;
	protected String tipo;
	private String titular;
	private float saldo = 0;
	private boolean status = false;

	// Contrutor
	public Banco(int numConta, String tipo, String titular) {
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setTitular(titular);
		abrirConta();

	}

	// Metodos

	public void abrirConta() {
		this.setStatus(true);
		System.out.println("------------------------------");
		if (this.getTipo().equals("CP")) {
			this.setSaldo(150);
			System.out.printf("Conta Poupança aberta com sucesso" + "\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
					this.getSaldo());
		} else if (this.getTipo().equals("CC")) {
			this.setSaldo(50);
			System.out.printf("Conta Corrente aberta com sucesso" + "\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
					this.getSaldo());
		}

	}

	public void fecharConta() {
		System.out.println("------------------------------");
		if (this.getSaldo() == 0) {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		} else if (this.getSaldo() < 0) {
			System.out.println("Impoossivel fechar conta com saldo bancário negativo");
		} else {
			System.out.println("Impossivel fechar conta com saldo bancário ativo");
		}

	}

	public void deposito(float valor) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("------------------------------");
			System.out.printf("Deposito realizado com sucesso\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
					this.getSaldo());
		} else {
			System.out.println("Conta inativa");

		}

	}

	public void saque(float valor) {
		if (this.getStatus() == true) {
			System.out.println("------------------------------");
			if (this.saldo >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.printf("Saque realizado com sucesso\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
						this.getSaldo());
			} else {
				System.out.println("Não há saldo suficiente para o saque");
			}
		}

	}

	public void mensalidade() {
		float taxa = 0;
		System.out.println("------------------------------");
		if (this.getStatus() == true) {

			if (this.getTipo().equals("CP")) {
				taxa = 10;
				this.setSaldo(this.getSaldo() - taxa);
				System.out.printf("Mensalidade paga sucesso\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
						this.getSaldo());
			} else if (this.getTipo().equals("CC")) {
				taxa = 15;
				this.setSaldo(this.getSaldo() - taxa);
				System.out.printf("Mensalidade paga com sucesso\nConta: %s%nSaldo: R$%.2f%n", this.getTitular(),
						this.getSaldo());
			}

		}

	}

	// Getters & Setters

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// ToString

	public void dados() {
		System.out.println("------------------------------");
		System.out.println("Informações da conta");
		System.out.printf("Nome: %s%nNúmero da conta: %d%nSaldo: R$%.2f%n", this.getTitular(), this.getNumConta(),
				this.getSaldo());		
		System.out.println("Status: " + this.getStatus());
		
	}
}
