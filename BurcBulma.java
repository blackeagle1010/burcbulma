import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        Scanner Input = new Scanner(System.in);

        System.out.println("enter your borned month (1..12):");
        month = Input.nextInt();

        System.out.println("enter your borned day");
        day = Input.nextInt();

        if ((month == 3) && (day >= 21 && day <= 31)) {
            System.out.println("senin burcun :" + "koç");
            if ((month == 4) && (day >= 1 && day <= 20)) {
                System.out.println("senin burcun :" + "koç");
                else{
                    System.out.println("hata var!!!");
                }
            }else {
                System.out.println("hata var!!!");
            }
        } else if ((month == 4) && (day >= 21 && day <= 31)) {
            System.out.println("senin burcun :" + "boğa");
            if ((month == 5) && (day >= 1 && day <= 21)) {
                System.out.println("senin burcun :" + "boğa");
                else{
                    System.out.println("hata var!!!");
                }
            }
            else {
                System.out.println("hata var!!!");
            }
        }
    }

        } /*else if ((month == 5) && (day >= 22 && day <= 31)) {
            System.out.println("senin burcun :" + "ikizler");
            if ((month == 6) && (day >= 1 && day <= 22)) {
                System.out.println("senin burcun :" + "ikizler");
                else{
                    System.out.println("hata var!!!");
                }
            }
        }
    }
}



            /*else if ((month == 6) && (day >= 23 && day <= 31)) {
                System.out.println("senin burcun :" + "yengeç");
            }if ((month == 7) && (day >= 1 && day <= 22)) {
                System.out.println("senin burcun :" + "yengeç");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 7) && (day >= 23 && day <= 31)) {
                System.out.println("senin burcun :" + "aslan");
            }if ((month == 8) && (day >= 1 && day <= 22)) {
                System.out.println("senin burcun :" + "aslan");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 8) && (day >= 1 && day <= 23)) {
            System.out.println("senin burcun :" + "başak");
            }if ((month == 9) && (day >= 1 && day <= 22)){
                System.out.println("senin burcun :" + "başak");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 9) && (day >= 1 && day <= 23)) {
            System.out.println("senin burcun :" + "terazi");
            }if ((month == 10) && (day >= 1 && day <= 22)){
                System.out.println("senin burcun :" + "terazi");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 10) && (day >= 1 && day <= 23)) {
            System.out.println("senin burcun :" + "akrep");
            }if ((month == 11) && (day >= 1 && day <= 21)){
                System.out.println("senin burcun :" + "akrep");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 11) && (day >= 1 && day <= 22)) {
            System.out.println("senin burcun :" + "yay");
            }if ((month == 12) && (day >= 1 && day <= 21)){
                System.out.println("senin burcun :" + "yay");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 1) && (day >= 1 && day <= 22)) {
            System.out.println("senin burcun :" + "oğlak");
            }if ((month == 2) && (day >= 1 && day <= 21)){
                System.out.println("senin burcun :" + "oğlak");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 2) && (day >= 1 && day <= 22)) {
            System.out.println("senin burcun :" + "kova");
            }if ((month == 3) && (day >= 1 && day <= 19)){
                System.out.println("senin burcun :" + "kova");
            }else {
                System.out.println("hata var!!!");

        }else if ((month == 2) && (day >= 1 && day <= 20)) {
            System.out.println("senin burcun :" + "balık");
            }if ((month == 3) && (day >= 1 && day <= 20)){
                System.out.println("senin burcun :" + "balık");
            }else {
                System.out.println("hata var!!!");

        }else {
            System.out.println("review the source code for debugging...");
        }
    }
}*/