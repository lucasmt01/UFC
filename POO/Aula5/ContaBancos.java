package Aula5;

public interface ContaBancos {

	public abstract void pagarMensal();
	public abstract void sacar(float saque);
	public abstract void depositar(float deposito);
	public abstract void fecharConta();
	public abstract boolean abrirConta(String tipo);
}
