package org.example.webdevtask.repo;

import org.example.webdevtask.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroundRepo extends JpaRepository<Ground, Long> {

}