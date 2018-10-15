import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

public class MesasGranito
{
	public static int doEjercicio(ArrayList<Mesa> mesas)
	{
		int auxswap;
		//Las organizo teniendo el mayor valor ya sea su largo o ancho de un solo lado.
		for(Mesa m : mesas)
		{
			if(m.largo<m.ancho)
			{
				auxswap = m.largo;
				m.largo = m.ancho;
				m.ancho = auxswap;
			}
		}
		//Ordeno las mesas por su largo, y si el largo es igual desempato por ancho.
		Collections.sort(mesas, new Comparator<Object>() {
		    @Override
		    public int compare(Object a1, Object a2) {
		        int m = ((Mesa)a2).largo-((Mesa)a1).largo;
		        if(m!=0) return m;
		        else return ((Mesa)a2).ancho-((Mesa)a1).ancho;
		    }
		});
		int i;
		int pilasmesadas = 0; // Variable a retornar.
		//Mientras haya mesas sin apilar.
		while(mesas.size() > 0)
		{
			i = 0;
			for(int j = 1; j<mesas.size(); j++)
			{
				//Si las mesas que estoy comparando no son las mismas y son compatibles.
				if(i != j && mesas.get(i).esCompatible(mesas.get(j)))
				{
					j--;
					mesas.remove(i);
				}
			}
			mesas.remove(i);
			pilasmesadas++;
		}
		return pilasmesadas;
	}
}
