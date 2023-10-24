package adapterPattern;
import java.util.*;
public class User {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		while (true) {
			System.out.println("[1] Laptop");
			System.out.println("[2] Refrigerator");
			System.out.println("[3] Smartphone");
			System.out.println("[4] Exit");
			System.out.print("Choose device to be plugged into the power outlet: ");
			Integer choice = input.nextInt();
			
			switch (choice) {
				case 1:
					Laptop laptop = new Laptop();
					PowerOutlet laptopPO = new LaptopAdapter (laptop);
					System.out.println(laptopPO.plugin());
					System.out.println();
					break;
				case 2:
					Refrigerator refrigerator = new Refrigerator();
					PowerOutlet refrigeratorPO = new RefrigeratorAdapter (refrigerator);
					System.out.println(refrigeratorPO.plugin());
					System.out.println();
					break;
				case 3:
					SmartphoneCharger smartphone = new SmartphoneCharger();
					PowerOutlet smartphonePO = new SmartphoneAdapter (smartphone);
					System.out.println(smartphonePO.plugin());
					System.out.println();
					break;
				case 4:
                	System.out.print("Terminating program...");
                	System.exit(0);
				default:
					System.out.println("Invalid number. Kindly choose again.");
					System.out.println();
                	continue;
			}
		}
	}
}
