package p06_methodCreation;
public class Method_Creation {
public static void main(String[] args) {
// bir method'u oluşturmak o methodu çalıştırmak için yeterli değildir.
// Eğer bir methodu çalıştırmak isterseniz "Method Call" (Methodu çağırmalısınız)
// Method call yapmak için methodun adı ve varsa parametreleri  yazılmalıdır.
toplama(-3,4);
//sadece method call yaptığımızda method çalışır.
// eğer methodun içinde bir şey yazdırıyorsak console'da o yazıyı görürürüz.
// ancak methodumuz return type'a sahipse bize bir sonuç return edecektir.
// bu sonucu ya direkt yazdırırız.
System.out.println(toplama(4,3));
// yada dönen sonucu bir variable 'ye atayabiliriz.
int sonuc= toplama(10,15);
System.out.println(sonuc);
}
public static int toplama(int sayi1,int sayi2) {
System.out.println("Method çalıştı");
return sayi1+sayi2;
}
}