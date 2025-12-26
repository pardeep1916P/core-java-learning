package src.jvm;

class JVMTest2 {
    int x = 10;

    public static void main(String[] args) {
        JVMTest2 obj = new JVMTest2();
        System.out.println(obj);
    }

    @Override
    public String toString() {
        return "JVMTest{x=" + x + "}";
    }
}
