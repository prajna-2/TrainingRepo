package demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDataExample {
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
        String expectedString="Purpose Code";
        if(expectedString=="Requested Amount") {
        // Extract Requested Amount using regular expression
        String requestedAmount = extractValue(inputString, "Requested Amount[\\s\\S]*?\\$([0-9,.]+)");
        System.out.println(requestedAmount);
        }
        else if(expectedString=="Payment Status") {

        // Extract Payment Due Date using regular expression
        String paymentStatus = extractValue(inputString, "Payment Status\\n(\\w+)");

        // Print the extracted values
        System.out.println(paymentStatus);
        }
        else if(expectedString=="Payment Request Description") {

            // Extract Payment Due Date using regular expression
            String paymentDescription = extractValue(inputString, "Payment Request Description\\n([\\s\\S]*?)\\nPurpose Code");

            // Print the extracted values
            System.out.println(paymentDescription);
            }
        else if(expectedString=="Purpose Code") {

            // Extract Payment Due Date using regular expression
            String paymentDescription = extractValue(inputString, "Purpose Code\\n(\\w+)");

            // Print the extracted values
            System.out.println(paymentDescription);
            }
        else  {

            // Extract Payment Due Date using regular expression
            String paymentDueDate = extractValue(inputString, "Payment Due Date\\*\\n(\\d{2}-\\d{2}-\\d{4})");

            // Print the extracted values
            System.out.println(paymentDueDate);
            }
    }

    private static String extractValue(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group(1).trim();
        } else {
            return "Not Found";
        }
    }
}
