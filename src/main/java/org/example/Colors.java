package org.example;

public enum Colors {
    ROJO("Rojo"),
    GRIS("Gris"),
    AMARILLO("Amarillo"),
    MIEL("Miel");

    private final String color;

    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
