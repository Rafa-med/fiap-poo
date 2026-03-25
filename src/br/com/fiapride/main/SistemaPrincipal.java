package br.com.fiapride.main;

//import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;

//public class SistemaPrincipal {
public class SistemaPrincipal {	

//	public static void main(String[] args) 
	public static void main(String[] args){
//	{
//		// TODO Auto-generated method stub

//		Passageiro passageiro1 = new Passageiro();
		Carro prisma = new Carro("preto", "Sedan");
		
//		passageiro1.nome = "Ana Silva";

//		passageiro1.saldo = 50.0;
		
		
//		Passageiro passageiro2 = new Passageiro();
		Carro byd = new Carro("branco", "SUV");
		
		
//		passageiro2.nome = "Carlos Souz";
		byd.cor = "branco";
				
//		passageiro2.saldo = 12.50;
		byd.carroceria = "suv";
		
		
//		System.out.println("--- Sstema FiapRide ---");
		System.out.println("--- Sistema FiapRide ---");
//		
		System.out.println("Prisma | Cor: " + prisma.cor + " carroceria:" + prisma.carroceria);
//	    System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		System.out.println("BYD | Cor: " + byd.cor + " carroceria: " + prisma.carroceria);
	}
//	}
}
//}

