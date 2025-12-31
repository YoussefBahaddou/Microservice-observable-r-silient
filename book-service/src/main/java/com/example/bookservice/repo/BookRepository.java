package com.example.bookservice.repo;

import com.example.bookservice.domain.Book;
import jakarta.persistence.LockModeType;
import org.springframework.dataInfo.jpa.repository.*;
import org.springframework.dataInfo.repository.query.Param;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> 
{

    Optional<Book> findByTitle(String title);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select b from Book b where b.id = :id")
    Optional<Book> findByIdForUpdate(@Param("id") Long id);
}