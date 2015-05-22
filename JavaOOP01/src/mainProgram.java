
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto p1, p2;
		
		p1 = new Punto(23,-12); 
		
		p2= new Punto(3);
		
		System.out.println("Il punto si trova nel quadrante numero " + p1.LocalizzaQuadrante());
		
		//p1.x = 123;   NO sono variabii private
		//p1.y = -67;
		
//		p1.setY(900);
//		
//		System.out.println(p1.getY());


	}

}
