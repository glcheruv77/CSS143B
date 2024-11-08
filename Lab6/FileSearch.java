/* 
Problem:
    “Given a target file to find and a starting directory, 
    determine if and where the target file exists.” 

Step 2:
    Setup & Initialization: Set up the necessary environment, data structures, and any preconditions required for the program to run
    Input: Obtain the input values needed for the search, such as the starting directory and the target file name.
    Processing: Implement the logic required to search for the target file within the given directory and its subdirectories.
    Output: Return the result of the search, indicating whether the file was found and, if so, its location.
Step 3 n-1:
    Setup & Initialization:

        Create a data structure to manage directories to be searched (e.g., a stack or queue).

        Add the given directory to this structure.

    Input:

        Receive the starting directory and target file name as inputs.

    Processing:

        While there are more directories to examine:

            Get the next directory to examine.

            For each item (file or directory) in the current directory:

                If the item is a file, check if it matches the target file name:

                    If it matches, return the file's path.

                If the item is a directory, add it to the structure for further examination.

        If the target file is not found, return "File not found."
    N: 

    Add the given directory to some structure to manage directories

    while (more directories to examine) {
        Get the next directory

        if (the item is a file) {
            check for a match
            if (match is found) return file path
        } 

        if (the item is a directory) {
            for (each file and directory in the directory) {
                if (a file) {
                    check for a match
                    if (match is found) return file path
                }
                if (a directory) {
                    save this directory in the structure
                }
            }
        }
    }

    return "File not found"
 */

 /*Version 1.0:
    import java.io.File;
    import java.util.Stack;

    public class FileSearch {

        public static String searchFiles(File path, String target) {
            if (path == null || !path.exists()) {
                return "File not found";
            }

            Stack<File> stack = new Stack<>();
            stack.push(path);

            while (!stack.isEmpty()) {
                File current = stack.pop();

                if (current.isDirectory()) {
                    File[] files = current.listFiles();
                    if (files != null) {
                        for (File file : files) {
                            if (file.isFile() && file.getName().equals(target)) {
                                return file.getAbsolutePath();
                            } else if (file.isDirectory()) {
                                stack.push(file);
                            }
                        }
                    }
                }
            }

            return "File not found";
        }

        public static void main(String[] args) {
            System.out.println(searchFiles(new File("C:\\"), "hw3.zip"));
        }
    }
    */

    //Version 2:

    import java.io.File;

public class FileSearch {

    public static String recursiveSearch(File path, String target) {
        if (path == null || !path.exists()) {
            return "File not found";
        }

        File[] files = path.listFiles();
        if (files == null) {
            return "File not found";
        }

        for (File file : files) {
            if (file.isFile() && file.getName().equals(target)) {
                return file.getAbsolutePath();
            } else if (file.isDirectory()) {
                String result = recursiveSearch(file, target);
                if (!result.equals("File not found")) {
                    return result;
                }
            }
        }

        return "File not found";
    }

    public static void main(String[] args) {
        System.out.println(recursiveSearch(new File("C:\\"), "hw3.zip"));
    }
}



