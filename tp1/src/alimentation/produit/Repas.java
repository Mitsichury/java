package alimentation.produit;

import java.util.ArrayList;

public class Repas {

	ArrayList<ProduitAlimentaire>produit;
	public Repas() {
		this.produit = new ArrayList<ProduitAlimentaire>();
	}
	
	public void ajouterProduitAlimentaire(ProduitAlimentaire produit, int nombre){
		for (int i = 0; i < nombre; i++) {
			this.produit.add(produit);
		}
	}
	
	public float calculerNbKcalTotal(){
		float cal=0;
		for (ProduitAlimentaire pa : produit) {
			cal+=pa.calculerKcalProduit();
		}
		
		return cal;
	}
	
}
