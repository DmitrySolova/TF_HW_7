package com.company;

import java.util.Comparator;

public class CountComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o2.getCount(), o1.getCount());
    }

}
