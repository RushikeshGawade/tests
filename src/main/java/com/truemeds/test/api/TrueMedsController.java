package com.truemeds.test.api;

import com.truemeds.test.model.InputDetails;
import com.truemeds.test.repository.InputDetailsRepository;
import com.truemeds.test.service.ProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrueMedsController {

    @Autowired
    private ProcessingService processingService;
    private InputDetailsRepository inputDetailsRepository;

    public TrueMedsController(InputDetailsRepository inputDetailsRepository) {
        this.inputDetailsRepository = inputDetailsRepository;
    }

    @GetMapping("/getDetails")
    public List<InputDetails> getDetails() {
        List<InputDetails> details = inputDetailsRepository.findAll();
        System.out.println(details);
        processingService.processData();
        return details;
    }
}
