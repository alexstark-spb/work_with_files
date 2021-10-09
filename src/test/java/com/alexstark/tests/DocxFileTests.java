package com.alexstark.tests;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.junit.jupiter.api.Test;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;


public class DocxFileTests {
    @Test
    void docxFileTest() throws Exception {
        String text;
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream("docx-test.docx")) {
            WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(stream);
            text = wordMLPackage.getMainDocumentPart().getContent().toString();
        }
        assertThat(text).contains("Быть или не быть, вот в чем вопрос");
    }
}
