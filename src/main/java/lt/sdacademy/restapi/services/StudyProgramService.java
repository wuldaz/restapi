package lt.sdacademy.restapi.services;

import lt.sdacademy.restapi.model.StudyProgram;
import lt.sdacademy.restapi.repositories.StudyProgramRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyProgramService {

    private final StudyProgramRepository studyProgramRepository;

    public StudyProgramService(StudyProgramRepository studyProgramRepository) {
        this.studyProgramRepository = studyProgramRepository;
    }

    public List<StudyProgram> getStudyPrograms(){
        return studyProgramRepository.findAll();
    }

}
