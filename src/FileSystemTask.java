import java.nio.file.*;
import java.io.IOException;
import java.util.Comparator;

public class FileSystemTask {
    public static void main(String[] args) {
        String surname = "Ivanov";
        String name = "Ivan";

        try {
            Path surnameDir = Paths.get(surname);

            System.out.println("1. Creating directory: " + surname);
            Files.createDirectories(surnameDir);

            System.out.println("2. Creating file: " + name);
            Path nameFile = surnameDir.resolve(name + ".txt");
            Files.createFile(nameFile);

            System.out.println("3. Creating nested directories and copying file");
            Path nestedDir = surnameDir.resolve("dir1/dir2/dir3");
            Files.createDirectories(nestedDir);

            Path copiedFile = nestedDir.resolve(name + ".txt");
            Files.copy(nameFile, copiedFile, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("4. Creating file1 in dir1");
            Path file1 = surnameDir.resolve("dir1/file1.txt");
            Files.createFile(file1);

            System.out.println("5. Creating file2 in dir2");
            Path file2 = surnameDir.resolve("dir1/dir2/file2.txt");
            Files.createFile(file2);

            System.out.println("6. Recursive directory traversal:");
            Files.walk(surnameDir)
                    .forEach(path -> {
                        if (Files.isDirectory(path)) {
                            System.out.println("D: " + surnameDir.relativize(path));
                        } else {
                            System.out.println("F: " + surnameDir.relativize(path));
                        }
                    });

            System.out.println("7. Deleting dir1 with all contents");
            Path dir1 = surnameDir.resolve("dir1");
            Files.walk(dir1)
                    .sorted(Comparator.reverseOrder())
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                            System.out.println("Deleted: " + path);
                        } catch (IOException e) {
                            System.out.println("Failed to delete: " + path);
                        }
                    });

            System.out.println("Operation completed successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}