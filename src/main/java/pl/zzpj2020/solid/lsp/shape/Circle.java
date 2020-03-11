package pl.zzpj2020.solid.lsp.shape;

import lombok.Data;

public @Data class Circle implements Shape {

    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
