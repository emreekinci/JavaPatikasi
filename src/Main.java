import jdk.jfr.Unsigned;

public class Main {                         // herkese acik class -> buyuk harfle baslar
    public static void main(String[] args) {
        /**
         * @author Emre Ekinci , 29.06.22
         */
        int num1, num2 = 2; // num3;
        num1 = 10;
        int num3 = num1 + num2;

        String s1 ="Jan Valjean";
        char ch = 'z';
        char ch_2 = 122; // ascii : z
        char ch_3 = 'J';
        char ch_4 = 'A';
        char ch_5 = 'V';
        char ch_6 = 'A';

        boolean logic_1 = true;
        boolean logic_2 = false;
        System.out.println("\n\nMy nick_name is : "+s1+" **This is a character set**"); // s[0], s[1], s[2]...s[len.s1 - 1]
        System.out.println("logic_1 is : "+logic_1+"\tlogic_2 is : "+logic_2);

        System.out.println(ch_3+ch_4+ch_5+ch_6); // ascii numbers sum
        System.out.println(""+ch_3+ch_4+ch_5+ch_6); // characters sum

        System.out.println("char_1 : "+ch+"\nchar_2 : "+ch_2);
        System.out.println("First : "+num1+" \nsecond : "+num2+"\nnum1 + num2 = "+num3+"(num3)");

        //System.out.printf("Java 101 Patikasi\n");     //shortcut: sout
        System.out.println("Java 101 Patikasi");
        System.out.print("Java 101 Patikasi\n");

        System.out.println("\n\t\tData Types:\n");
        System.out.println("max?_byte: "+Byte.MAX_VALUE+"\tmin?_byte: "+Byte.MIN_VALUE);
        System.out.println("max?_short: "+Short.MAX_VALUE+"\tmin?_short: "+Short.MIN_VALUE);
        System.out.println("max?_int: "+Integer.MAX_VALUE+"\tmin?_int: "+Integer.MIN_VALUE );
        System.out.println("max?_long: "+Long.MAX_VALUE+"\tmin?_long: "+Long.MIN_VALUE );
        System.out.println("max?_double: "+Double.MAX_VALUE+"\tmin?_double: "+Double.MIN_VALUE );
        System.out.println("max?_float: "+Float.MAX_VALUE+"\tmin?_float: "+Float.MIN_VALUE );

        int c = -12 % -5;
        System.out.println(c);
    }
}
