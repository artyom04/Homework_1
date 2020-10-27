public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Byte
        byte prim_type_byte = 5;
        System.out.println("Value is: " + prim_type_byte);
        prim_type_byte = -5;
        System.out.println("Value is։ " + prim_type_byte);

        //Short
        short prim_type_short = 15632;
        System.out.println("Value is: " + prim_type_short);
        prim_type_short = -1456;
        System.out.println("Value is: " + prim_type_short);

        //Int
        int prim_type_int = 1478596355;
        System.out.println("Value is: " + prim_type_int);
        prim_type_int = 0;
        System.out.println("Value is: " + prim_type_int);

        //Long
        long prim_type_long = 25698745589636252L;
        System.out.println("Value is: " + prim_type_long);
        prim_type_long = -25698745589636252L;
        System.out.println("Value is: " + prim_type_long);

        //Double and Float
        double prim_type_double = 258.4785;
        System.out.println("Value is: " + prim_type_double);
        float prim_type_float = 1475.256F;
        System.out.println("Value is: " + prim_type_float);

        //Boolean
        boolean prim_type_boolean;
        prim_type_boolean = false;
        System.out.println("Value is: " + prim_type_boolean);

        //Char
        char prim_type_char = 'f';
        System.out.println("Character is: " + prim_type_char);
        prim_type_char = '\u0026';
        System.out.println("Character is: " + prim_type_char);

        //Some usage of String Class
        String name = "Artyom";
        String surname = "Tonoyan";
        System.out.println(name + " " + surname);
    }
}