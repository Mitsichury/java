package alimentation.composant;

public class Glucide extends Aliment{

	private final static float NB_KCAL_PAR_G = 9f;
	
	public Glucide(float masse) {
		super(masse);
	}

	@Override
	public float calculerKcalParG() {		
		return this.getMasse()*NB_KCAL_PAR_G;
	}

	@Override
	public float getNbKcalParG() {
		return NB_KCAL_PAR_G;		
	}

	@Override
	public String toString() {
		return "Glucide ["+ this.calculerKcalParG() +"]";
	}

	
}
