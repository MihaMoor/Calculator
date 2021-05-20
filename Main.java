import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Input math:");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        
        Arabian ar;
        Rim rim;
        
        if((int)str.charAt(0) > 47 && (int)str.charAt(0) < 58){
            if((int)str.charAt(str.length()-1) > 47 && (int)str.charAt(str.length() - 1) < 58)
                ar = new Arabian(str);
            else System.out.println("Вы ввели числа из разных систем!");
        }
        else if((int)str.charAt(0) > 64 && (int)str.charAt(0) < 91){
                if((int)str.charAt(str.length()-1) > 64 && (int)str.charAt(str.length()-1) < 91)
                    rim = new Rim(str);
                else System.out.println("Вы ввели числа из разных систем!");
        }else System.out.println("Некорректный ввод данных!");
    }
}
