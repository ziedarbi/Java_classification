package ziedclassification;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Functions {
	
	private static ArrayList<String> list = new ArrayList<>();
	private static Integer k;
	public static void Kgramme() {

	Scanner sc = new Scanner(System.in);
	System.out.println("\n Entrer le k-Gramme:");
	k = sc.nextInt(); }
	public static void Lirefichier() {
	try {

	InputStream is = new FileInputStream("C:\\Bio-
	informatique\F1_2.txt");

	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	String sequence;

	while ((sequence = br.readLine()) != null) {
	for (int i = 0; i < sequence.length(); i++) {
	if (i <= sequence.length() - k) {
	list.add((sequence.substring(i, k + i)));
	}
	}
	}
	br.close();
	} catch (Exception e) {
	System.out.println(e.toString());
	}
	}
	public static void affichage() {
	for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
	}
	}
	}


