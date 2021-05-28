package exceptionAnderro.userExceptionDemo;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author:zzj
 * @date:2021/3/25 0025 17:40
 * 模拟用户注册
 */
public class UserCheckExceptionDemo {
    private static String[] names = {"bili","cili","dili"};

    public static void main(String[] args)  {
        String username = "ciei";
        boolean zccg = false;
        try {
            zccg =  checkUsername(username);
            System.out.println("注册成功");
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(zccg ? "注册姓名为"+username:"注册失败");
    }
    private static boolean checkUsername(String username) throws RegisterException {
        if(Arrays.asList(names).contains(username)){
            throw new RegisterException("用户名已存在");
        }
        return true;
    }
}
class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
