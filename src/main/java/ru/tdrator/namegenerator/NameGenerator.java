package ru.tdrator.namegenerator;

import java.util.Random;

public class NameGenerator {

        private static final String LETTERS = "абвгдеёжзиклмнопрстуфхцчшэюя";
        private static final Random RANDOM = new Random();

        public static String generateRussianName(int length) {
            if (length <= 0) {
                throw new IllegalArgumentException("Количество символов должно быть больше 0");
            }
            StringBuilder name = new StringBuilder();
            // первая буква — заглавная
            name.append(Character.toUpperCase(LETTERS.charAt(RANDOM.nextInt(LETTERS.length()))));
            // остальные — строчные
            for (int i = 1; i < length; i++) {
                name.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
            }
            return name.toString();
        }
}
