package be.businesstraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.businesstraining.domain.Book;

import java.util.List;

public interface IBooksRepository extends JpaRepository<Book,Long> {

    public List<Book>findAllByTitleContainingIgnoreCaseOrAuthorsContainingIgnoreCase(String title, String authors);

}
