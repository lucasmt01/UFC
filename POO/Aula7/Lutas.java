package Aula7;
import java.util.*;

public class Lutas{

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1 , Lutador l2){
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
			System.out.println("Luta Aprovada");
		}
		else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
			System.out.println("Luta não Aprovada");
		}
	}
	public void lutar(){
		if(this.aprovada == true) {
			desafiado.apresentar();
			desafiante.apresentar();
			
			Random sorteio = new Random();
			int vencedor = sorteio.nextInt(3);
			
			if(vencedor == 0) {
				desafiante.ganharLuta();
				desafiado.perderLuta();
				System.out.println("O desafiante venceu a luta");
			}
			else if(vencedor == 1) {
				desafiado.ganharLuta();
				desafiante.perderLuta();
				System.out.println("O desafiado venceu a luta");
			}
			else {
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				System.out.println("A luta empatou");
			}
		}
		else {
			System.out.println("Luta não Aprovada");
		}
	}
}
