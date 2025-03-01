package com.tuition.student.marks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.error.Mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MarksController {
    @RequestMapping("/marks")
    public List<MarksAll> getMarks() {
        return Arrays.asList(
                new MarksAll(1,"Maths",99),
                new MarksAll(2,"Science",98),
                new MarksAll(3,"Social",95),
                new MarksAll(4,"English",97),
                new MarksAll(5,"Kannada",90),
                new MarksAll(6,"Hindi",45)
        );
    }
}
