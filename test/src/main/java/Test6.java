/**
 * 收件人列表
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine(); // 读取换行符

            List<String> names = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                names.add(formatName(name));
            }

            String recipients = String.join(", ", names);
            System.out.println(recipients);
        }

        scanner.close();
    }

    private static String formatName(String name) {
        if (name.contains(",") || name.contains(" ")) {
            return "\"" + name + "\"";
        }
        return name;
    }
}

