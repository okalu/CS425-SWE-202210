package edu.miu.cs.cs425.fairfieldlibraryapp.service;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;

import java.util.List;

public interface PublisherService {

    public abstract Iterable<Publisher> getPublishers();
    Publisher addNewPublisher(Publisher newPublisher);
    Publisher updatePublisher(Integer publisherId, Publisher editedPublisher);
    Publisher getPublisherById(Integer publisherId);
    void deletePublisherById(Integer publisherId);

}
