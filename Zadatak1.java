package zadaci;

import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int min=0;
		int max=0;
		int zb=0;
		
		for (int i=1;i<25;i++) {
			
			int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi " + i + ". broj"));
			if (i==1) {
				min=broj;
				max=broj;
			}
			if (broj<min) {
				min=broj;
			}
			if (broj>max) {
				max=broj;
			}
			zb=zb+broj;
		}
		System.out.println("Zbroj: " + zb + ", najmanji broj: " + min + ", najveci broj: " + max);

	}

}
