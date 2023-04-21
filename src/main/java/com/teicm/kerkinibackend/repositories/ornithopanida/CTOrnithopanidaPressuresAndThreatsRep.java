package com.teicm.kerkinibackend.repositories.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface CTOrnithopanidaPressuresAndThreatsRep extends JpaRepository<CTOrnithopanidaPressuresAndThreats, Long>
{
    Optional<CTOrnithopanidaPressuresAndThreats> findById(Long id);
    Page<CTOrnithopanidaPressuresAndThreats> findAll(Pageable pageable);
    CTOrnithopanidaPressuresAndThreats findByActCodeEquals(String actCode);
    List<CTOrnithopanidaPressuresAndThreats> findAll();
    CTOrnithopanidaPressuresAndThreats findCTOrnithopanidaPressuresAndThreatsById(Long id);
    
    @Query(nativeQuery = true, value ="SELECT DISTINCT a.act_code FROM ctornithopanida_pressures_and_threats a WHERE a.act_code  IS NOT NULL ORDER BY act_code ASC" )
    ArrayList<String> findActOrderByAct();
}
