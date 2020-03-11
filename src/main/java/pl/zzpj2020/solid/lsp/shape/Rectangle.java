package pl.zzpj2020.solid.lsp.shape;

import lombok.Data;

public @Data class Rectangle implements Shape {

    private double length;
    private double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}
