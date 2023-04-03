import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = getList();
        List<Integer> ans = null;

        /* Filter */
        ans = list.stream().filter(listItem -> { return listItem > 50; } ).toList();
        System.out.println(ans);
    

        /* Sort */
        ans = list.stream().sorted((a,b)->{ return a-b; }).toList();
        System.out.println(ans);

        /* All Match - (i.e. if all in list)*/
        boolean greaterThanZero = list.stream().allMatch(listItem -> listItem > 0);
        System.out.println(greaterThanZero);

        /* Any Match - (i.e. if any one in list)*/
        boolean isZeroPresent = list.stream().anyMatch(listItem -> listItem == 0);
        System.out.println(isZeroPresent);

        /* None Match - (i.e. if any one in list)*/
        boolean isNegativePresent = list.stream().noneMatch(listItem -> listItem < 0);
        System.out.println(isNegativePresent);


        /* Max */ 
        Optional<Integer> max  = list.stream().max((a,b)->{ return a-b; });
        System.out.println(max.get());

        /* Min */ 
        Optional<Integer> min  = list.stream().min((a,b)->{ return a-b; });
        System.out.println(min.get());



    }

    static List<Integer> getList(){
        return new ArrayList<Integer>(List.of(2,5,6,7,8,9,4,33,44,77,1,3,6,77,88,999));
    }

    static int compareTo(int a, int b){
        return a-b;
    }

}
