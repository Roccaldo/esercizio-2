public class Main {
	public static void main(String[] args) {
	Auto auto1 = new Auto("Audi", "A6", 300, "RTX7809");

	/*
	auto1.marca = "Audi";
	auto1.modello = "A6";
	auto1.cilindrata = 300;
	auto1.targa = "RT7809";
	 */

	System.out.println(auto1.getMarca());
	System.out.println(auto1.getCilindrata());
	System.out.println(auto1.getTarga());
	System.out.println(auto1.getModello());
	}
}