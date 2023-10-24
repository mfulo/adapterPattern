# Problem Statement
<p align=center>Plugging Devices into Power Outlets</p>
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets.
Each device has different plug types, voltage, and amperage requirements.
To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.
<br><br>
   <b>Adaptee Objects:</b>
   <br>
		> Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.
    <br>
		> Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.
    <br>
		> SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.
    <br><br>
	  <b>Target Object:</b>
    <br>
		> PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.
    <br><br>
	  <b>Adapter Objects:</b>
     <br>
		> LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().
    <br>
		> RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
    <br>
		> SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().
  
