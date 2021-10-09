package com.alexstark.tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.alexstark.utils.Files.readTextFromPath;
import static com.alexstark.utils.Zip.unzip;
import static org.assertj.core.api.Assertions.assertThat;

public class ZipWithPasswordFileTests {

    @Test
    void zipFileWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/zip-test.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String zipPassword = "123456";
        String unzipTxtFilePath = "./src/test/resources/unzip/test.txt";
        String expectedData = "Hello zip with password";

        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualData = readTextFromPath(unzipTxtFilePath);
        assertThat(actualData).contains(expectedData);
    }
}
