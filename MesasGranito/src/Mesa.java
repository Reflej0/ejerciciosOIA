public class Mesa 
{
	public int largo;
	public int ancho;
	
	public Mesa(int largo, int ancho)
	{
		this.largo = largo;
		this.ancho = ancho;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ancho;
		result = prime * result + largo;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		if (ancho != other.ancho)
			return false;
		if (largo != other.largo)
			return false;
		return true;
	}

	public boolean esCompatible(Mesa m)
	{
		return this.largo >= m.largo && this.ancho >= m.ancho;
	}
	
	public String toString()
	{
		return "Largo: " + this.largo + " Ancho: " + this.ancho;
	}
}
