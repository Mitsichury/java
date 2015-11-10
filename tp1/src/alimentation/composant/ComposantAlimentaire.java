package alimentation.composant;

import alimentation.util.Masse;

public interface ComposantAlimentaire extends Masse {
	float calculerKcalParG();
	float getNbKcalParG();
}
