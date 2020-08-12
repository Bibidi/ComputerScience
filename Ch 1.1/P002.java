public class P002 {
    public static void main(String[] args) {
        System.out.println("S");
    }
}

/*
    Case 1 : Omit "public" in main() - Runtime Error
        Error: Main method not found in class P002, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application

    Case 2 : Omit "public" in class P002
        Errors not found

    Case 3 : Omit "static" in main() - Compile-time Error
        Error: Main method is not static in class P002, please define the main method as:
        public static void main(String[] args)

    Case 4 : Omit "void" in main() - Compile-time Error
        Error:(2, 19) java: invalid method declaration; return type required

    Case 5 : Omit "args" in main() - Compile-time Error
        Error:(2, 37) java: <identifier> expected

    Case 6 : Omit "String[] args" in main() - Runtime Error
        Error: Main method not found in class P002, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application
 */
