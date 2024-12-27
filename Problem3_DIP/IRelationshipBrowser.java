import java.util.List;

interface IRelationshipBrowser {
    List<Person> findAllStatusOf(String name, RelationshipStatus status);
}
