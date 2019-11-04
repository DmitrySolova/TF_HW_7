package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner passIn = new Scanner(System.in);
        Scanner logIn = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число пользователей:");
        int capacity = in.nextInt();

        Map<String, String> data = new HashMap<String, String>(capacity);

        for (int i = 0; i < capacity; i++){
            System.out.println("Пользователь #" + Integer.toString(i + 1));
            System.out.println("Введите логин:");
            String login = logIn.nextLine();
            System.out.println("Введите пароль:");
            String password = passIn.nextLine();
            data.put(login, password);
        }

        String login;
        do {
            System.out.println("Введите логин для поиска пароля:");
            login = logIn.nextLine();
            if (!data.containsKey(login)) {
                System.out.println("Нет пользователя с таким логином!");
            } else {
                System.out.println("Пароль - " + data.get(login));
            }
        } while (!data.containsKey(login));

        in.close();
        logIn.close();
        passIn.close();
    }
}
