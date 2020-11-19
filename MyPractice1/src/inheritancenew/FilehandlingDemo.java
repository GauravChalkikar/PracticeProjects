package inheritancenew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandlingDemo {

	public static void main(String[] args) throws IOException {
		byte[] sdata;
		int rdata;

		File file = new File("D:\\vasantrao.txt");
		/*
		 * FileOutputStream fo=new FileOutputStream(file);
		 * 
		 * try { String s="this is Vasantrao"; sdata=s.getBytes(); fo.write(sdata); }
		 * catch (Exception e) { System.out.println("Error occured"); }
		 * System.out.println("Successfully write data");
		 */
		// fo.close();
		FileInputStream fi = new FileInputStream(file);
		while ((rdata = fi.read()) != -1) {
			System.out.print((char) rdata);
		}
		fi.close();
		FileWriter fw = new FileWriter(file);
		fw.write(100);

		fw.close();
	}

}
