package edu.miu.cs.cs425.fairfieldlibraryapp;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Address;
import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;
import edu.miu.cs.cs425.fairfieldlibraryapp.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson9JpaFairfieldlibrarycliappApplication implements CommandLineRunner {

    @Autowired
    private PublisherService publisherService;

    public static void main(String[] args) {
        SpringApplication.run(Lesson9JpaFairfieldlibrarycliappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World SpringBoot");
        System.out.println("Starting FairfieldLibrary CLI Application...");
        var mcgrawHill = new Publisher(null, "McGraw-Hill Publishers");
        var apress = new Publisher(null, "Apress, Inc.");
        var pearsons = new Publisher(null, "Pearsons, Inc.");
        var addisonWesley = new Publisher(null, "Addison-Wesley, Inc.");
        var addisonWesleyAddress = new Address(null, "1200, Collins Avenue", "Miami", "FL", "71552", addisonWesley);
        addisonWesley.setPrimaryAddress(addisonWesleyAddress);

        // Creating 3 new publishers
//        publisherService.addNewPublisher(mcgrawHill);
//        publisherService.addNewPublisher(apress);
//        publisherService.addNewPublisher(pearsons);
//        publisherService.addNewPublisher(addisonWesley);
//         Display all publishers
        System.out.println("List of All Publishers");
        publisherService.getPublishers().forEach(
                publisher -> System.out.println(publisher)
        );

        // Update a publisher's name
//        var newMcGrawHill = new Publisher(null, "McGraw-Hill Publishers, Inc.");
//        var updatedPublisher = publisherService.updatePublisher(1, newMcGrawHill);
//        System.out.printf("Update Publisher: %s\n", updatedPublisher);

        // Delete a publisher by the publisher
//        publisherService.deletePublisherById(4);

        System.out.println("FairfieldLibrary CLI Application execution completed");
    }
}
