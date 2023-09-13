
public class Laptop {

	private Laptop(String pemilik, String merek, int harga) {
		System.out.println("Object Laptop " + merek+
				"milik " + pemilik + " dengan Harga " + harga + " Telah dibuat");
	}
	
	public static void main(String[] args) {
		new Laptop("Halim", "Acer", 3000000);
		new Laptop("Abdul", "Asus", 3000000);
		new Laptop("hh", "Lenovo", 3000000);
	}
}
