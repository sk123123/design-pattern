package com.behavior.Observer;
/**
 * 测试
 */

public class ObserverRunTest {
    public static void main(String[] args) {
        Observer observer = new Observer();
        PersonA personA = new PersonA();
        PersonB personB = new PersonB();
        PersonC personC = new PersonC();
        observer.addPerson(personA);
        observer.addPerson(personB);
        observer.addPerson(personC);
        observer.notifyPerson();
    }
}
