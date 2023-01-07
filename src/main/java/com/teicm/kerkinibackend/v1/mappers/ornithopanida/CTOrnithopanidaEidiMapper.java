package com.teicm.kerkinibackend.v1.mappers.ornithopanida;


import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaEidiDTO;

public interface CTOrnithopanidaEidiMapper
{
    CTOrnithopanidaEidi ctOrnithopanidaEidiTOctOrnithopanidaEidiDTO(CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO);
    CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTOTOctOrnithopanidaEidi(CTOrnithopanidaEidi ctOrnithopanidaEidi);
}
