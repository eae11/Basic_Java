package d2;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class d4 {
    public static void main(String[] args) {
        String a = "12,123,548\n" +
                "12,54,15465";
        Scanner scanner = new Scanner(a);
        String patter = "\\d+,\\d+,\\d+";
        while (scanner.hasNext(patter)) {
            scanner.next(patter);
            MatchResult match = scanner.match();
            System.out.println(match.group());
        }
    }
}
