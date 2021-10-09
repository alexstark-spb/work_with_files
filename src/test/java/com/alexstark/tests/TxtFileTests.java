package com.alexstark.tests;

import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.alexstark.utils.Files.readTextFromPath;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class TxtFileTests {

    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/txt-test.txt";
        String expectedData = "hello txt";

        String actualData = readTextFromPath(txtFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}

