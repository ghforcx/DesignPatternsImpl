package com.CounterX.facadePattern;

public class ServerFacade {

    private ServerA sa = new ServerA();
    private NewServerA nsa = new NewServerA();
    private ServerB sb = new ServerB();

    private boolean update;

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public void run(String s) {
        switch (s) {
            case "A" -> {
                if (update) nsa.doTask();
                else sa.doTask();
            }
            case "B" -> {
                sb.getConnection();
            }
        }
    }
}
