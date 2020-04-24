package net.imwork.zhanlong.ssh.action.person;

import com.opensymphony.xwork2.ActionSupport;
import net.imwork.zhanlong.ssh.model.Person;
import net.imwork.zhanlong.ssh.service.PersonService;

public class UpdatePPerson extends ActionSupport
{
    private PersonService service;

    private Person person;

    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person)
    {
        this.person = person;
    }

    public PersonService getService()
    {
        return service;
    }

    public void setService(PersonService service)
    {
        this.service = service;
    }

    @Override
    public String execute() throws Exception
    {
        person = service.getPersonById(person.getId());

        return SUCCESS;
    }
}
