package com.CounterX.abstractFactory.factories;

import com.CounterX.abstractFactory.pojo.User;

import java.util.Scanner;

public class JsonFactory implements AbstractFactory {
    @Override
    public User getUser(String xmlString) {
        User user = new User();
        try {
            Scanner scan = new Scanner(xmlString);
            String s = scan.nextLine();
            s = scan.nextLine();
            String[] ss = s.split(":");
            user.setId(Integer.parseInt(ss[1].trim()));
            s = scan.nextLine();
            ss = s.split("\"");
            user.setName(ss[3]);
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
}
