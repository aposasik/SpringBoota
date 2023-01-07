package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;

import java.math.BigInteger;
import java.util.ArrayList;

public class DeigmaThhlastikwnXEidhMapperImpl implements DeigmaThhlastikwnXEidhMapper
{
    @Override
    public DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO) {
        try {
            DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();

            deigmaThhlastikwnXEidh.setEokParII(deigmaThhlastikwnXEidhDTO.getEokParII());
            deigmaThhlastikwnXEidh.setEokParIV(deigmaThhlastikwnXEidhDTO.getEokParIV());
            deigmaThhlastikwnXEidh.setEokParV(deigmaThhlastikwnXEidhDTO.getEokParV());
            deigmaThhlastikwnXEidh.setFulo(deigmaThhlastikwnXEidhDTO.getFulo());
            deigmaThhlastikwnXEidh.setHlikia(deigmaThhlastikwnXEidhDTO.getHlikia());
            deigmaThhlastikwnXEidh.setParathrhseis(deigmaThhlastikwnXEidhDTO.getParathrhseis());
            deigmaThhlastikwnXEidh.setPlhthos(deigmaThhlastikwnXEidhDTO.getPlhthos());
            deigmaThhlastikwnXEidh.setSxetikhAfthonia(deigmaThhlastikwnXEidhDTO.getSxetikhAfthonia());

            return deigmaThhlastikwnXEidh;
        }catch (Exception e){
            throw e;
        }


    }

    @Override
    public DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh) {
        try {
            DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO = new DeigmaThhlastikwnXEidhDTO();

            deigmaThhlastikwnXEidhDTO.setId(deigmaThhlastikwnXEidh.getId());
            deigmaThhlastikwnXEidhDTO.setDeigmaThhlastikwnId(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId());
            deigmaThhlastikwnXEidhDTO.setCtEidos(deigmaThhlastikwnXEidh.getCtThhlastikaEidh().getEidos());
            deigmaThhlastikwnXEidhDTO.setSxetikhAfthonia(deigmaThhlastikwnXEidh.getSxetikhAfthonia());
            deigmaThhlastikwnXEidhDTO.setPlhthos(deigmaThhlastikwnXEidh.getPlhthos());
            deigmaThhlastikwnXEidhDTO.setHlikia(deigmaThhlastikwnXEidh.getHlikia());
            deigmaThhlastikwnXEidhDTO.setFulo(deigmaThhlastikwnXEidh.getFulo());
            deigmaThhlastikwnXEidhDTO.setParathrhseis(deigmaThhlastikwnXEidh.getParathrhseis());
            deigmaThhlastikwnXEidhDTO.setEokParII(deigmaThhlastikwnXEidh.getEokParII());
            deigmaThhlastikwnXEidhDTO.setEokParIV(deigmaThhlastikwnXEidh.getEokParIV());
            deigmaThhlastikwnXEidhDTO.setEokParV(deigmaThhlastikwnXEidh.getEokParV());

            return deigmaThhlastikwnXEidhDTO;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXEidhAutocompletesDTO mapListsToDeigmaThhlastikwnXEidhAutocompletesDTO(ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> ctEidosList, ArrayList<String> sxetikhAfthoniaList, ArrayList<String> hlikiaList, ArrayList<String> fuloList) {
        try {
            DeigmaThhlastikwnXEidhAutocompletesDTO deigmaThhlastikwnXEidhAutocompletesDTO = new DeigmaThhlastikwnXEidhAutocompletesDTO();

            deigmaThhlastikwnXEidhAutocompletesDTO.setDeigmaThhlastikwnIdList(deigmaThhlastikwnIdList);
            deigmaThhlastikwnXEidhAutocompletesDTO.setCtEidosList(ctEidosList);
            deigmaThhlastikwnXEidhAutocompletesDTO.setSxetikhAfthoniaList(sxetikhAfthoniaList);
            deigmaThhlastikwnXEidhAutocompletesDTO.setHlikiaList(hlikiaList);
            deigmaThhlastikwnXEidhAutocompletesDTO.setFuloList(fuloList);

            return deigmaThhlastikwnXEidhAutocompletesDTO;
        }catch (Exception e){
            throw e;
        }
    }

}
