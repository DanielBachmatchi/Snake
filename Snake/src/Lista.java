import java.util.ArrayList;


public class Lista {
	ArrayList<Punto> p;
	
	public Lista() {
		p = new ArrayList<Punto>();
	}
	
	public void aggiungiPunto(Punto pn) {
		p.add(pn);
	}
	
	public void eliminaPunto(Punto n) {
		p.remove(n);
	}
	
	
}
