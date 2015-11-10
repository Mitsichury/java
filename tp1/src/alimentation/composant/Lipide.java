package alimentation.composant;

public class Lipide extends Aliment{

	private final static float NB_KCAL_PAR_G = 4f;
	
	public Lipide(float masse) {
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
		return "Lipides["+ this.calculerKcalParG() +"]";
	}

	
}
