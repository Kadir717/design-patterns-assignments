package prototype.document;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create original document
        List<String> tags = new ArrayList<>();
        tags.add("Java");
        tags.add("Programming");

        Document original = new Document(
                1,
                "Java Basics",
                "Learning Java programming.",
                "Kadir",
                tags
        );

        // Create factory
        DocumentFactory factory = new DocumentFactory(original);

        // Create two copies
        Document copy1 = factory.cloneDocument();
        Document copy2 = factory.cloneDocument();

        // Modify first copy
        copy1.setTitle("Advanced Java");
        copy1.setContent("Advanced Java topics.");
        copy1.getTags().add("Advanced");

        // Modify second copy
        copy2.setTitle("Python Basics");
        copy2.setContent("Learning Python programming.");
        copy2.getTags().clear();
        copy2.getTags().add("Python");

        // Print results
        System.out.println("Original Document:");
        System.out.println(original);

        System.out.println("\nFirst Copy:");
        System.out.println(copy1);

        System.out.println("\nSecond Copy:");
        System.out.println(copy2);

        System.out.println("\nOriginal == Copy1: "
                + (original == copy1));
    }
}