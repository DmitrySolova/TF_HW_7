package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stock stock = new Stock();

        stock.push("Ряженка");
        stock.push("Кумыс");
        stock.push("Кумыс");
        stock.push("Кумыс");
        stock.push("Кумыс");
        stock.push(null);
        stock.push("Ряженка");


        for (Iterator it = stock.iterator(); it.hasNext(); ) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
