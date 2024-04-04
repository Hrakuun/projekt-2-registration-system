package hrakuun.ja.projekt2.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidGenerator {

    public UUID generateUuid() {
        return UUID.randomUUID();
    }

}
