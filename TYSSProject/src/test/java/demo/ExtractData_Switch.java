package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractData_Switch {
    public static void main(String[] args) {
        // Sample string containing information
        String inputString = "USD\n" +
                "Requested Amount\n" +
                "$100.00\n" +
                "Payment Reference Number\ngdhd\n" +
                "Payment Request Description\ndhdhddh\n" +
                "Purpose Code\nP0101\n" +
                "Payment Status\nREQUESTED\n" +
                "Payment Due Date*\n17-01-2024\n" +
                "Invoice\nimage/jpeg";

        // Extract information based on keyword using switch statement
        String keyword = "Payment Request Description"; // Replace with the desired keyword
        String extractedValue = extractValue(inputString, keyword);

        // Print the extracted value
        System.out.println(keyword + ": " + extractedValue);
    }

    private static String extractValue(String input, String keyword) {
        String regex = "";

        switch (keyword) {
            case "Requested Amount":
                regex = "Requested Amount[\\s\\S]*?\\$([0-9,.]+)";
                break;
            case "Payment Request Description":
                regex = "Payment Request Description\\n([\\s\\S]*?)\\nPurpose Code";
                break;
            case "Payment Status":
                regex = "Payment Status\\n(\\w+)";
                break;
            case "Purpose Code":
                regex = "Purpose Code\\n(\\w+)";
                break;
            default:
                return "Invalid keyword";
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group(1).trim();
        } else {
            return "Not Found";
        }
    }
}
