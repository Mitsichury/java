package alimentation.util;

public class MasseImpl  implements Masse{

	private float masse;
	
	public MasseImpl(float masse) {
		this.masse = masse;
	}
	
	@Override
	public float getMasse(){
		return this.masse;
	}

}
