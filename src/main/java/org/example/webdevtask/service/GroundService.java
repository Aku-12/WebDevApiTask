package org.example.webdevtask.service;

import org.example.webdevtask.entity.Ground;
import org.example.webdevtask.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {

    void saveData(GroundPojo groundPojo);
    List<Ground> getAll();

    void deleteById(Integer id);
    Optional<Ground> findById(Integer id);
}
