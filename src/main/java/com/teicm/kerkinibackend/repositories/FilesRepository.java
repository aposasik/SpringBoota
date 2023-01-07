package com.teicm.kerkinibackend.repositories;

import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface FilesRepository extends CrudRepository<Files, Long>, org.springframework.data.repository.Repository<Files, Long> {

    Set<Files> findFilesByDeigmaThhlastikwnIs(DeigmaThhlastikwn deigmaThhlastikwn);

    Page<Files> findAll(Pageable pageable);
}
