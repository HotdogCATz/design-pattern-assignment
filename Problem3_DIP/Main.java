import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person dad = new Person("John");
        Person mom = new Person("Marry");
        Person olderBrother = new Person("Chris");
        Person youngerBrother = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(dad, olderBrother);
        relationships.addParentAndChild(dad, youngerBrother);
        relationships.addParentAndChild(mom, olderBrother);
        relationships.addParentAndChild(mom, youngerBrother);
        relationships.addSibling(olderBrother, youngerBrother);

        List<Person> johnsChildren = Research.research(relationships, "John", RelationshipStatus.PARENT);
        johnsChildren.forEach(child -> System.out.println("John has a child called " + child));

        List<Person> marysChildren = Research.research(relationships, "Marry", RelationshipStatus.PARENT);
        marysChildren.forEach(child -> System.out.println("Marry has a child called " + child));

        List<Person> chrisParents = Research.research(relationships, "Chris", RelationshipStatus.CHILD);
        chrisParents.forEach(parent -> System.out.println("Chris has a parent called " + parent));

        List<Person> mattsSiblings = Research.research(relationships, "Matt", RelationshipStatus.SIBLING);
        mattsSiblings.forEach(sibling -> System.out.println("Matt has a sibling called " + sibling));
    }
}