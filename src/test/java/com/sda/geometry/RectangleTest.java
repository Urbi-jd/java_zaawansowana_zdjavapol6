package com.sda.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldGetValidArea(){
        // Given
        double x = 5;
        double y = 7;
        double expecterArea = 35;

        Rectangle rectangle = new Rectangle(x,y);

        // When
        double actualArea = rectangle.getArea();

        // Then
        assertEquals(expecterArea, actualArea);
    }

}