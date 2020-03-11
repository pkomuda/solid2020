package pl.zzpj2020.solid.srp.book.solution;

import lombok.Data;

import java.util.Map;

public @Data class Printer {

    private Book book;
    private int currentPage = 0;
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getCurrentPageContents() {
        return book.getPages().get(currentPage);
    }

    public void turnPage() {
        currentPage++;
    }

    public void printCurrentPage() {
        System.out.println(book.getPages().get(currentPage));
    }

    public String printAllPages() {
        StringBuilder allPages = new StringBuilder();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey()).append(" ").append(page.getValue());
        }
        return allPages.toString();
    }
}
