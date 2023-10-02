package com.example.Waivers.Services;

import com.example.Waivers.DTO.WaiverTypeRequest;
import com.example.Waivers.Entities.Waivertype;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WaivertypeService {
    List<Waivertype> getWaiverTypes();
    Waivertype getWaivertypeById(Long id);
//    Waivertype insert(Waivertype waivertype);
    Waivertype insert(WaiverTypeRequest waiverTypeRequest);
    Waivertype updateWaivertype(Long id, Waivertype waivertype);




}
