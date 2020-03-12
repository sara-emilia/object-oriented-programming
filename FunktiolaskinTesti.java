package test;

import laskin.FunktioLaskin;
import java.math.*;

public class FunktioLaskinTesti {
	
	public void suoritatestit() {
		
		FunktioLaskin f = new FunktioLaskin();
		
		f.testaaPotenssilasku();
		f.testaaNeliojuuri();
		
	}
	
	public void testaaPotenssilasku() {
		
		int oikeavastaus = Math.pow(2, 3);
		int laskinvastaus = f.potenssi(2, 3);
		
		assert laskinvastaus == oikeavastaus;
	}
	
	public testaaNeliojuuri() {
		
		double oikeavastaus = Math.sqrt(4);
		double laskinvastaus = f.neliojuuri(4);
		
		assert laskinvastaus == oikeavastaus;
	}
}