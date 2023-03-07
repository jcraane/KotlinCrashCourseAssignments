package course.examples.delegates.java;

import course.examples.delegates.Person;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface PersonDao {
    @Nullable
    public Person getPerson(int id);
    public List<Person> getPersons();
    public void insertPerson(Person person);
    public void updatePerson(Person person);
    public void deletePerson(Person person);
}
