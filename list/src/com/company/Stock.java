package com.company;

import java.util.*;

public class Stock implements Iterable {

    private String[] array = new String[0];

    public void push (String productName) {
        if (productName == null) {
            productName = "null";
        }
        String[] array2 = Arrays.copyOf(array, array.length + 1);
        array2[array2.length - 1] = productName;
        array = Arrays.copyOf(array2, array2.length);
    }

    @Override
    public Iterator iterator() {
        class iterator<String> implements Iterator<String> {

            int currentPosition = 0;

            @Override
            public boolean hasNext() {
                return currentPosition < array.length;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    return null;
                }
                String s = (String) array[currentPosition];
                currentPosition++;
                return s;
            }

            @Override
            public void remove() {
                array = Arrays.copyOfRange(array, currentPosition,array.length - 1);
            }
        }
        return new iterator();
    }

}

