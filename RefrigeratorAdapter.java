package adapterPattern;

public class RefrigeratorAdapter implements PowerOutlet{
	private Refrigerator refrigerator;
	public RefrigeratorAdapter (Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}
	@Override
	public String plugin() {
		return refrigerator.startCooling();
	}
}
