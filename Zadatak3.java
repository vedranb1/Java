package zadaci;

import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		
		boolean prim=true;
		int prvi=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		for (int p=prvi;p<drugi;p++) {
			for (int i=2;i<p;i++) {
				if (p%i==0) {
					prim=false;
				}
			}
			if (prim==true) {
				System.out.println(p);
				}
			prim=true;	
		
		}
		
	}

}
