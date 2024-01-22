package exercices;



public class Trader {

	private String name;
	private String city;

	public Trader(String n, String c) {
		name = n;
		city = c;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String newCity) {
		city = newCity;
	}

	@Override
	public int hashCode() {
		return (name == null ? 0 : name.hashCode()) + (city == null ? 0 : city.hashCode());
	}

	@Override
	public boolean equals(Object other) {

		if (other instanceof Trader) {
			Trader o = (Trader) other;
			return this.name == o.name && this.city == o.city;
		}

		return false;
	}

	@Override
	public String toString() {
		return String.format("Trader:%s in %s", name, city);
	}

}
