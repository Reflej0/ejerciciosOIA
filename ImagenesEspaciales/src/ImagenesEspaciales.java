import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ImagenesEspaciales extends EjercicioOIA
{
	private String primeraLinea = "";
	private String segundaLinea = "";
	private String retornoPrimera = "";
	private String retornoSegunda = "";
	public ImagenesEspaciales(String entrada, String salida) throws FileNotFoundException 
	{
		super(entrada, salida);
		Scanner sc = new Scanner(new File(entrada));
		sc.useLocale(Locale.ENGLISH);
		primeraLinea = sc.nextLine();
		segundaLinea = sc.nextLine();
		sc.close();
	}

	@Override
	public void resolver() 
	{
		//Si viene con una sola letra.
		if(primeraLinea.length() == 1)
			retornoPrimera = primeraLinea;
		else
			this.comprimir();
		this.descomprimir();
		this.imprimirSalida();
	}
	
	private void comprimir()
	{
		int i = 0;
		int l = primeraLinea.length();
		int repeticiones = 0;
		Character c, sig;
		while(i < l)
		{
			c = primeraLinea.charAt(i);
			//FIX, porque se tendria que haber pensado con anterior y actual.
			if(i == l - 1)
			{
				c = primeraLinea.charAt(i);
				sig = primeraLinea.charAt(1);
			}
			else
				sig = primeraLinea.charAt(i+1);
			//Voy avanzando mientras las letras sean iguales.
			while(c == sig && i < l)
			{
				repeticiones++;
				i++;
				//FIX, porque se tendria que haber pensado con anterior y actual.
				//Me di cuenta al final y no lo iba a cambiar jaja.
				if(i == l)
				{
					c = primeraLinea.charAt(i-1);
					sig = primeraLinea.charAt(1);
				}
				else
					sig = primeraLinea.charAt(i);
					
			}
			//Si viene por ejemplo NB, directamente las concateno sin mas tratamiento.
			if(c != sig && repeticiones == 0)
			{
				retornoPrimera+=c;
				i++;
			}
			//Si vinieron letras repetidas pero no lo suficiente para comprimir.
			else if(c != sig && repeticiones < 5)
			{
				for(int j = 0; j < repeticiones; j++)
					retornoPrimera+=c;
				repeticiones = 0;
			}
			//Si vinieron letras repetidas como para comprimir.
			//O si estoy en la ultima letra.
			else if((c != sig && repeticiones > 4) || i == l)
			{
				retornoPrimera+= "("+c+repeticiones+")";
				repeticiones = 0;
			}
		}
	}
	
	private void descomprimir()
	{
		int i = 0;
		int l = segundaLinea.length();
		while(i < l)
		{
			char c = segundaLinea.charAt(i);
			//Si no encuentro un parentesis simplemente concateno.
			if(segundaLinea.charAt(i) != '(')
			{
				retornoSegunda+=c;
				i++;
			}
			else
			{
				//Despues del parentesis esta la letra.
				char letra = segundaLinea.charAt(i+1);
				//Esto es porque despues de la letra puede venir un numero de 1, 2 o hasta 3 digitos.
				int salto = segundaLinea.indexOf(")", i+2)+1-i;
				//Tengo que extraer el numero.
				int repeticiones = Integer.parseInt(segundaLinea.substring(i+2, segundaLinea.indexOf(")", i+2)));
				//Concateno la letra la cantidad de veces que indican las repeticiones.
				for(int j = 0; j < repeticiones; j++)
					retornoSegunda+=letra;
				i+=salto;
			}
		}
	}
	
	private void imprimirSalida()
	{
		try 
		{
			PrintWriter salida = new PrintWriter(new FileWriter(this.salida));
			salida.println(retornoPrimera);
			salida.println(retornoSegunda);
			salida.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Ha ocurrido un error con el archivo de salida");
			System.exit(1);
		}
	}

}
