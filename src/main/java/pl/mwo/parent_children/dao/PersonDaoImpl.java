package pl.mwo.parent_children.dao;

import pl.mwo.parent_children.model.Person;

import java.sql.Connection;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private Connection dbConnection;

    public PersonDaoImpl(Connection connection) {
        this.dbConnection = connection;
    }

    @Override
    public boolean savePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        return false;
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public List<Person> getAllPersons() {
        return null;
    }
}
