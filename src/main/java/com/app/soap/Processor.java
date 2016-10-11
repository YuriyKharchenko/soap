package com.app.soap;

import java.util.List;

public interface Processor {
    public void save(Person p);

    public List<Person> getAllPersons();

}
