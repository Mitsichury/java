package alimentation.produit;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;

public class ProduitAlimentaire {

	private Lipide lipide;
	private Glucide glucide;
	private Proteine proteine;
	
	public ProduitAlimentaire(Proteine proteine, Lipide lipide, Glucide glucide) {
		this.lipide = lipide;
		this.glucide = glucide;
		this.proteine = proteine;
	}
	
	public float calculerKcalProduit(){
		return lipide.calculerKcal()+glucide.calculerKcal()+proteine.calculerKcal();
	}
	
	@Override
	public String toString(){
		return lipide + " " +glucide + " " + proteine;
	}

}
