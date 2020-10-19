package com.company.collection.comparator;




import com.company.domain.Person;

import java.util.Comparator;

public class GenericComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return (temp==0) ? (o1.getAge()-o2.getAge()):temp;
    }
    
}
