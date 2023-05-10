package pohlebaev.homework.one.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class CsvReader {

    @Value("${filename}")
    private String fileName;

    public CsvReader() {
    }

    public InputStream readData () throws IOException {
        return new ClassPathResource(fileName).getInputStream();
    }
}
