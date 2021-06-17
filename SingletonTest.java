package ru.mai;

class SingletonTest {
    public static void main(String[] args){
        Singleton singelton = Singleton.getInstance();
        singelton.setUp();
    }
}
