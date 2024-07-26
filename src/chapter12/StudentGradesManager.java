package chapter12;

import java.util.HashMap;
import java.util.Map;

public class StudentGradesManager {

    // Method to simulate getting original grades
    private Map<String, Integer> getOriginalGrades() {
        Map<String, Integer> originalGrades = new HashMap<>();
        originalGrades.put("Alice", 72);
        originalGrades.put("Bob", 65);
        originalGrades.put("Charlie", 88);
        return originalGrades;
    }

    // Method to simulate getting makeup exam grades
    private Map<String, Integer> getMakeupGrades() {
        Map<String, Integer> makeupGrades = new HashMap<>();
        makeupGrades.put("Alice", 85);
        makeupGrades.put("Bob", 60);
        makeupGrades.put("Charlie", 90);
        return makeupGrades;
    }

    // Method to determine final grades
    public Map<String, Integer> determineFinalGrades() {
        Map<String, Integer> originalGrades = getOriginalGrades();
        Map<String, Integer> makeupGrades = getMakeupGrades();
        Map<String, Integer> finalGrades = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalGrades.entrySet()) {
            String student = entry.getKey();
            Integer originalGrade = entry.getValue();
            Integer makeupGrade = makeupGrades.get(student);

            if (makeupGrade != null) {
                // Take the higher grade between the original and the makeup exam
                finalGrades.put(student, Math.max(originalGrade, makeupGrade));
            } else {
                // If no makeup grade exists, retain the original grade
                finalGrades.put(student, originalGrade);
            }
        }

        return finalGrades;
    }

    // Method to print final grades
    public void printFinalGrades() {
        Map<String, Integer> finalGrades = determineFinalGrades();
        System.out.println("Final Grades:");
        for (Map.Entry<String, Integer> entry : finalGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGradesManager manager = new StudentGradesManager();
        manager.printFinalGrades();
    }
}

