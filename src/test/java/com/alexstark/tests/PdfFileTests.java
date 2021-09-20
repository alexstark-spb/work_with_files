package com.alexstark.tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static com.alexstark.utils.Files.getPdf;
import static org.hamcrest.MatcherAssert.assertThat;


public class PdfFileTests {

    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/files/pdf-test.pdf";
        String expectedData = "Как скачать файл с помощью Selenide";

        PDF pdf = getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedData));
    }
}

