package park;

public class RollerCoaster extends AttractionDecorator {

	private Base base;
	
	public RollerCoaster(Base newBase) {
		super(newBase);
		
		this.base = newBase;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String whatsIncluded() {
		// TODO Auto-generated method stub
		return base.whatsIncluded() +  ", Roller Coaster";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return base.getPrice() + 5000;
	}
	
}
