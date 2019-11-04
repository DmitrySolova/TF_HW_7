package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("--- --- ---");
        System.out.println("Сортировка по имени:");

        NameComparator productComparator1= new NameComparator();
        Set<Product> products1 = new TreeSet<>(productComparator1);
        products1.add(new Product("Samsung", 12));
        products1.add(new Product("Apple", 5));
        products1.add(new Product("Fly", 18));
        products1.add(new Product("Lenovo", 168));
        products1.add(new Product("Meizu", 298));
        products1.add(new Product("Asus", 69));
        products1.add(new Product("Huawei", 0));
        products1.add(new Product("LG", 76));
        products1.add(new Product("Xiomi", 2));

        for (Product s : products1) {
            System.out.println(s.getName() + " - " + s.getCount());
        }


        System.out.println("--- --- ---");
        System.out.println("Сортировка по количеству:");

        CountComparator productComparator2 = new CountComparator();
        Set<Product> products2 = new TreeSet<>(productComparator2);
        products2.add(new Product("Samsung", 12));
        products2.add(new Product("Apple", 5));
        products2.add(new Product("Fly", 18));
        products2.add(new Product("Lenovo", 168));
        products2.add(new Product("Meizu", 298));
        products2.add(new Product("Asus", 69));
        products2.add(new Product("Huawei", 0));
        products2.add(new Product("LG", 76));
        products2.add(new Product("Xiomi", 2));

        for (Product s : products2) {
            System.out.println(s.getName() + " - " + s.getCount());
        }

    }
}
