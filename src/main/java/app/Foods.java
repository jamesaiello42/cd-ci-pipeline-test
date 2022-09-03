package app;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
public class Foods {

    private final List<String> foods = List.of("Hamburger", "Chicken", "French Fries", "Doughnuts", "Lobster");

    public void displayFood() {
        foods.forEach(System.out::println);
    }
}
