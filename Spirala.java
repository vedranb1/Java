package zadaci;

import javax.swing.JOptionPane;

public class Spirala {

	public static void main(String[] args) {
		
		int r=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int s=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		int niz [][]= new int [r][s];
		
		int st=s;
		int re=r;
		int mnozSt=1;
		int mnozRe=0;
		int dec;
		int br=1;
		
		for (int i=0;i<9999;i++) {
			dec=mnozSt*mnozRe;
			while (br<(st*mnozSt+re*mnozRe)-dec) {
				niz[r-1][s-1]=br;
				s--;
				br++;
			}
			if (br==st*re) {
				break;
			}
			mnozRe++;
			dec=mnozSt*mnozRe;
			while(br<(st*mnozSt+re*mnozRe)-dec) {
				niz[r-1][s-1]=br;
				r--;
				br++;
			}
			if (br==st*re) {
				break;
			}
			mnozSt++;
			dec=mnozSt*mnozRe;
			while (br<(st*mnozSt+re*mnozRe)-dec) {
				niz[r-1][s-1]=br;
				s++;
				br++;
			}
			if (br==st*re) {
				break;
			}
			mnozRe++;
			dec=mnozSt*mnozRe;
			while (br<=(st*mnozSt+re*mnozRe)-dec) {
				niz[r-1][s-1]=br;
				r++;
				br++;
			}
			mnozSt++;
			dec=mnozSt*mnozRe;
			r--;
			s--;
			if (br==st*re) {
				break;
			}
		}
	niz[r-1][s-1]=re*st;
	for (int g=0;g<re;g++) {
		for (int j=0;j<st;j++) {
			System.out.print(niz[g][j] + " ");
		}
		System.out.println("");
	}
		

	}

}
