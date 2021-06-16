package ru.mai;

class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        System.out.println("setUp");
    }
}

class SingletonTest {//тест
    public static void main(String[] args){
        Singleton singelton = Singleton.getInstance();
        singelton.setUp();
    }
}
