package domain;

public class Person {
    private String name,
            hairColor,
            skinColor,
            eyeColor,
            birthYear,
            gender;

    private String[] films;

    private int height,
            mass;

    public String[] getFilms() {
        return films;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

}