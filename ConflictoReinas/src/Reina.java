
public class Reina 
{
	private int x;
	private int y;
	/* La cantidad maxima de conflictos que puede tener una reina son 8
	 * 2 en su misma fila
	 * 2 en su misma columna
	 * 2 en su misma diagonal derecha
	 * 2 en su misma diagonal izquierda
	*/
	//Posiciones de las reinas con las cuales conflictua.
	private Reina conflictos[] = new Reina[8];
	//Numero de las reinas con las cuales conflictua.
	private Integer conflictos2[] = new Integer[8];
	//Cantidad de conflictos actuales de la reina.
	private int conflictoscontador = 0;
	
	public Integer getConflicto2(int i)
	{
		return this.conflictos2[i];
	}
	
	public int getConflictosContador()
	{
		return this.conflictoscontador;
	}
	
	public Reina(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//Metodos que detectan conflictos.
	/*public boolean conflictoColumnaoFila(Reina otra)
	{
		return (this.y == otra.y) || (this.x == otra.x);
	}
	
	public boolean conflictoDiagonal(Reina otra)
	{
		return (this.x - otra.x == this.y - otra.y) || (this.x - otra.x == (this.y-otra.y)*-1);
	}*/
	
	public boolean conflicto0(Reina otra)
	{
		return (this.y == otra.y) && (this.x > otra.x);
	}
	
	public boolean conflicto1(Reina otra)
	{
		return (this.y == otra.y) && (this.x < otra.x);
	}
	
	public boolean conflicto2(Reina otra)
	{
		return (this.x == otra.x) && (this.y > otra.y);
	}
	
	public boolean conflicto3(Reina otra)
	{
		return (this.x == otra.x) && (this.y < otra.y);
	}
	
	public boolean conflicto4(Reina otra)
	{
		return (this.x - otra.x == this.y - otra.y) && (this.x - otra.x)>0;
	}
	
	public boolean conflicto5(Reina otra)
	{
		return (this.x - otra.x == this.y - otra.y) && (this.x - otra.x)<0;
	}
	
	public boolean conflicto6(Reina otra)
	{
		return (this.x - otra.x == (this.y-otra.y)*-1) && (this.x - otra.x)<0;
	}
	
	public boolean conflicto7(Reina otra)
	{
		return (this.x - otra.x == (this.y-otra.y)*-1) && (this.x - otra.x)>0;
	}
	
	public void setConflicto0(Reina otra, int nreina)
	{
		if(this.conflictos[0] == null)
		{
			this.conflictos[0] = otra;
			this.conflictos2[0] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[0]))
		{
			this.conflictos[0] = otra;
			this.conflictos2[0] = nreina;
		}	
	}
	
	public void setConflicto1(Reina otra, int nreina)
	{
		if(this.conflictos[1] == null)
		{
			this.conflictos[1] = otra;
			this.conflictos2[1] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[1]))
		{
			this.conflictos[1] = otra;
			this.conflictos2[1] = nreina;
		}	
	}
	
	public void setConflicto2(Reina otra, int nreina)
	{
		if(this.conflictos[2] == null)
		{
			this.conflictos[2] = otra;
			this.conflictos2[2] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[2]))
		{
			this.conflictos[2] = otra;
			this.conflictos2[2] = nreina;
		}	
	}
	
	public void setConflicto3(Reina otra, int nreina)
	{
		if(this.conflictos[3] == null)
		{
			this.conflictos[3] = otra;
			this.conflictos2[3] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[3]))
		{
			this.conflictos[3] = otra;
			this.conflictos2[3] = nreina;
		}	
	}
	
	public void setConflicto4(Reina otra, int nreina)
	{
		if(this.conflictos[4] == null)
		{
			this.conflictos[4] = otra;
			this.conflictos2[4] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[4]))
		{
			this.conflictos[4] = otra;
			this.conflictos2[4] = nreina;
		}	
	}
	
	public void setConflicto5(Reina otra, int nreina)
	{
		if(this.conflictos[5] == null)
		{
			this.conflictos[5] = otra;
			this.conflictos2[5] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[5]))
		{
			this.conflictos[5] = otra;
			this.conflictos2[5] = nreina;
		}	
	}
	
	public void setConflicto6(Reina otra, int nreina)
	{
		if(this.conflictos[6] == null)
		{
			this.conflictos[6] = otra;
			this.conflictos2[6] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[6]))
		{
			this.conflictos[6] = otra;
			this.conflictos2[6] = nreina;
		}	
	}
	
	public void setConflicto7(Reina otra, int nreina)
	{
		if(this.conflictos[7] == null)
		{
			this.conflictos[7] = otra;
			this.conflictos2[7] = nreina;
			this.conflictoscontador++;
		}
		else if(this.distanciaEntreDosReinas(otra) < this.distanciaEntreDosReinas(this.conflictos[7]))
		{
			this.conflictos[7] = otra;
			this.conflictos2[7] = nreina;
		}	
	}
	
	public int distanciaEntreDosReinas(Reina otra)
	{
		return (int) Math.sqrt(Math.pow(this.x-otra.x, 2) + Math.pow(this.y-otra.y, 2));
	}
}

/* En conflictos posicion
 * 0: Guardo el conflicto de su misma columna(arriba) mas cercano.
 * 1: Guardo el conflicto de su misma columna(abajo) mas cercano.
 * 2: Guardo el conflicto de su misma fila(izquierda) mas cercano.
 * 3: Guardo el conflicto de su misma fila(derecha) mas cercano.
 * 4: Guardo el conflicto de su diagonal principal (izquierda) mas cercano.
 * 5: Guardo el conflicto de su diagonal principal (derecha) mas cercano.
 * 6: Guardo el conflicto de su diagonal secundaria (izquierda) mas cercano.
 * 7: Guardo el conflicto de su diagonal secundaria (derecha) mas cercano.
 */
