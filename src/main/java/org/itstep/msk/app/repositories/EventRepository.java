package org.itstep.msk.app.repositories;

import org.itstep.msk.app.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
//    Iterable<Event> findAll();
}
