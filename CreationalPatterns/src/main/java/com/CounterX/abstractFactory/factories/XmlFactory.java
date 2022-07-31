package com.CounterX.abstractFactory.factories;

import com.CounterX.abstractFactory.pojo.User;

import java.io.*;
import java.util.Scanner;

public class XmlFactory implements AbstractFactory {
    @Override
    public User getUser(String xmlString) {
        User user = new User();
        try {
            Scanner scan = new Scanner(xmlString);
            String s = scan.nextLine();
            s = scan.nextLine();
            user.setId(Integer.parseInt(s.substring(5, 6)));
            s = scan.nextLine();
            String[] ss = s.split("</");
            ss = ss[0].split(">");
            user.setName(ss[1]);
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }
}
