package com.example.desafio_java_jr.service;

import com.example.desafio_java_jr.entity.Work;
import com.example.desafio_java_jr.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService {
    @Autowired
    WorkRepository workRepository;

    @Autowired
    CommonRules commonRules;

    public Work save(Work work) {
        commonRules.isNullDatePublicationAndExhibition(work.getPublicationDate(), work.getExhibitionDate());
        return workRepository.save(work);
    }

}
