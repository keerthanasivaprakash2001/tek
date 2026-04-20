//public class Main {
////    public static void main(String[] args) {
////        int[] arr={1,0,-2,0,5,-6};
////
//    class Animal {
//
//        // Static Initialization Block
//        static {
//            System.out.println("Animal SIB");
//        }
//
//        // Instance Initialization Block
//        {
//            System.out.println("Animal IIB");
//        }
//
//        // Default Constructor
//        Animal() {
//            System.out.println("Animal Default Constructor");
//        }
//
//        // Parameterized Constructor
//        Animal(String type) {
//            System.out.println("Animal Parameterized Constructor: " + type);
//        }
//
//        void sound() {
//            System.out.println("Animal makes a sound");
//        }
//    }
//
//    class Dog extends Animal {
//
//        // Static Initialization Block
//        static {
//            System.out.println("Dog SIB");
//        }
//
//        // Instance Initialization Block
//        {
//            System.out.println("Dog IIB");
//        }
//
//        // Default Constructor
//        Dog() {
//            super("Mammal");   // calling parent parameterized constructor
//            System.out.println("Dog Default Constructor");
//        }
//
//        // Overriding method
//        @Override
//        void sound() {
//            System.out.println("Dog barks");
//        }
//    }
//
//    public class Main2 {
//        public static void main(String[] args) {
//            System.out.println("Main Started");
//
////            Dog d = new Dog();
//            d.sound();
//        }
//    }
//
//}
