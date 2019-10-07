package lt.sdacademy.restapi.repositories;

import lt.sdacademy.restapi.model.StudyProgram;
import lt.sdacademy.restapi.services.DatabaseService;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudyProgramRepository {

    private final Connection connection;

    public StudyProgramRepository() {
        connection = DatabaseService.getConnection();
    }

    public List<StudyProgram> findAll(){
        List<StudyProgram> result = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * from study_program");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                result.add(new StudyProgram(resultSet.getString("title")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
