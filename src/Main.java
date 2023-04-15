public class Main {
    public static void main(String[] args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel : Geçtiniz");
                break;
            case 'C':
                ;
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Şartlı : Geçtiniz");
                break;
            case 'F':
                System.out.println("Başarısız : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz. Lütfen girdiyi kontrol deip tekrar deneyiniz.");
        }
    }
}
/*
 Aşağıdaki durumda B ve C değişkenleri için aynı sonuç alınır.
 case 'B':
 case 'C':
 System.out.println("Güzel : Geçtiniz");
 break;
*/