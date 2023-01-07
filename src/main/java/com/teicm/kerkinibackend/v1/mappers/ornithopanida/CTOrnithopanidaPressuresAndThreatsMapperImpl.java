package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaPressuresAndThreatsDTO;
import org.springframework.stereotype.Component;

@Component
public class CTOrnithopanidaPressuresAndThreatsMapperImpl implements CTOrnithopanidaPressuresAndThreatsMapper {
    @Override
    public CTOrnithopanidaPressuresAndThreats ctOrnithopanidaPressuresAndThreatsTOctOrnithopanidaPressuresAndThreatsDTO(CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO) {
        if (ctOrnithopanidaPressuresAndThreatsDTO == null) {
            return null;
        }

        CTOrnithopanidaPressuresAndThreats ctOrnithopanidaPressuresAndThreats = new CTOrnithopanidaPressuresAndThreats();
        ctOrnithopanidaPressuresAndThreats.setActCode(ctOrnithopanidaPressuresAndThreatsDTO.getActCode());
        ctOrnithopanidaPressuresAndThreats.setDescriptionEn(ctOrnithopanidaPressuresAndThreatsDTO.getDescriptionEn());
        ctOrnithopanidaPressuresAndThreats.setRemarks(ctOrnithopanidaPressuresAndThreatsDTO.getRemarks());

        return ctOrnithopanidaPressuresAndThreats;

}



    @Override
    public CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTOTOctOrnithopanidaPressuresAndThreats(CTOrnithopanidaPressuresAndThreats ctOrnithopanidaPressuresAndThreats) {
        if (ctOrnithopanidaPressuresAndThreats == null) {
            return null;
        }
        CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO = new CTOrnithopanidaPressuresAndThreatsDTO();
       // ctOrnithopanidaPressuresAndThreatsDTO.setActCode(ctOrnithopanidaPressuresAndThreats.getActCode());
        ctOrnithopanidaPressuresAndThreatsDTO.setDescriptionEn(ctOrnithopanidaPressuresAndThreats.getDescriptionEn());
        ctOrnithopanidaPressuresAndThreatsDTO.setRemarks(ctOrnithopanidaPressuresAndThreats.getRemarks());

        return ctOrnithopanidaPressuresAndThreatsDTO;

    }
}


