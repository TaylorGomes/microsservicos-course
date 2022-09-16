package com.taylorcosta.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taylorcosta.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
}
