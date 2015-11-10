package alimentation.produit;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;

public class testRepas {

	public static void main(String[] args) {
		ProduitAlimentaire steack = new ProduitAlimentaire(new Proteine(27), new Lipide(8), new Glucide(0));		
		ProduitAlimentaire oeuf = new ProduitAlimentaire(new Proteine(6.3f), new Lipide(4.6f), new Glucide(0.9f));;
		ProduitAlimentaire carottes = new ProduitAlimentaire(new Proteine(0.8f), new Lipide(0), new Glucide(8));;
		ProduitAlimentaire tomate = new ProduitAlimentaire(new Proteine(4), new Lipide(1), new Glucide(1));;
		ProduitAlimentaire lait = new ProduitAlimentaire(new Proteine(6.3f), new Lipide(0.2f), new Glucide(9.6f));;
		ProduitAlimentaire riz = new ProduitAlimentaire(new Proteine(14), new Lipide(4.4f), new Glucide(154));;
	
	Repas repas = new Repas();
	repas.ajouterProduitAlimentaire(steack, 3);
	repas.ajouterProduitAlimentaire(oeuf, 6);
	repas.ajouterProduitAlimentaire(carottes, 10);
	repas.ajouterProduitAlimentaire(tomate, 3);
	repas.ajouterProduitAlimentaire(lait, 5);
	repas.ajouterProduitAlimentaire(riz, 5);
	
	System.out.println(repas.calculerNbKcalTotal());
	}

	
}
