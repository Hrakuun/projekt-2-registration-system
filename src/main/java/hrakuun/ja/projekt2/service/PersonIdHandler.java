package hrakuun.ja.projekt2.service;

import hrakuun.ja.projekt2.repository.DatabaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class PersonIdHandler {
    @Autowired
    DatabaseHandler database;
    String filePath = "dataFiles/dataPersonId.txt";

    private List<String> getPersonIdsFromFile() {
        List<String> personIds = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                personIds.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(personIds);
        return personIds;
    }

    public boolean isPersonIdTaken(String personId){
        return database.isPersonIdTaken(personId);
    }


    public boolean isPersonIdValid(String personId){
        List<String> personIds = getPersonIdsFromFile();
        return personIds.contains(personId);
    }



}
