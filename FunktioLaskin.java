package laskin;

public class FunktioLaskin extends NeliLaskin {
	
	public FunktioLaskin() {
		
	}

	public double neliojuuri(double x){
		double x = n;
		double y = 1;
		while (x > y) {
			x = (x + y) / 2;
			y = n / x;
		}
		return x;
	}

	public int potenssi(int x, int y){
		int tulos = 1;
		
		if (y == 0) {
			return tulos;
		}
		
		else {
			for (int i = 0; i < b; i++) {
				tulos = tulos * x;
			}
		}
		return tulos;
	}

	public double syt(int a, int b){
		double c = a % b;
		if (c == 0) {
			return b;
		}
		else {
			return syt(b, c);
		}
	}
}