package com.fo4ik.learn.reflection;


import java.lang.reflect.*;

public class Reflection {
    //Reflection is a process of getting information about class
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();

        //Getting class
        Class<? extends SomeClass> cls = someClass.getClass();
        Class<SomeClass> cls2 = SomeClass.class;
        Class<?> cls3 = Class.forName("com.fo4ik.learn.reflection.SomeClass");

        //newInstance() - create new instance of class (Deprecated)
        @Deprecated
        SomeClass someClass2 = (SomeClass) cls.newInstance();

        //getConstructor() - get constructor of class
        Constructor<? extends SomeClass> clsConstructor = cls.getConstructor();


        //getDeclaredConstructor() - get declared constructor of class (even private)
        Constructor<? extends SomeClass> clsDeclaredConstructor = cls.getDeclaredConstructor(String.class);
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println("Constructor name: " + clsConstructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Constructor parameter name: " + parameter.getName());
                System.out.println("Constructor parameter type name: " + parameter.getType().getName());
            }
        }

        //getDeclaredMethods() - get all methods of class (even private)
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("Method name: " + method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println("Method parameter name: " + parameter.getName());
                System.out.println("Method parameter type name: " + parameter.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }

        //getDeclaredFields() - get all fields of class (even private)
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type name: " + field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));

        }



        //getDeclaredField() - get field of class (even private)
        //getField() - get field of class
        //getDeclaredMethod() - get method of class (even private)
        //getMethod() - get method of class
        //getDeclaredAnnotation() - get annotation of class (even private)
        //getAnnotation() - get annotation of class
        //getDeclaredClasses() - get all classes of class (even private)
        //getClasses() - get all classes of class
        //getDeclaredConstructors() - get all constructors of class (even private)
        //getConstructors() - get all constructors of class
    }
}

class SomeClass {
    //Imagine that this class is in another file or even in another package (library)
    String s;
    private int i;

    public SomeClass() {
    }

    SomeClass(String s) {
        this.s = s;
    }

    public synchronized String method(String s) {
        System.out.println("method: " + s);
        return s;
    }
}