package com.alexstark.tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.alexstark.utils.Files.readTextFromPath;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CsvFileTests {

        @Test
        void csvTest() throws IOException {
            String csvFilePath = "./src/test/resources/csv-test.csv";
            String expectedData = "hello csv";

            String actualData = readTextFromPath(csvFilePath);
            assertThat(actualData, containsString(expectedData));
    }
}
