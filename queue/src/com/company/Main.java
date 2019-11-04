package com.company;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Queue<Integer> queue = new ArrayDeque<>(); //неотсортированная очередь
        Queue<Integer> oldQueue = new ArrayDeque<>(); //очередь пенсионеров
        Queue<Integer> restQueue = new ArrayDeque<>(); //оставшаяся очередь
        Queue<Integer> sortQueue = new ArrayDeque<>(); //отсортированная очередь

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число человек в очереди: ");
        int countPeople = in.nextInt();

        for (int i = 0; i < countPeople; i++){
            System.out.println("Введите возраст человека: ");
            int age = in.nextInt();
            queue.add(age);
        }

        for (int age : queue) {
            if (age >= 65) {
                oldQueue.add(age);
            } else {
                restQueue.add(age);
            }
        }
        in.close();

        if (!oldQueue.isEmpty()) {
            sortQueue.addAll(oldQueue);
        }
        if (!restQueue.isEmpty()) {
            sortQueue.addAll(restQueue);
        }

        while (!sortQueue.isEmpty()) {
            System.out.println(sortQueue.remove());
        }
    }

}
