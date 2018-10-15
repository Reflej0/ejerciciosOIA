package CaosEnLaEnvasadora;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException 
	{
		CaosEnLaEnvasadora lote1 = new CaosEnLaEnvasadora("/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/in/loteEjercicio.in", "/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/out/loteEjercicio.out");
		lote1.resolver();
		CaosEnLaEnvasadora secuencias2 = new CaosEnLaEnvasadora("/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/in/secuencias2.in", "/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/out/secuencias2.out");
		secuencias2.resolver();
		//CaosEnLaEnvasadora.generarAleatorio("/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/in/fatiga.in");
		CaosEnLaEnvasadora fatiga = new CaosEnLaEnvasadora("/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/in/fatiga.in", "/home/reflejo/eclipse-workspace/CaosEnLaEnvasadora/out/fatiga.out");
		fatiga.resolver();
	}

}
