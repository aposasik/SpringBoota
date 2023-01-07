package com.teicm.kerkinibackend.v1.mappers.ornithopanida;


import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaEidiDTO;
import org.springframework.stereotype.Component;

@Component
public class CTOrnithopanidaEidiMapperImpl  implements CTOrnithopanidaEidiMapper
{
    @Override
    public CTOrnithopanidaEidi ctOrnithopanidaEidiTOctOrnithopanidaEidiDTO(CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO) {
        if (ctOrnithopanidaEidiDTO == null) {
            return null;
        }

        CTOrnithopanidaEidi ctOrnithopanidaEidi = new CTOrnithopanidaEidi();
        ctOrnithopanidaEidi.setEidos(ctOrnithopanidaEidiDTO.getEidos());

        return ctOrnithopanidaEidi;

    }
    @Override
    public CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTOTOctOrnithopanidaEidi(CTOrnithopanidaEidi ctOrnithopanidaEidi) {
        if (ctOrnithopanidaEidi == null) {
            return null;
        }
        CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO = new CTOrnithopanidaEidiDTO();
        ctOrnithopanidaEidiDTO.setEidos(ctOrnithopanidaEidi.getEidos());

        return ctOrnithopanidaEidiDTO;

    }
}
