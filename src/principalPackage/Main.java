package principalPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//generadorCasoFatiga();
	}
	
	public static void generadorCasoFatiga() {
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(new File("Lote de Prueba/Entrada/07_Fatiga.in")));
			buffer.write(400000 + " " + 600);
			buffer.newLine();
			for (int i = 0; i < 300000; i++) {
				buffer.write("Pedro");
				buffer.newLine();
			}
			for (int i = 0; i < 100000; i++) {
				buffer.write("Luis");
				buffer.newLine();
			}
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
