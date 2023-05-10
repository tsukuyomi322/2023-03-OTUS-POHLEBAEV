package pohlebaev.homework.one.dao;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Repository;
import pohlebaev.homework.one.model.Question;
import pohlebaev.homework.one.utils.CsvReader;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    private final CsvReader csvReader;

    private final CsvMapper csvMapper;

    private final CsvSchema csvSchema;

    public QuestionDaoImpl(CsvReader csvReader, CsvMapper csvMapper) {
        this.csvReader = csvReader;
        this.csvMapper = csvMapper;
        this.csvSchema = csvMapper.schema().withHeader();
    }

    @Override
    public List<Question> getAllQuestionsAndCheckErrors() {
        try {
            return getAllQuestions();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Question> getAllQuestions() throws IOException {
        InputStream csvInputStream = csvReader.readData();
        MappingIterator<Question> csvRowsReader =
                csvMapper.readerFor(Question.class).with(csvSchema).readValues(csvInputStream);
        return csvRowsReader.readAll();
    }
}
