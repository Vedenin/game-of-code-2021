package eu.gameofcode.endgame.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileReader {

    public List<String> getFileLines(String fileName) throws URISyntaxException, IOException {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
            List<String> fileLines = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.toList());
            return fileLines;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("There isn't such file in called root");
        }
    }

}
