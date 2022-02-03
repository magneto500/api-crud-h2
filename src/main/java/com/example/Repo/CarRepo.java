package com.example.Repo;

import com.example.Entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepo extends JpaRepository<Cars, Long> {
}
