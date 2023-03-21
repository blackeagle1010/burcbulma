import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        Scanner Input = new Scanner(System.in);

        System.out.print("enter your borned month (1..12):");
        month = Input.nextInt();

        System.out.print("enter your borned day:");
        day = Input.nextInt();


        if (month == 3) {
            if (day >= 21 && day <= 31) {
                System.out.println("senin burcun :" + "koç");
            } else {
                  System.out.println("iserror");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("senin burcun :" + "koç");
            }
        } else {
            System.out.println("hata var!!!");
        }

        if (month == 4) {
            if (day >= 21 && day <= 31) {
                System.out.println("senin burcun :" + "boğa");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.println("senin burcun :" + "boğa");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 5) {
            if (day >= 22 && day <= 31) {
                System.out.println("senin burcun :" + "ikizler");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.println("senin burcun :" + "ikizler");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 6) {
            if (day >= 23 && day <= 31) {
                System.out.println("senin burcun :" + "yengeç");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.println("senin burcun :" + "yengeç");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 7) {
            if (day >= 23 && day <= 31) {
                System.out.println("senin burcun :" + "aslan");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("senin burcun :" + "aslan");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 8) {
            if (day >= 23 && day <= 31) {
                System.out.println("senin burcun :" + "başak");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.println("senin burcun :" + "başak");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 9) {
            if (day >= 23 && day <= 31) {
                System.out.println("senin burcun :" + "terazi");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.println("senin burcun :" + "terazi");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 10) {
            if (day >= 23 && day <= 31) {
                System.out.println("senin burcun :" + "akrep");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                System.out.println("senin burcun :" + "akrep");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 11) {
            if (day >= 22 && day <= 31) {
                System.out.println("senin burcun :" + "yay");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("senin burcun :" + "yay");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 12) {
            if (day >= 22 && day <= 31) {
                System.out.println("senin burcun :" + "oğlak");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 1) {
            if (day >= 1 && day <= 21) {
                System.out.println("senin burcun :" + "oğlak");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 1) {
            if (day >= 22 && day <= 31) {
                System.out.println("senin burcun :" + "kova");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 19) {
                System.out.println("senin burcun :" + "kova");
            } else {
                System.out.println("hata var!!!");
            }
        }

        if (month == 2) {
            if (day >= 20 && day <= 31) {
                System.out.println("senin burcun :" + "balık");
            } else {
                System.out.println("hata var!!!");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.println("senin burcun :" + "balık");
            } else {
                System.out.println("hata var!!!");
            }
        }
    }
}