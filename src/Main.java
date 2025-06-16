public class Main {
    public static void main(String[] args)
    {
        double nota1 = 8;
        double nota2 = 2;
        double nota3 = 3;
        double nota4 = 5;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        boolean passou = media >= 5;

        if (passou)
        {
            System.out.println("Parabens, você passou!");
        }
        else
        {
            System.out.println("Que pena estude mais na proxima vez!");
        }

        System.out.printf("Sua media é: %.2f%n", media);
    }
}