package org.example.webdevtask.service;
import org.example.webdevtask.entity.Role;
import org.example.webdevtask.pojo.RolePojo;

import java.util.List;
import java.util.Optional;
public interface RoleService {
    void saveData(RolePojo rolePojo);
    List<Role> getAll();
    void deleteById(Integer id);
    Optional<Role> findById(Integer id);
}
