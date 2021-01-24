
public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto("Opel", "KA-KK-234");
		Person person = new Person("Jens", "Schmidt");
		person.setAuto(auto);

		System.out.println(person.getName() + " " + person.getVorname() + " drives the " + auto.getMarke()
				+ " car with the registration number " + auto.getKennzeichen());
	}

}
