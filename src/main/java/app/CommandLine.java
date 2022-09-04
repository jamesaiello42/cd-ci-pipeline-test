package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {

    @Autowired
    private Foods foods;

    @Override
    public void run(String...args) throws Exception {
        foods.displayFoods();
        foods.getFoods().add("Pasta");
        System.out.println("Adding Pasta. \nList after food item was added:");
        foods.displayFoods();
    }
}
