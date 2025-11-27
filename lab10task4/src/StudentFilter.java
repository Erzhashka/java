import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class StudentFilter {

    public void filterGradeFive(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+"); // split by any whitespace
                String gradeStr = parts[parts.length - 1];

                try {
                    int grade = Integer.parseInt(gradeStr);
                    if (grade == 5) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (NumberFormatException ignored) {}
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
