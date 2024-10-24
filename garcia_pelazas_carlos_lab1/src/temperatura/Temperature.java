package temperatura;

public class Temperature {

	private double celsius;
	private double fahrenheit;
	
	private boolean celsiusOk;
	private boolean fahrenheitOk;
	
	public Temperature(double celsiusValue) {
		this.celsius = celsiusValue;
	}
	
	public void setCelsius(double value) {
		celsiusOk = true;
		this.celsius = value;
		fahrenheitOk = false;
	}
	
	public void setFahrenheit(double value) {
		fahrenheitOk = true;
		this.fahrenheit = value;
		celsiusOk = false;
	}
	
	public double getCelsius() {
		//this.fahrenheit = 
		if(celsiusOk)
			return this.celsius;
		assert fahrenheitOk;
		return (this.fahrenheit - 32) * 5 / 9;
	}
	
	public double getFahrenheit() {
		if(fahrenheitOk)
			return this.fahrenheit;
		assert celsiusOk;
		return this.celsius * 9 / 5 + 32;
	}
}
