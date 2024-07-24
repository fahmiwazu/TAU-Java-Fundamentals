package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        String oldPassword = "oldPassword";
        String username = "username";
        String newPassword = "NewPassword@123";

        boolean isStrong = isPasswordStrong(newPassword, oldPassword, username);

        if (isStrong) {
            System.out.println("Password change is valid.");
        } else {
            System.out.println("Password change is not valid.");
        }
    }

    public static boolean isPasswordStrong(String newPassword, String oldPassword, String username) {
        // Check length
        if (newPassword.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        // Check for uppercase letter
        if (!containsUpperCase(newPassword)) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        // Check for special character
        if (!containsSpecialCharacter(newPassword)) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        // Check if it contains username
        if (newPassword.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("Password cannot contain the username.");
            return false;
        }

        // Check if it's the same as old password
        if (newPassword.equals(oldPassword)) {
            System.out.println("New password cannot be the same as the old password.");
            return false;
        }

        // All checks passed, password is strong
        return true;
    }

    private static boolean containsUpperCase(String password) {
        // Regex to match uppercase letters
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean containsSpecialCharacter(String password) {
        // Regex to match special characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
