package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;

import java.math.BigInteger;
import java.util.ArrayList;

public interface DeigmaThhlastikwnXEidhMapper {

    DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO);

    DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh);

    DeigmaThhlastikwnXEidhAutocompletesDTO mapListsToDeigmaThhlastikwnXEidhAutocompletesDTO(ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> ctEidosList, ArrayList<String> sxetikhAfthoniaList, ArrayList<String> hlikiaList, ArrayList<String> fuloList);
}
