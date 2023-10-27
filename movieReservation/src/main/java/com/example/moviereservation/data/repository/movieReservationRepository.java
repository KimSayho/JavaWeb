package com.example.moviereservation.data.repository;

import com.example.moviereservation.data.entity.movieTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieReservationRepository extends JpaRepository<movieTable, Long> {
}
