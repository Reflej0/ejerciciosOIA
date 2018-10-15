package aCorrer;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException 
	{
		aCorrer lote1 = new aCorrer("/home/reflejo/eclipse-workspace/aCorrer/in/loteEjercicio.in", "/home/reflejo/eclipse-workspace/aCorrer/out/loteEjercicio.out");
		lote1.resolver();
		aCorrer ningunCorredorArriba = new aCorrer("/home/reflejo/eclipse-workspace/aCorrer/in/ningunCorredorArriba.in", "/home/reflejo/eclipse-workspace/aCorrer/out/ningunCorredorArriba.out");
		ningunCorredorArriba.resolver();
		aCorrer soloMujeres = new aCorrer("/home/reflejo/eclipse-workspace/aCorrer/in/soloMujeres.in", "/home/reflejo/eclipse-workspace/aCorrer/out/soloMujeres.out");
		soloMujeres.resolver();
	}

}
