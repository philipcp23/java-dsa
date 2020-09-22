public class Main {

    public static void main(String[] args) {

        System.out.println("--------int data type--------");
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Min Value = " + myMinIntValue);
        System.out.println("Int Max Value = " + myMaxIntValue);
//        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
//        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("______________________________ \n");

        System.out.println("--------byte data type--------");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Max value = " + myMaxByteValue);
        System.out.println("______________________________ \n");

        System.out.println("--------short data type--------");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Max value = " + myMaxShortValue);
        System.out.println("______________________________ \n");

        System.out.println("--------long data type--------");
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Max value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);
        System.out.println("______________________________ \n");

        System.out.println("--------casting--------");
        int myTotal = myMinIntValue / 2;
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("______________________________ \n");

        System.out.println("--------Primitive Types Challenge--------");
        byte b = 10;
        System.out.println("b: " + b);
        short s = 20;
        System.out.println("s: " + s);
        int i = 50;
        System.out.println("i: " + i);
        long sum = b + s + i;
        long finalAns = (sum * 10) + 50000;
        System.out.println("Sum is: " +b+ " + " +s+ " + " +i+ " = " + sum + " ()===========D ");
        System.out.println("Drum roll ..... and the final answer is: " + finalAns);
        System.out.println("______________________________ \n");



       
 

        
        
        
        
        
        
        
    }
}
