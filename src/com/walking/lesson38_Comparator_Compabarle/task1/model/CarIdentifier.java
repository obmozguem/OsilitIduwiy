package com.walking.lesson38_Comparator_Compabarle.task1.model;

public class CarIdentifier {
    private final String number;
    private final int year;

    public CarIdentifier(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarIdentifier)) return false;

        CarIdentifier that = (CarIdentifier) o;

        if (getYear() != that.getYear()) return false;
        return getNumber() != null ? getNumber().equals(that.getNumber()) : that.getNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumber() != null ? getNumber().hashCode() : 0;
        result = 31 * result + getYear();
        return result;
    }
}
