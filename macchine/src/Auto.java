public class Auto {
	public String marca;
	public String modello;
	public int cilindrata;
	public String targa;

	public Auto(String marca, String modello, int cilindrata, String targa) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public String getModello() {
		return modello;
	}
	public String getTarga() {
		return targa;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setModello(String modello){
		this.modello = modello;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public void setTarga(String targa){
		this.targa = targa;
	}

	@Override
	public String toString() {
		return "Auto{" +
				"cilindrata=" + cilindrata +
				", marca='" + marca + '\'' +
				", modello='" + modello + '\'' +
				", targa='" + targa + '\'' +
				'}';
	}
}

