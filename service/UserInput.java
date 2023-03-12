package Task2.service;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserInput {
    public static Scanner user_in() {
        return new Scanner(System.in, StandardCharsets.UTF_8);
    }
}
