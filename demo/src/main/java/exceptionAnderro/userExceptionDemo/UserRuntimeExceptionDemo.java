package exceptionAnderro.userExceptionDemo;

/**
 * @author:zzj
 * @date:2021/3/25 0025 18:02
 * 自定义RuntimeException
 */
public class UserRuntimeExceptionDemo {
    public static void main(String[] args) {
        operation("核心处理器");
        System.out.println("继续进行");
    }
    private static void operation(String str) {
        if ("核心处理器".equals(str)){
            throw new IllegalOperationException("操作了"+str);
        }
    }
}
class IllegalOperationException extends RuntimeException{
    public IllegalOperationException() {
    }

    public IllegalOperationException(String message) {
        super(message);
    }
}