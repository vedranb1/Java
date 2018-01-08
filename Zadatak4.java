package zadaci;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int a [][]= new int [4][4];
		int b [][]= new int [4][4];
		int c [][]= new int [4][4];
		
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				a [i][j]=Integer.parseInt(JOptionPane.showInputDialog("Unesi a" + (i+1) + (j+1)));
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				b [i][j]=Integer.parseInt(JOptionPane.showInputDialog("Unesi b" + (i+1) + (j+1) ));
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				c [i][j]= a[i][j] + b[i][j];
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(c[i][j] + " ");
			}
		System.out.println("");
		}

	}

}
