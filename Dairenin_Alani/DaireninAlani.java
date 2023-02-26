import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        double r, Pi=3.14, DAlani, DCevresi, Aci, AcisalAlan;
        Scanner Input = new Scanner (System.in);
        System.out.print("yarıçapı giriniz:");
        r = Input.nextDouble();
        DCevresi = 2 * Pi * r;
        DAlani = Pi * Math.pow(r,r);
        System.out.print("Açı giriniz:");
        Aci = Input.nextDouble();
        AcisalAlan = DAlani * Aci / 360;
        System.out.println("Dairenin Çevresi:" + DCevresi);
        System.out.println("Dairenin Alani:" + DAlani);
        System.out.println("Açısal Alan:" + AcisalAlan);

    }
}

  /*  Dairenin Alanını ve Çevresini Hesaplayan Program Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360     */