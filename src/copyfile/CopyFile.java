package copyfile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		
		 InputStream inputStream = null;
	        OutputStream outputStream = null;
	        try {
	            File archivoOriginal = new File("C:\\CopyFile\\origen.txt");
	            File archivoCopia = new File("C:\\CopyFile\\copia.txt");
	            inputStream = new FileInputStream(archivoOriginal);
	            outputStream = new FileOutputStream(archivoCopia);
	            byte[] buffer = new byte[1024];
	            int length;
	            while ((length = inputStream.read(buffer)) > 0) {
	                outputStream.write(buffer, 0, length);
	            }
	            inputStream.close();
	            outputStream.close();
	            System.out.println("Archivo copiado.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}
	
	


}
