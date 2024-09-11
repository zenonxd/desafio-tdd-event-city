package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
