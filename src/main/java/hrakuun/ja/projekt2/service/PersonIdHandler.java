package hrakuun.ja.projekt2.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class PersonIdHandler {
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
        return personIds;
    }

    public boolean isPersonIdFree(String personId){
        List<String> personIds = getPersonIdsFromFile();
        return !personIds.contains(personId);
    }

    public String getNewPersonId(){
        List<String> personIds = getPersonIdsFromFile();
        for(String personId : personIds){
            if(isPersonIdFree(personId)){
                return personId;
            }
        }
        return null;
    }



}
