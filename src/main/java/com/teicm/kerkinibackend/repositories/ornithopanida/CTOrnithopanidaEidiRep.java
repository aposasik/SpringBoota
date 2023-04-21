package com.teicm.kerkinibackend.repositories.ornithopanida;

import java.util.ArrayList;
import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Lazy
@Transactional
public interface CTOrnithopanidaEidiRep extends JpaRepository<CTOrnithopanidaEidi,Long>
{
    
    @Query(nativeQuery = true, value = "SELECT ctornithopanida.eidos FROM ctornithopanida_eidi ctornithopanida WHERE ctornithopanida.eidos IS NOT NULL ORDER BY eidos ASC")
    ArrayList<String> findDistinctByEidosOrderByEidos();

   
    Page<CTOrnithopanidaEidi> findAll(Pageable page);
    CTOrnithopanidaEidi findByEidosEquals(String eidos);
    CTOrnithopanidaEidi findCtOrnithopanidaEidiById(Long id);

}
