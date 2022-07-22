package net.yorksolutions.springpractice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity, Long> {
}
