package basic.func;

public class RestArg {
    public static void main(String[] args) {
        RestArg test = new RestArg();
        test.show(12);
        test.show("hello");
        test.show("hello", "world");
    }

    public void show(int i) {
        System.out.println("show(int)");
    }

    public void show(String s) {
        System.out.println("show(String)");
    }

    // 可变参数 type ... name
    public void show(String... strs) {
        System.out.println("show(String ... strs)");

        for (String str : strs) {
            System.out.println(str);
        }
    }

    //  不能与上一个方法同时存在
    //	public void show(String[] strs){}

    // 可变参数必须是最后一个
    //	public void show(String ...strs,int i){}
}
