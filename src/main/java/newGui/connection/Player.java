package newGui.connection;

import java.awt.*;

public class Player {

    private  Long id;
    private String name;
    private String surname;
    private String sport;
    private Integer ofYears;
    private Boolean vegetarian;
    private String color;

    public Player() {
    }

    public Player(Long id, String name, String surname, String sport, Integer ofYears, Boolean vegetarian, String color) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sport = sport;
        this.ofYears = ofYears;
        this.vegetarian = vegetarian;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Integer getOfYears() {
        return ofYears;
    }

    public void setOfYears(Integer ofYears) {
        this.ofYears = ofYears;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sport='" + sport + '\'' +
                ", ofYears=" + ofYears +
                ", vegetarian=" + vegetarian +
                ", color='" + color + '\'' +
                '}';
    }
}
