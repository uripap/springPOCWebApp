package com.syncmesh.springPOCwebapp.repositories;

import com.syncmesh.springPOCwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long> {
}
