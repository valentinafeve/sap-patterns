package park;

public abstract class AttractionDecorator implements Base {

	private Base base;
	
	public AttractionDecorator(Base newBase) {
		base = newBase;
	}
	
	@Override
	public String whatsIncluded() {
		// TODO Auto-generated method stub
		return base.whatsIncluded();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return base.getPrice();
	}
}
