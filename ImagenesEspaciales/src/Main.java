import java.io.FileNotFoundException;

public class Main 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ImagenesEspaciales unaletra = new ImagenesEspaciales("/home/reflejo/eclipse-workspace/ImagenesEspaciales/in/unaletra.in", "/home/reflejo/eclipse-workspace/ImagenesEspaciales/out/unaletra.out");
		unaletra.resolver();
		ImagenesEspaciales loteEjercicio = new ImagenesEspaciales("/home/reflejo/eclipse-workspace/ImagenesEspaciales/in/loteEjercicio.in", "/home/reflejo/eclipse-workspace/ImagenesEspaciales/out/loteEjercicio.out");
		loteEjercicio.resolver();
		ImagenesEspaciales lineasidenticas = new ImagenesEspaciales("/home/reflejo/eclipse-workspace/ImagenesEspaciales/in/lineasidenticas.in", "/home/reflejo/eclipse-workspace/ImagenesEspaciales/out/lineasidenticas.out");
		lineasidenticas.resolver();
		ImagenesEspaciales fatiga = new ImagenesEspaciales("/home/reflejo/eclipse-workspace/ImagenesEspaciales/in/fatiga.in", "/home/reflejo/eclipse-workspace/ImagenesEspaciales/out/fatiga.out");
		fatiga.resolver();
	}

}
