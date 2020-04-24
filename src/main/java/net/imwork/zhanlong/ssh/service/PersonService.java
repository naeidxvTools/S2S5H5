package net.imwork.zhanlong.ssh.service;

import net.imwork.zhanlong.ssh.model.Person;

import java.util.List;

public interface PersonService
{
    public void savePerson(Person person);

    public List<Person> listAllPersons();

    public void removePerson(Person person);

    public void updatePerson(Person person);

    public Person getPersonById(Integer id);
}
