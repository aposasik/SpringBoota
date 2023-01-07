package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.PicturesRepository;
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
public class PicturesServiceImpl implements PicturesService {

    @Autowired
    PicturesRepository picturesRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    // For Mockito testing
    public void setPicturesRepository(PicturesRepository picturesRepository) {
        this.picturesRepository = picturesRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnRepository(DeigmaThhlastikwnRepository deigmaThhlastikwnRepository) {
        this.deigmaThhlastikwnRepository = deigmaThhlastikwnRepository;
    }

    @Override
    public boolean deletePicture(Long id) {
        try {
            Optional<Pictures> optionalPictures = picturesRepository.findById(id);

            if (optionalPictures.isPresent()){
                picturesRepository.delete(optionalPictures.get());
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Pictures getById(Long id) {
        try {
            Optional<Pictures> optionalPictures = picturesRepository.findById(id);

            if (optionalPictures.isPresent()){
                return optionalPictures.get();
            }else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Set<Pictures> getPicturesByDeigmaThhlastikwn(Long id) {
        try {
            // Getting the DeigmaThhlastikwn through the given id
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            // If DeigmaThhlastikwn exists, get and return the pictures
            if (optionalDeigmaThhlastikwn.isPresent()){
                return picturesRepository.findPicturesByDeigmaThhlastikwnIs(optionalDeigmaThhlastikwn.get());
            }else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<Pictures> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return picturesRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }
}
