// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Adivinhacao {
   public Adivinhacao() {
   }

   public static void main(String[] var0) {
      int var1 = 42;
      int var2 = 0;
      Scanner var3 = new Scanner(System.in);

      while(var2 != var1) {
         System.out.println("Digite o seu chute: ");
         var2 = var3.nextInt();
         if (var2 < 0) {
            System.out.println("Você não pode chutar números negativos");
         } else if (var2 == var1) {
            System.out.println("Você acertou!");
         } else if (var2 > var1) {
            System.out.println("O seu chute foi maior que o número secreto");
         } else {
            System.out.println("O seu chute foi menor que o número secreto");
         }
      }

      var3.close();
   }
}
