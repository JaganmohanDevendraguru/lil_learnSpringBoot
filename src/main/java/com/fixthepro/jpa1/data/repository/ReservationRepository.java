package com.fixthepro.jpa1.data.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fixthepro.jpa1.data.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>{

	Iterable<Reservation> findReservationByDate(Date date);
}
