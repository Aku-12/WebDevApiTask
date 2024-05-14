package org.example.webdevtask.service;
import org.example.webdevtask.entity.Book;
import org.example.webdevtask.pojo.BookPojo;

import java.util.List;
import java.util.Optional;

public interface BookService {

    void saveData(BookPojo bookPojo);
    List<Book> getAll();

    void deleteById(Integer id);
    Optional<Book> findById(Integer id);
}
