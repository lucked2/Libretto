package application.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		Esame tdp = new Esame("123","tdp","ls");
		System.out.println(tdp);
		Esame info = new Esame("456","info","ls");
		System.out.println(info);
		System.out.println(tdp.equals(info));
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18, LocalDate.now());
		System.out.println(tdp);
	}

}
