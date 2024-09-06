package org.example;

import com.google.gson.Gson;
import org.example.dto.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class UserLoader {

    public static List<User> loadUsersFromJson(String filePath) throws IOException {
        // Додайте реалізацію метода, який
        // з JSON файлу який знаходиться за відносним шляхом filepath
        // з допомогою вбудованих засобів бібліотеки https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // десеріалізує контент JSON файлу у список з об*єктів типу User і повертає список

    Gson gson = new Gson();
    try (FileReader reader = new FileReader(filePath)){
    User[] userArray = gson.fromJson(reader,User[].class);
    return Arrays.asList(userArray);
    }
    }
}
