/*
  Условие задачи:
  Проверить, является ли заданное слово палиндромом
*/
public class Task3 {    
    public static void main(String[] args) { 
        System.out.print("Введите строку для проверки на палиндром: ");
        Scanner sc = new Scanner(System.in, "cp1251");
        String s = sc.nextLine();
        StringBuilder s2 = new StringBuilder(s);  // создаем временный объект StringBuilder для использования его метода реверсирования строки
        String s3 = new String(s2.reverse());  // создаем реверсированную строку, используя метод reverse() объекта StringBuilder
        boolean check = false;
        if(s.equalsIgnoreCase(s3)) check = true;  // если обычная и реверсированная строки равны, значит слово палиндром
        String answer = check ? "слово является палиндромом" : "слово не является палиндромом";
        System.out.println("Результат проверки: " + answer);
    }    
}
