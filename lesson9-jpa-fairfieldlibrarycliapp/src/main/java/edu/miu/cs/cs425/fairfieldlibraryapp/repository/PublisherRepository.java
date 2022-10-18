package edu.miu.cs.cs425.fairfieldlibraryapp.repository;

import edu.miu.cs.cs425.fairfieldlibraryapp.model.Address;
import edu.miu.cs.cs425.fairfieldlibraryapp.model.Publisher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Integer> {
    @Query(value = "select p from Publisher p where p.name = :name")
    Optional<Publisher> getPublisherByName(String name);

    @Query(value = "SELECT * FROM `cs425-swe-202210-fairfieldlibrarydb`.publishers p\n" +
            "where p.name like '%apress% ", nativeQuery = true)
    List<Publisher> getPublishersByName(String name);

    List<Publisher> findPublishersByNameContainsAndPrimaryAddress(String name, Address addr);
}
