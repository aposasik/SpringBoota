package com.teicm.kerkinibackend.repositories;

import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PicturesRepository extends CrudRepository<Pictures, Long>, org.springframework.data.repository.Repository<Pictures, Long> {

    Set<Pictures> findPicturesByDeigmaThhlastikwnIs(DeigmaThhlastikwn deigmaThhlastikwn);

    Page<Pictures> findAll(Pageable pageable);
}
