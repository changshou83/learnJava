package basic;

 /*
  * 1. 两种错误处理方式：
  * 1 try...catch...finally 自定义错误处理逻辑
  * 2 throws 将错误抛到上层
  *
  * 2. 开发中如何选择使用try-catch-finally 还是使用throws？
  *
  * 2.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果
  *     子类重写的方法中有异常，必须使用try-catch-finally方式处理。
  * 2.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws
  *     的方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理。
  */
public class ErrorDemo {
    public static void main(String[] args) {
        //1.栈溢出：java.lang.StackOverflowError
        // main(args);
        //2.堆溢出：java.lang.OutOfMemoryError
        // Integer[] arr = new Integer[1024*1024*1024];
    }
}
