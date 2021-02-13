package com.company;

// TEST 1
//public class Main extends Test1 {
//
//    public static void main(String[] args) {
//        System.out.println(sum(1, 2));             - ошибка здесь, метод sum должен быть static
//    }
//}
//
//class Test1 {
//    int sum(int a,int b) { return a + b; }
//}

// TEST 2
//public class Main {
//    public static void main(String[] args) {
////        long a = 1;
////        long b = 3;
////        byte c = (byte) (a / b);
////        System.out.println(c);
//        // A a = new B();
//        // a.b();
//    }
//}
//
//class A {
//    void a() {
//        System.out.println("A-a");
//    }
//    void b() {
//        System.out.println("A-b");
//        a();
//    }
//}
//
//class B extends A {
//    void a() {
//        System.out.println("B-a");
//    }
//    void b() {
//        System.out.println("B-b");
//        super.b();
//    }
//}

// TEST 3
//public class Main {
//    public static void main(String[] args) {
//        Outer outer=new Outer();
//        outer.test();
//    }
//}
//
//class Outer {
//    int outer_x=100;
//    void test(){
//        for(int i=0;i<5;i++) {
//            class Inner {
//                void display() {
//                    System.out.println("dfg" + outer_x + "; ");
//                }
//            }
//            Inner iner = new Inner();
//            iner.display();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 100;
//        switch(a){
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2:{
//                System.out.println("2");
//                break;
//            }
//            default:{
//                break;
//                System.out.println("blabla");
//            }
//        }
//    }
//}

