import java.util.List;

public class ListHandler {
    private List<Person> personList;

    public ListHandler(List<Person> personList) {
        this.personList = personList;
    }

    public boolean isPersonByAgeExists (int age) {
        for (Person person : personList) {
            if (person.getAge() == age) {
                return true;
            }
        }
        return false;
    }
}
