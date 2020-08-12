public class P003 {
    public static void main(String[] args) {
        System.out.println("S");
    }
}
/*
    Case 1 : Misspell "public" in main() - Runtime Error
        Error:(2, 10) java: <identifier> expected

    Case 2 : Misspell "public" in class P003
        Error:(1, 1) java: class, interface, or enum expected

    Case 3 : Misspell "static" in main() - Compile-time Error
        Error:(2, 17) java: <identifier> expected

    Case 4 : Misspell "void" in main() - Compile-time Error
        Error:(2, 19) java: cannot find symbol
        symbol:   class oid
        location: class P003

    Case 5 : Misspell "args" in main() - Compile-time Error
        Errors not found
 */
