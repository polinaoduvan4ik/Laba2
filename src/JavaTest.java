package bstu.it.ozheredova.basejava;
import static java.lang.Math.*;

/**
 * @author Kravtsova
 * @version 1
 */

public class JavaTest {
    static int sint;
    final int С = 1;
    public final int СС = 11;
    public static final int ССС = 111;


    public static void main(String[] args) {

        char c = 'd';
        int i = 3450;
        short s = 15;
        byte b = 1;
        long l = 12345678;
        boolean B = true;
        String S = "bbc";

        double d = 5.7;

        byte b2 = (byte) (b + i);
        int i2 = (int) (d + i);

        System.out.println(b2);
        System.out.println(i2);

        System.out.println(S + i);
        System.out.println(S + c);

        long rlong = i + 2147483647;
        System.out.println("rlong=i+2147483647    " + rlong);

        System.out.println("sint=" + sint);

        boolean abool = B && B;
        System.out.println("boolean=boolean&&boolean  " + abool);

        boolean obool = B ^ B;
        System.out.println("boolean=boolean^boolean   " + obool);

        long num = 9223372036854775807l;
        long num2 = 0x7fff_ffff_fffl;

                char a = 'a';
                System.out.println(a);

                char aa = '\u0061';
                System.out.println(aa);

                char aaa = 97;
                System.out.println(aaa);

                System.out.println((char)(a + aa + aaa));

                System.out.println("3.45%2.4=" + (3.45%2.4));

                System.out.println("1.0/0.0=" + (1.0/0.0));

                System.out.println("0.0/0.0=" + (0.0/0.0));

                System.out.println("log(-345)=" + (log(-345)));

                System.out.println(Float.intBitsToFloat(0x7F800000));

                System.out.println(Float.intBitsToFloat(0xFF800000));

                System.out.println("PI=" + Math.PI);

                System.out.println("e=" + Math.E);

                long opi = Math.round(Math.PI);
                System.out.println("Round(PI)=" + opi);

                long oe = Math.round(Math.E);
                System.out.println("Round(E)=" + oe);

                System.out.println("Min(PI, E)=" + Math.min(Math.PI, Math.E));

                System.out.println("random=" + random()%1);

                Character oChar   = new Character('a');
                Integer   oInt    = 10;
                Short     oShort  = (short) -2;
                Long      oLOng   = 12345678901l;
                Double    oDouble = 123.456;

                int nInt = ~oInt;
                System.out.println("~Integer=" + nInt);

                char ze = 'b';
                ze += oChar;
                System.out.println("+Char=" + ze);

                int ne = oShort >> 2;
                System.out.println(ne);
                int be = oShort >>> 2;
                System.out.println(be);

                long lo = oLOng&111;
                System.out.println("Long&111=" + lo);

                System.out.println("longMIN=" + oLOng.MIN_VALUE);
                System.out.println("longMAX=" + oLOng.MAX_VALUE);
                System.out.println("doubleMIN=" + oDouble.MIN_VALUE);
                System.out.println("doubleMAX=" + oDouble.MAX_VALUE);
                System.out.println("longMIN=" + oLOng.MIN_VALUE);
                System.out.println("longMAX=" + oLOng.MAX_VALUE);
                System.out.println("doubleMIN=" + oDouble.MIN_VALUE);
                System.out.println("doubleMAX=" + oDouble.MAX_VALUE);
                Integer zint = 123;
                int zu = zint;
                Byte zbyte = (byte) 255;
                byte zer = zbyte;

                int x = Integer.parseInt("9");
                System.out.println(x);
                System.out.println(Integer.toHexString(10)) ;
                System.out.println(Integer.compare(10, 2));//сравнение
                System.out.println(Integer.toString(123, 2));
                System.out.println(Integer.bitCount(123));

                //________________________________________________
                String s34 = "2345";
                System.out.println(Integer.valueOf(s34));
                Integer kek = Integer.valueOf(s34);
                System.out.println(kek);

                byte[] nen = s34.getBytes();
                System.out.println(nen);
                String news34 = new String(nen);
                System.out.println(news34);

                System.out.println(Boolean.valueOf(s34));
                System.out.println(Boolean.getBoolean(s34));
                String str1 = "Hello";
                String str2 = "Hello";
                System.out.println("-------------");
                System.out.println(str1 == str2);
                System.out.println(str1.equals(str2));
                System.out.println(str1.compareTo(str2));
                /** комментарий */
                str2 = null;
                System.out.println(str1 == str2);
               // System.out.println(str2.equals(str1));
                //System.out.println(str1.compareTo(str2));
                String str = new String( "hello my dear friends");

                for(String retval : str.split(" ")){
                     System.out.println(retval);
                }
                System.out.println(str.contains("my"));
                System.out.println(str.hashCode());
                System.out.println(str.indexOf("my"));
                System.out.println(str.length());
                System.out.println(str.replace("friends", "frd"));

                char[][] c1;
                int[] c2[];
                int c3[][];
                int[] n = new int[0];

                //System.out.println(n[2]);

                c1 = new char[3][];
                c1[0] = new char[1];
                c1[1] = new char[2];
                c1[2] = new char[3];
                System.out.println(c1.length);
                System.out.println(c1[0].length);
                System.out.println(c1[1].length);
                System.out.println(c1[2].length);

                c2 = new int[][]{ {1,2,3}, {1,2,3}, {1,2,3}};
                c3 = new int[][]{ {1,2,3}, {1,2,3}, {1,2,3}};
                boolean comRez = c2==c3;
                System.out.println(comRez);
                c2 = c3;

                for (int[] z2 : c2)
                {
                    for (int z: z2)
                    {
                       System.out.println(z);
                    }
                }

                WrapperString   string1 =  new WrapperString();
                string1.str = "123412341234";

                var anon = new WrapperString(){
                    @Override
                    public void replace(char oldchar, char newchar) {
                        super.replace(oldchar, newchar);
                    }
                    public void delete(char delchar){
                        str = str.replaceAll(String.valueOf(delchar), "");
                                            }
                };
                anon.str = "anonimus";
                anon.delete('s');
                System.out.println(anon.str);
                anon.replace('m', 's');
                System.out.println(anon.str);
                string1.replace('1', '2');
                System.out.println(string1.str);

    }
}
