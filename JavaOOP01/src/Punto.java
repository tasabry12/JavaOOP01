
public class Punto {
	
//stato interno
	private int x=0;
	private int y=0;

	
	//METODI
	
	//costruttori
	public Punto(int _x, int _y) {
		x = _x; setY(_y);
	}
	
	public Punto(int _x)
	{
	this(_x,0);	
	}
	//setter
	public void setX(int _x){
		x=_x;		
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//altro	
	public int LocalizzaQuadrante(){
		if (x>0 && y>0)
			return 1;
		else 
			if (x<0 && y>0)
				return 2;
			else
				if (x<0 && y<0)
					return 3;
				else
					if (x>0 && y<0)
						return 4;
					else 
						return 99;
	}
	
	
}
