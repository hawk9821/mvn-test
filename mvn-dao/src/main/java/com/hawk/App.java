package com.hawk;

/**
 * Hello world!
 */
public class App {

    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;

    private App setField1(String field1) {
        this.field1 = field1;
        return this;
    }

    private App setField2(String field2) {
        this.field2 = field2;
        return this;
    }

    private App setField3(String field3) {
        this.field3 = field3;
        return this;
    }

    private App setField4(String field4) {
        this.field4 = field4;
        return this;
    }

    private App setField5(String field5) {
        this.field5 = field5;
        return this;
    }

    private App setField6(String field6) {
        this.field6 = field6;
        return this;
    }

    public static App build() {
        return new App();
    }

    public static void main(String[] args) {
        App app = App.build()
                .setField1("1")
                .setField2("2")
                .setField3("3")
                .setField4("4")
                .setField5("5")
                .setField6("6");
        System.out.println(app.field1 + "  " + app.field2 + "  " + app.field3 + "  " + app.field4 + "  " + app.field5 + "  " + app.field6);

        TestClass testClass = new TestClass();
        System.out.println(testClass instanceof TestAbstructClass);
        System.out.println(testClass instanceof TestInterface);
    }
}
