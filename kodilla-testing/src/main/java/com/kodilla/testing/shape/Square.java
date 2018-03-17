package com.kodilla.testing.shape;

public class Square implements Shape {

    private double base;

    public Square(double base) {
        this.base = base;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return (base * base);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.base, base) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(base);
        return (int) (temp ^ (temp >>> 32));
    }
}
