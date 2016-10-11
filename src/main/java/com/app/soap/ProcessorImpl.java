package com.app.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ProcessorImpl implements Processor{

    private List<Person> data = new ArrayList<Person>();

    @WebMethod
    public void save(Person p) {
        data.add(p);
    }
    @WebMethod
    public List<Person> getAllPersons() {
        return data;
    }

}
