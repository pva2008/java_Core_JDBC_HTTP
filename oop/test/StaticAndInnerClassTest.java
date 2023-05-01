package com.vpdev.oop.test;

public class StaticAndInnerClassTest {
    public static void main(String[] args) {
        class LocalClass {

        }
        OuterClass.StaticClass objectStatic = new OuterClass.StaticClass();
        //невозможно создать объект  внутреннего класса без объекта внешнего
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass objectInner = outerClass.new InnerClass();

    }


}

class OuterClass {
    private static int staticOuterElement;
    InnerClass innerClass;


    class InnerClass {
        private static int staticInnerInnerClassElement;

        public InnerClass() {
        }
    }

    static class StaticClass {
        private static int staticInnerStaticClassElement = staticOuterElement;

        public StaticClass() {
        }
    }

}
