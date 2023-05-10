package pohlebaev.homework.one.config;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
public class AppConfig {

    @Bean
    public CsvMapper getCsvMapper () {
        return new CsvMapper();
    }

}
