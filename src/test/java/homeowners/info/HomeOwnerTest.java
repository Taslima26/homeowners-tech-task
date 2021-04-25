package homeowners.info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class HomeOwnersTest {


    private ReadCSV readCSV;

    @BeforeEach
    void initEach() {
        readCSV = new ReadCSV();
    }

        @ParameterizedTest
        @CsvFileSource(resources = "/examples.csv", numLinesToSkip = 1)
        void csvParserWork(String name) {
            assertNotNull(name,"Test file loaded sucessfully");
        }




}