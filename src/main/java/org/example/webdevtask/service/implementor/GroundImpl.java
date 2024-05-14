package org.example.webdevtask.service.implementor;

import lombok.RequiredArgsConstructor;
import org.example.webdevtask.entity.Ground;
import org.example.webdevtask.pojo.GroundPojo;
import org.example.webdevtask.repo.GroundRepo;
import org.example.webdevtask.service.GroundService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroundImpl implements GroundService {

    private final GroundRepo groundRepo;

    @Override
    public void saveData(GroundPojo groundPojo) {
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setName(groundPojo.getName());
        groundRepo.save(ground);
    }

    @Override
    public List<Ground> getAll() {
        return groundRepo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        groundRepo.deleteById(Long.valueOf(id));
    }

    @Override
    public Optional<Ground> findById(Integer id) {
        return groundRepo.findById(Long.valueOf(id));
    }
}
