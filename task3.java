
// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).


public class task3{
    public class Palindrome{


    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {   
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "12 21"; 
        if (isPalindrome(str))
            System.out.print("Answer: Yes, entered string is palindrom");
        else
            System.out.print("Answer: No, enetered string is NOT palindrom");
    }
}
}
