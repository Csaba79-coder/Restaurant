package utils;


import java.io.IOException;

public class FileHandler {
    /**
     * FileHandler class should be used to uplaod data from files
     *
     * hint: String split() method
     */
    private final String sourceDirectory = "src/resources/"; // src/resources/Drinks.txt or src/resources/KitchenTools.txt or src/resources/Meals.txt

//    String fileNameDrinks = sourceDirectory + "Drinks.txt";
//    String fileNameMeals = sourceDirectory + "Meals.txt";
//    String fileNameKitchenTools = sourceDirectory + "KitchenTools.txt";


    public void readFile(String txt) {
        String fileName = sourceDirectory + txt;
        try {
            Reader.Buffer(fileName);
//            Reader.Buffer(fileNameDrinks);
//            Reader.Buffer(fileNameMeals);
//            Reader.Buffer(fileNameKitchenTools);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
