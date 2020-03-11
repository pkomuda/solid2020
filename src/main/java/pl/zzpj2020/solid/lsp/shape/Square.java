package pl.zzpj2020.solid.lsp.shape;

import lombok.Data;

public @Data class Square implements Shape {

    private int length;

    @Override
    public double calculateArea() {
        return length*length;
    }
}
