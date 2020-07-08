package com.sda.basketball;

import java.math.BigDecimal;
import java.util.Objects;

public class Player implements Comparable<Player> {
    String firstName;
    String lastName;
    int height;
    BigDecimal salary;

    public Player(String firstName, String lastName, int height, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (height < 150 || height > 300) {
            throw new IllegalArgumentException();
        }
        this.height = height;
        this.salary = salary;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return height == player.height &&
                Objects.equals(firstName, player.firstName) &&
                Objects.equals(lastName, player.lastName) &&
                Objects.equals(salary, player.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, height, salary);
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Player o) {
        return this.height - o.height;
    }


}
