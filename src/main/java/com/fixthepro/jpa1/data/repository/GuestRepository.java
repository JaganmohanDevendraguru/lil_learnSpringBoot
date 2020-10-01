package com.fixthepro.jpa1.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fixthepro.jpa1.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

	Guest findByGuestId(long id);
}
