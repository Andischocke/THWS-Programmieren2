package exercise16.task1;

import java.io.*;

public class ProgramSplitter {

	public void splitProgram(String path) throws MatriculationException {
		BufferedReader br = null;
		BufferedWriter bwInformaticsAbstract = null;
		BufferedWriter bwInformaticsBusiness = null;
		BufferedWriter bwElectronicsCommerce = null;

		try {
			br = new BufferedReader(new FileReader(path));
			bwInformaticsAbstract = new BufferedWriter(new FileWriter("resources\\output\\exercise16InformaticsAbstract.txt"));
			bwInformaticsBusiness = new BufferedWriter(new FileWriter("resources\\output\\exercise16InformaticsBusiness.txt"));
			bwElectronicsCommerce = new BufferedWriter(new FileWriter("resources\\output\\exercise16ElectronicsCommerce.txt"));

			String data;
			while ((data = br.readLine()) != null) {
				if (Integer.parseInt(data) >= 5000000 && Integer.parseInt(data) < 5100000) {
					bwInformaticsAbstract.write(data);
					bwInformaticsAbstract.newLine();
				} else if (Integer.parseInt(data) >= 5100000 && Integer.parseInt(data) < 5200000) {
					bwInformaticsBusiness.write(data);
					bwInformaticsBusiness.newLine();
				} else if (Integer.parseInt(data) >= 6100000 && Integer.parseInt(data) < 6200000) {
					bwElectronicsCommerce.write(data);
					bwElectronicsCommerce.newLine();
				} else {
					throw new MatriculationException("Invalid matriculation number");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bwInformaticsAbstract.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bwInformaticsBusiness.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bwElectronicsCommerce.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// a) Buffered Reader eignen sich zum zeilenweise Einlesen
		
		try {
			new ProgramSplitter().splitProgram("resources\\exercise16MatriculationNumbers.txt");
			new ProgramSplitter().splitProgram("resources\\exercise16MatriculationNumbersError.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}