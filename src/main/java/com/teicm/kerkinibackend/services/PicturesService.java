package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Pictures;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public interface PicturesService {

    boolean deletePicture(Long id);

    Pictures getById(Long id);

    Set<Pictures> getPicturesByDeigmaThhlastikwn(Long id);

    Page<Pictures> getAllByPaging(Integer page);
}
