package q5;

public class temp {

	private double temperature;

	public temp() {
		super();
		this.temperature = 0;
		
	}
	
	
	public double getTemperature() {
		return temperature;
	}
	
	public String celsiusToFahrenheit(String celsius) {
		return (celsius ) + 32;
		
	}
	public double faranheitTocelsius(double farenheit) {
		return (farenheit -32) * 5/9;
	}
}
