package com.alexstark.tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.alexstark.utils.Files.readTextFromPath;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class TxtFileTests {

    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/txt-test.txt";
        String expectedData = "hello txt";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/csv-test.csv";
        String expectedData = "hello csv";

        String actualData = readTextFromPath(csvFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}

