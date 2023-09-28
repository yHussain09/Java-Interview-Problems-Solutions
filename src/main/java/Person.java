import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String telephoneNumber;

    public Person() {

    }

    public Person(String name, String telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Person A", "123478"));
        personList.add(new Person("Person B", "789456"));
        personList.add(new Person("Person C", "456789"));
        personList.add(new Person("Person D", "147852"));
        personList.add(new Person("Person A", "852963"));
        personList.add(new Person("Person B", "951263"));
        return personList;
    }

    Map<String, Set<String>> getPersonMap(List<Person> personList) {
        Map<String, Set<String>> personMap = personList.stream().collect(
                Collectors.groupingBy(
                        Person::getName, Collectors.mapping((Person p) -> p.getTelephoneNumber(), Collectors.toSet())
                ));
        return personMap;
    }

    public void printMap(Map<String, Set<String>> personMap) {
        for (Map.Entry<String, Set<String>> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
    }

}
