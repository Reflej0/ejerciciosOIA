
public class Posicion 
{
	public int x;
	public int y;
	
	public Posicion(int i, int j) 
	{
		this.x = i;
		this.y = j;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		//Para el caso, se supone que 1, 2 es igual que 2, 1.
		if(x == other.y && other.y == x)
			return true;
		if(y == other.x && other.y == x)
			return true;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
