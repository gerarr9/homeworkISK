import java.util.IllegalFormatCodePointException;
import java.util.SplittableRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

    private  Date(){
    }
    public static  boolean validate(String login, String password, String confirmPassword){
        try {
            check(login,password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return  false;
        }
        return  true;
    }
    private static void  check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (!validate(login)){
            throw new  WrongLoginException("Логин не валидный");
        }    if (!validate(password)){
            throw new  WrongLoginException("Пароль не валидный");
        }    if (!password.equals(confirmPassword)){
            throw new  WrongLoginException("Пароли не совподают");
        }


    }
    private static  boolean validate(String chek){
        Pattern pat = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m = pat.matcher(chek);
        if (chek.length() > 20){
            return false;
        }
        if (m.matches() == true){
            return  true;
        }
        return  false;
    }

}
