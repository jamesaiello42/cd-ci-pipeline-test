package app;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class Foods {

    private ArrayList<String> foods = new ArrayList<>(List.of("Hamburger", "Chicken", "French Fries", "Doughnuts", "Lobster", "Pizza"));

    public void displayFoods() {
        foods.forEach(System.out::println);
    }
}
