package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Files;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface FilesService {

    boolean deleteFile(Long id);

    Files getById(Long id);

    Set<Files> getFilesByDeigmaThhlastikwn(Long id);

    Page<Files> getAllByPaging(Integer page);
}
