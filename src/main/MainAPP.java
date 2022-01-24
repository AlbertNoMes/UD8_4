/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class MainAPP {

	public static void main(String[] args) {

		Serie s1 = new Serie();
		Serie s2 = new Serie("THE NONES' SHOW", "ALBERT NOTARIO");
		Serie s3 = new Serie("THE JAVA'S SHOW", 5, "Comedia", "ALBERT NOTARIO");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}
}