/*
 * Copyright (C) 2017 Shahriar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package passwordmanager.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Shahriar
 */
public class PasswordGenerator {

    private static final String UPPER_CASE_LETTERS = "QWERTZUIOPASDFGHJKLYXCVBNM";
    private static final String LOWER_CASE_LETTERS = "qwertzuiopasdfghjklyxcvbnm";
    private static final String NUMERIC_CHARACTERS = "0123456789";
    private static final String SYMBOLS = "é,;.:-_*?=})](/{&%+$#'!<>\\\"";
    private static final String AMBIGUOUS_CHARACTERS = "{}[]()/\\'\"`~,;:.<>";

    private static List<String> charList = new ArrayList<>();

    public static String genetratePassword(boolean upperCaseLetter, boolean lowerCaseLetter, boolean numeric, boolean special, int length) {
        String password = "";
        int i = 0;
        while (i < length) {
            if (upperCaseLetter) {
                password += getRandomChar(UPPER_CASE_LETTERS);
                i++;
            }
            if (lowerCaseLetter && i < length) {
                password += getRandomChar(LOWER_CASE_LETTERS);
                i++;
            }
            if (numeric && i < length) {
                password += getRandomChar(NUMERIC_CHARACTERS);
                i++;
            }
            if (special && i < length) {
                password += getRandomChar(SYMBOLS + AMBIGUOUS_CHARACTERS);
                i++;
            }
        }
        return shuffle(password);
    }

    public static char getRandomChar(String s) {
        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);
    }

    public static String shuffle(String s) {
        String shuffledString = "";
        while (s.length() != 0) {
            int index = (int) Math.floor(Math.random() * s.length());
            char c = s.charAt(index);
            s = s.substring(0, index) + s.substring(index + 1);
            shuffledString += c;
        }
        return shuffledString;
    }

}
