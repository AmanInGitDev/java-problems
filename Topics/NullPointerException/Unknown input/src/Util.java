class Util {
    // Corrected method using ternary operator to avoid NPE
    public static void printLength(String name) {
        System.out.println(name != null ? name.length() : 0);
    }
}
