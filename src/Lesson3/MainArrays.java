package Lesson3;

import ru.moneybranch.webapp.model.Link;
import ru.moneybranch.webapp.model.Resume;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * stanley
 * 05.04.18.
 */
public class MainArrays {
    public static void main(String[] args) throws IOException {

        long [] longs = new long[5]; // Создается в куче
        int [] ints = {1,2,3,4,5}; // создается в стеке.
        System.out.println(longs.getClass());
        System.out.println(Arrays.toString(longs));
        }
}

