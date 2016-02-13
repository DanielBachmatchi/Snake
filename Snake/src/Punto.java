public class Punto {

	private int x;
	private int y;

	public Punto() { // costruttore
		this.x = 1; // 1<=x<=80
		this.y = 1; // 1<=y<=25
	}

	public Punto(int valX, int valY) {
		setX(valX);
		setY(valY);
	}

	public Punto(Punto q) {
		x = q.getX();
		y = q.getY();
	}

	public void setX(int x) {
		if (x >= 1 && x <= 80) {
			this.x = x;
		}

	}

	public void setY(int y) {
		if (y >= 1 && y <= 25) {
			this.y = y;
		}
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public String toString() {
		return "Il punto è (x=" + x + ", y=" + y + ")";
	}

	public boolean equals(Punto q) {
		return (x == q.getX() && y == q.getY());
	}

	public double distanza() {
		double d;
		d = Math.sqrt(x * x + y * y);
		return d;
	}

	public double distanza(Punto q) {
		double d;
		double diffx;
		double diffy;

		diffx = this.x - q.getX();
		diffy = this.y - q.getY();

		d = Math.sqrt(diffx * diffx + diffy * diffy);

		return d;
	}

	public Punto sommaPunto(Punto q) {
		Punto p3 = new Punto();
		p3.setX(x + q.getX());
		p3.setY(y + q.getY());
		return p3;
	}

	public Punto media(Punto q) {
		Punto p3 = new Punto();
		p3.setX((x + q.getX()) / 2);
		p3.setY((y + q.getY()) / 2);
		return p3;
	}

}
