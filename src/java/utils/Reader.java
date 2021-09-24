package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import storage.Drink;
import storage.StorageElement;


public class Reader {

    public static String Buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<StorageElement> myStorageElement = new ArrayList<>();
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] arrOfStr = line.split(","); // trim when I create Object of it!
            if (arrOfStr.length == 3 && arrOfStr[2].contains("alcoholic")) {
                Drink drink = new Drink(arrOfStr[0], Integer.parseInt(arrOfStr[1]), (arrOfStr[2].trim().equals("alcoholic")));
                myStorageElement.add(drink);
            } else {
                StorageElement storageElement = new StorageElement(arrOfStr[0], Integer.parseInt(arrOfStr[1]));
                myStorageElement.add(storageElement);
            }
            System.out.println(Arrays.toString(arrOfStr));
        }
        myStorageElement.stream().map(storageElement -> storageElement.getName() + ": " + storageElement.getInitialQuantity()).forEach(System.out::println);
//        for (int i = 0; i < myStorageElement.size(); i++) {
//            System.out.println(myStorageElement.get(i).getName() + ": " + myStorageElement.get(i).getInitialQuantity());
//        }
        return fileName;
    }

    // Drink drink1 = new Drink(Dreher, 80, alc);
}
