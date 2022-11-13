package org.example.inter;

import java.util.Arrays;
import java.util.List;

public interface Violent {
    @Override
    public void attack(String target) {
        List<String> FoodList = Arrays.asList("닭강정","짬뽕","족발");

    }

    default void attack(String target) {

    }


}
