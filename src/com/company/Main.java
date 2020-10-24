package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
	ArrayList<String> Cod = new ArrayList<String>();
	Cod.add("MP5");
	Cod.add("M4A1");
	Cod.add("Barrett .50");
	Cod.add("Karr98");
	Cod.add("AX-50");
	Cod.add("HDR");
	System.out.println(Cod);
	Collections.reverse(Cod);
	System.out.println(Cod);


    }
}
