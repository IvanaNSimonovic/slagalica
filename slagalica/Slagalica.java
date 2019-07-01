package slagalica;

import java.util.Timer;
import java.util.TimerTask;

public class Slagalica {

	public static void main(String[] args) {
		int brSlova=12;
		int d;
		String azbuka = "АБВГДЂЕЖЗИЈКЛЉМНЊОПРСТЋУФХЦЧЏШ";

		for(int i=0; i<brSlova; i++) {
			d=(int)(Math.random()*30);
			System.out.print(azbuka.charAt(d)+" ");
		}
		
		Timer t=new Timer();
		
	}

}
