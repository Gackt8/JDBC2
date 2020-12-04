package by.gsu.pms;

public class InputData {
    private static String name;
    private static String text;
    private static int year;


    public InputData(String name, String text, int year) {
        this.name = name;
        this.text = text;
        this.year = year;
    }

    public InputData() {

    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
