import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Proqram yazın istifadəçidən söz vəya cümlə alsın və bu texti tərsdən yazdırsın.
//        Note:String text =“abc”;
//        abc.length() =3
//        charAt() metodunu arasdirin yazmaq ucun basa dusmesez dersde basa salacam
//
//
//
//        Scanner task = new Scanner(System.in);
//        System.out.print("text daxil edin: ");
//        String word = task.nextLine();
//
//        String tersWord = " ";
//
//        for (int i = word.length()-1; i>=0; i--){
//            tersWord += word.charAt(i);
//
//        }
//        System.out.println(tersWord);


//        İstifadəçidən sadəcə rəqəməri cəmi tək olan ədədləri alıb arraya yığan bir application yazın
//        əgər rəqəmləri cəmi tək deyilsə təkrar yazmasını istəyin.
//        Və neçə ölçülü bir array yaratmaq istədiyinidə istifadəçi təyin etsin.



        Scanner scanner = new Scanner(System.in);
        System.out.print("nece reqemli array yaratmaq isteyirsiz: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        checkNum(array);


        for (var a:array){
            System.out.println(a);
        }

    }

    public static void checkNum(int[] array){
        int count =0;

        while (array.length>count){
            System.out.print(count + 1 + ". eded daxil edin: ");

            Scanner scanner = new Scanner(System.in);
            int eded = scanner.nextInt();

            int value = eded;
            int sum =0;

            while (value>0){
                int sonReqem = value%10;
                value/=10;
                sum += sonReqem;
            }
            if (sum%2==1){
                array[count]= eded;
                count++;
            }
            else {
                System.out.print("tekrar daxil edin: ");
            }
        }
    }
}