package com.fo4ik.learn.string;

public class StringExample {

    public static void main(String[] args) {
        String str = new String("abc");
        //String str = "abc";

        //Concat string int add method
        str.concat("def");
        System.out.println(str);    //abc
        String str2 = str.concat("def");
        System.out.println(str2);   //abcdef
    }

}

class StringBufferExample {
    //StringBuffer the same as StringBuilder but it`s synchronized
    //StringBuffer used to work with multiple threads

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("def");
        System.out.println(stringBuffer);    //def

        stringBuffer.delete(0, 3);
        System.out.println(stringBuffer);    //empty

        stringBuffer.append("abc");
        stringBuffer.replace(1, 3, "gh");
        System.out.println(stringBuffer);    //agh
    }
}

class StringBuilderExample {
    //StringBuilder the same as StringBuffer but it`s not synchronized
    //StringBuilder is not thread safe but faster than StringBuffer

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("def");
        System.out.println(stringBuilder);    //abcdef

        stringBuilder.insert(3, "ghi");
        System.out.println(stringBuilder);    //abcghidef

        stringBuilder.delete(3, 6);
        System.out.println(stringBuilder);    //abcdef
    }
}
