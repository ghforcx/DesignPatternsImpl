package com.CounterX.singletonPattern;

public enum EnumSingleton {
    INSTANCE;

    static {
        System.out.println("枚举类被初始化了");
    }
    private int id = 3;
    private String name = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return super.toString() + "@" + Integer.toHexString(hashCode());
    }
}
