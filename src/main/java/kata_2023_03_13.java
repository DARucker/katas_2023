import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class kata_2023_03_13 {

    /**
     * the user enters the length of the key to request and receives a randomly generated string
     * @param args
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese longitud de la clave: ");
        int longitud = sc.nextInt();

        List<String> prueba = Stream.generate(() -> (Math.random() * (126-33)) +33)
                .filter(x ->x != 34 || x != 39 || (x>=43 && x<=59) || x != 63 || x != 124)
                .limit(longitud).map(x -> {
                    String y;
                    y = Character.toString(x.intValue());
                    return y;
                }).collect(Collectors.toList());
        prueba.forEach(System.out::print);

    }
}

//int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;

// A = 65
// Z = 90
// a = 97
// z = 122
//  !,@,#,$,%,^,&,*,(,),{,},[,],=,<,>
/*
! 33
@ 64
# 35
$ 36
% 37
^ 94
& 38
* 42
( 40
) 41
{ 123
} 125
[ 91
] 92
= 61
< 60
> 62
 */