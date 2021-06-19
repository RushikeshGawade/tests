package com.truemeds.test.service.impl;

import com.truemeds.test.model.InputDetails;
import com.truemeds.test.model.OutputTable;
import com.truemeds.test.repository.InputDetailsRepository;
import com.truemeds.test.repository.OutputTableRepository;
import com.truemeds.test.service.ProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProcessingServiceImpl implements ProcessingService {

    @Autowired
    private InputDetailsRepository inputDetailsRepository;

    @Autowired
    private OutputTableRepository outputTableRepository;

    @Override
    public void processData() {
        List<InputDetails> details = inputDetailsRepository.findAll();

        for (InputDetails inputDetails :
                details) {
            System.out.println(inputDetails.getInputString() + "====>>>" + processor(inputDetails.getInputString().replaceAll("\\s", "")));
            OutputTable outputTable = new OutputTable();
            outputTable.setName("Rushikesh_Gawade");
            outputTable.setOriginalData(inputDetails.getInputString());
            outputTable.setProcessedData(processor(inputDetails.getInputString().replaceAll("\\s", "")));
            outputTable.setTimeStamp(LocalDateTime.now());
            outputTableRepository.save(outputTable);
        }
    }

    static String removeDuplicateHelper(String str, char lastRemoved) {
        if (str.length() == 0 || str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(1)) {
            lastRemoved = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1))
                str = str.substring(1, str.length());

            str = str.substring(1, str.length());
            return removeDuplicateHelper(str, lastRemoved);
        }
        String rem_str = removeDuplicateHelper(str.
                substring(1, str.length()), lastRemoved);
        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {
            lastRemoved = str.charAt(0);

            return rem_str.substring(1, rem_str.length());
        }
        if (rem_str.length() == 0 && lastRemoved == str.charAt(0))
            return rem_str;
        return (str.charAt(0) + rem_str);
    }

    static String processor(String str) {
        char lastRemoved = '\0';
        return removeDuplicateHelper(str, lastRemoved);
    }
}
