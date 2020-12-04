package by.gsu.pms;

import java.util.*;

public class CollectOfPoems {
    private List<String> listPoems;
    private char interestChar;


    CollectOfPoems(String text, char interestChar) {
        this.listPoems = Arrays.asList(text.split("(\\*+)"));
        this.interestChar = interestChar;

    }

    void printEachPoem() {
      //  Scanner scanner = new Scanner(System.in);

//        System.out.print("Input max value: ");
//        int max = scanner.nextInt();

        for (String poem : listPoems) {

            if ((getCountInetrestChar(poem) > 1)) {
                System.out.println("\n" + poem);
                System.out.println("Count of '" + interestChar + "' = " + getCountInetrestChar(poem));
            }
        }
    }

    private int getCountInetrestChar(String content) {

        int charArray = (int) content.chars().filter(x -> x == interestChar).count();

        return charArray;
    }
}