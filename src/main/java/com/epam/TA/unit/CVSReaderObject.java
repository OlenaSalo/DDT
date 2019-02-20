package com.epam.TA.unit;

import com.opencsv.CSVReader;
import org.apache.logging.log4j.core.util.Assert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CVSReaderObject {
    public Object[][] getCSVTestData(String csvFilePath) {
        String delimiter = "\\|";
        Object[][] lineArray = null;

        try (Stream<String> lines = Files.lines(Paths.get(csvFilePath))) {
            lineArray = lines.skip(1)
                    .map(singleLine -> singleLine.split(delimiter))
                    .map(singleLine -> Stream.of(singleLine)
                            .map(String::trim)
                            .toArray())
                    .toArray(Object[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineArray;
    }
}


