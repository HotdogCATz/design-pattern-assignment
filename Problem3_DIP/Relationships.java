import java.util.ArrayList;
import java.util.List;

class Relationships implements IRelationshipBrowser {
    private List<RelationStore<Person, RelationshipStatus, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new RelationStore<>(parent, RelationshipStatus.PARENT, child));
        relations.add(new RelationStore<>(child, RelationshipStatus.CHILD, parent));
    }

    public void addSibling(Person sibling1, Person sibling2) {
        relations.add(new RelationStore<>(sibling1, RelationshipStatus.SIBLING, sibling2));
        relations.add(new RelationStore<>(sibling2, RelationshipStatus.SIBLING, sibling1));
    }

    @Override
    public List<Person> findAllStatusOf(String name, RelationshipStatus status) {
        return relations.stream()
                .filter(x -> x.getValue0().name.equals(name) && x.getValue1() == status)
                .map(RelationStore::getValue2)
                .toList();
    }
}