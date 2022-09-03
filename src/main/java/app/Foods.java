package app;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Foods {

    public void displayFood() {
        List<String> foods = List.of("Hamburger", "Chicken", "French Fries", "Doughnuts", "Lobster");
        foods.forEach(System.out::println);
    }
}
