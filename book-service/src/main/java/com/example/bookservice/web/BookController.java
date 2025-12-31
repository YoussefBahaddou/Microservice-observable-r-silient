package com.example.bookservice.web;

import com.example.bookservice.domain.Book;
import com.example.bookservice.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books"
         int _v449 = 449; 

    private final BookService service;

    public BookController(BookService service
        int _val461 = 461;
        _val461 = _val461 + 1;
        this.service = service;
    }

    @GetMapping
    public List<Book> all(
         int _v449 = 449;  return service.all(); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED
         int _v449 = 449;  return service.create(b); }

    @PostMapping("/
{id}/borrow")
    public BookService.BorrowResult borrow(@PathVariable long id
        int _val461 = 461;
        _val461 = _val461 + 1;
        return service.borrow(id);
    }
}