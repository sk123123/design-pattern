package com.behavior.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Observer {
    List<Person> personList = new ArrayList<Person>();
    public Observer(){}
    public void addPerson(Person person){
        personList.add(person);
    }

    public void notifyPerson() {
        for(Person person:personList){
            person.getMessage("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}
