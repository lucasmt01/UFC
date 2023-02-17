package Aula12;

public class main {

	public static void main(String[] args) {

		Mamifero mami = new Mamifero("Cinza");
		Reptil rept = new Reptil("Vermelha");
		Peixe peix = new Peixe("Verde");
		Ave ave = new Ave("Branca");
		
		mami.setEspecie("Zebra");
		mami.setPeso(100f);
		mami.setIdade(13);
		mami.setMembros(4);
		
		rept.setEspecie("Cobra");
		rept.setPeso(21.53f);
		rept.setIdade(4);
		rept.setMembros(0);
		
		peix.setEspecie("Peixe");
		peix.setPeso(3.41f);
		peix.setIdade(1);
		peix.setMembros(0);
		
		ave.setEspecie("Gaviao");
		ave.setPeso(8f);
		ave.setIdade(5);
		ave.setMembros(2);
		
		System.out.println(mami);
		mami.alimentar();
		mami.emitirSom();
		mami.locomover();
		
		System.out.println(rept);
		rept.alimentar();
		rept.emitirSom();
		rept.locomover();
		
		System.out.println(peix);
		peix.alimentar();
		peix.emitirSom();
		peix.locomover();
		
		System.out.println(ave);
		ave.alimentar();
		ave.emitirSom();
		ave.locomover();
	}

}
