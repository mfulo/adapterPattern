package adapterPattern;

public class SmartphoneAdapter implements PowerOutlet{
	private SmartphoneCharger smartphone;
	public SmartphoneAdapter (SmartphoneCharger smartphone) {
		this.smartphone = smartphone;
	}
	@Override
	public String plugin() {
		return smartphone.chargePhone();
	}
}
