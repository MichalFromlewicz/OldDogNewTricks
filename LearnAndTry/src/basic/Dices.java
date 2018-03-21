package basic;

import java.util.Random;

public class Dices {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		int n = r.nextInt(100);
		int[] a = new int[n];
		int face1=0;
		int face2=0;
		int face3=0;
		int face4=0;
		int face5=0;
		int face6=0;
		int faceFactor=0;
		int faceFactor16=0;
		int face2To5=0;
		int face1Or6=0;
		int minMoveTo1=0;
		int minMoveTo6=0;
		int minMoveTo25=0;
		int minMove=0;
				
		if (n==0)
			System.out.println("Wypad³o 0. Brak wyniku");
		
		else if (n==1) {		
			int x = r.nextInt(6)+1;
			System.out.println("Wypad³o "+x);
			System.out.println("W tej sytucji nie trzeba obróciæ ani jednej koœci.");
		} else {			
			for (int i:a) {
				a[i]=r.nextInt(6)+1;
				System.out.println(a[i]);
				switch (a[i]) {
				case 1:
					face1++;
					if (face1>face1Or6) {
						face1Or6 = face1;
						faceFactor16 = 1;
					}
					break;
			
				case 2:
					face2++;
					if (face2>face2To5) {
						face2To5 = face2;
						faceFactor=2;
					}
					break;
				
				case 3:
					face3++;
					if (face3>face2To5) {
						face2To5 = face3;
						faceFactor=3;
					}
					break;
				
				case 4:
					face4++;
					if (face4>face2To5) {
						face2To5 = face4;
						faceFactor=4;
					}
					break;
				
				case 5:
					face5++;
					if (face5>face2To5) {
						face2To5 = face5;
						faceFactor=5;
					}
					break;

				default:
					face6++;
					if (face6>face1Or6) {
						face1Or6 = face6;
						faceFactor16=6;
					}
					break;
				}
			
			minMoveTo1=face6*2+n-face1-face6;
			minMoveTo6=face1*2+n-face1-face6;
			minMoveTo25=n-face2To5;	
				
			if (minMoveTo25<minMoveTo1) {
				minMove=minMoveTo25;
				}else if (minMoveTo1<minMoveTo6) {
					minMove=minMoveTo1;
					faceFactor=faceFactor16;
				}else {
					minMove=minMoveTo6;
					faceFactor=faceFactor16;
				}		
			}
			
			System.out.println("Dlapowy¿szych "+ n + " koœci:");
			System.out.println("1 wypad³a "+face1+" razy");
			System.out.println("2 wypad³a "+face2+" razy");
			System.out.println("3 wypad³a "+face3+" razy");
			System.out.println("4 wypad³a "+face4+" razy");
			System.out.println("5 wypad³a "+face5+" razy");
			System.out.println("6 wypad³a "+face6+" razy");
			System.out.println("ruchów do 1: "+ minMoveTo1);
			System.out.println("ruchów do 6: "+ minMoveTo6);
			System.out.println("ruchów do 2-5: "+ minMoveTo25);
			System.out.println("Minimalna iloœc ruchów to "+minMove+". Wszystkie koœci nale¿y obróciæ " + faceFactor +" do góry.");
			
		}				
	}
}