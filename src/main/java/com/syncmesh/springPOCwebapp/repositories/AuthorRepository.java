package com.syncmesh.springPOCwebapp.repositories;

import com.syncmesh.springPOCwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
