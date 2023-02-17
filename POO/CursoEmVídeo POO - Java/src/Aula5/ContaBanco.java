package Aula5;
import java.util.*;
public class ContaBanco implements ContaBancos {

	Scanner scan = new Scanner(System.in);
	
	private int numConta;
	private String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public boolean abrirConta(String tipo) {

		setTipo(tipo);
		if(tipo == "CC") {
			saldo = 50;
			return this.status = true;
		}
		else if(tipo == "CP") {
			saldo = 150;
			return this.status = true;
		}
		else {
			System.out.println("Tipo de conta inválida, informe novamente");
		}
		return this.status = false;
	}
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Não foi possível realizar essa operação, seu saldo deve ser de R$0.00");
		}
		else if (this.saldo < 0){
			System.out.println("Não foi possível realizar essa operação, esta conta está em débito");
		}
		else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");		
		}
	}
	
	public void depositar(float deposito) {
		if(this.status == true) {
			System.out.println("Depósito realizado com sucesso");
			this.saldo+=deposito;
		}
		else {
			System.out.println("Conta fechada!");
		}
	}
	
	public void sacar(float saque) {
		if(this.status == true) {
			if(this.saldo >= saque) {
				this.saldo -= saque;
				System.out.println("Saque realizado com sucesso");
			}
			else {
				System.out.println("Saldo não disponivel!");
			}
		}
		else {
			System.out.println("Conta fechada!");
		}
	}
	
	public void pagarMensal() {
		if(this.status == true) {
			if(this.tipo == "CC") {
				if(this.saldo >= 12) {
					this.saldo -= 12;
					System.out.println("Mensalidade paga");
				}
			}
			else if(this.tipo == "CP") {
				if(this.saldo >= 20) {
					this.saldo -= 20;
					System.out.println("Mensalidade paga");
				}
			}
		}
		else {
			System.out.println("Conta fechada!");
		}
	}
	
	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getsStatus() {
		return status;
	}

	public boolean setStatus(boolean status) {
		this.status = status;
		return true;
	}

	public ContaBanco(float saldo, boolean status) {
		super();
		this.saldo = 0;
		this.status = false;
	}
	public String toString() {
		return String.format("Número da Conta: %d\nTipo: %s\nDono: %s\nsaldo: %2f\nStatus: %b",this.getNumConta(),this.getTipo(),this.getDono(),this.getSaldo(),this.getsStatus());
	}		
}