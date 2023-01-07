package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.FilesRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    FilesRepository filesRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    // For Mockito testing
    public void setFilesRepository(FilesRepository filesRepository) {
        this.filesRepository = filesRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnRepository(DeigmaThhlastikwnRepository deigmaThhlastikwnRepository) {
        this.deigmaThhlastikwnRepository = deigmaThhlastikwnRepository;
    }

    @Override
    public boolean deleteFile(Long id) {
        try {
            Optional<Files> optionalFiles = filesRepository.findById(id);

            if (optionalFiles.isPresent()){
                filesRepository.delete(optionalFiles.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Files getById(Long id) {
        try {
            Optional<Files> optionalFiles = filesRepository.findById(id);

            if (optionalFiles.isPresent()){
                return optionalFiles.get();
            }else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Set<Files> getFilesByDeigmaThhlastikwn(Long id) {
        try {
            // Finding the given DeigmaThhlastikwn through the given if
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            // If DeigmaThhlastikwn exists, get Files and return them
            if (optionalDeigmaThhlastikwn.isPresent()){
                return filesRepository.findFilesByDeigmaThhlastikwnIs(optionalDeigmaThhlastikwn.get());
            } else {
                return null;
            }

        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<Files> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return filesRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

}
