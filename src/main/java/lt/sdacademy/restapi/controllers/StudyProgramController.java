package lt.sdacademy.restapi.controllers;

import lt.sdacademy.restapi.model.StudyProgram;
import lt.sdacademy.restapi.services.StudyProgramService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/study-program")
public class StudyProgramController {

    private final StudyProgramService studyProgramService;

    public StudyProgramController(StudyProgramService studyProgramService) {
        this.studyProgramService = studyProgramService;
    }

    @GetMapping
    public List<StudyProgram> getStudyProgram(){
        return studyProgramService.getStudyPrograms();
    }
}
