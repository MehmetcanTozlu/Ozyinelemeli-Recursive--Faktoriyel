import java.util.*;
public class RecursiveFactoriel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Bulmak İstediğiniz Faktöriyel Değerini Giriniz :");
        int fac = sc.nextInt();
        factoriel(fac);
        System.out.println("Faktöriyel Değeri : "+factoriel(fac));
    }
    public static int factoriel(int x){
        if(x == 0 || x == 1)
            return 1;
        else
            return (x*factoriel(x-1));
    }
}