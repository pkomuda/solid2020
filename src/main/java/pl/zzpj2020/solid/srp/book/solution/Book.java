package pl.zzpj2020.solid.srp.book.solution;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public @Data class Book {

    private String title;
    private String author;
    private Map<Integer, String> pages = new HashMap<>();
}
