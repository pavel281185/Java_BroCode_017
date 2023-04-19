public class Main {
    public static void main(String[] args) {
        String name = "   pavel   ";

        System.out.println(name.equals("pavel"));
        System.out.println(name.equalsIgnoreCase("Pavel"));
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("v"));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("v", "k"));
    }
}