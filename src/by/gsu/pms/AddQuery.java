package by.gsu.pms;

import java.util.Scanner;

public class AddQuery {

    public static InputData Data() {

       // List<InputData> dataList = new ArrayList<>();

        InputData data = new InputData();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name: ");
        data.setName(scanner.nextLine());


        System.out.print("Input text: ");
        data.setText(scanner.nextLine());

        System.out.print("Input year: ");
        data.setYear(scanner.nextInt());

       // dataList.add(data);

        return data;
    }
}
