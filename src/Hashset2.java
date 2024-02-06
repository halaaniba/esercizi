import java.util.HashSet;
import java.util.Set;
public class Hashset2 {
    public static void main(String[]args){
        System.out.println(cars());
        HashSet<String>carSet = cars();
        String car ="Volvo";
        for (int i = 0 ; i < cars().size();i++){
            if(carSet.contains(car)){
                carSet.remove(car);
            }
        }
        System.out.println(carSet);
    }
    public static HashSet<String> cars(){
        HashSet<String> carsList = new HashSet<>();
        carsList.add("Volvo");
        carsList.add("Fiat");
        carsList.add("BMW");
        carsList.add("Renault");
        carsList.add("Tesla");
        return carsList;
    }


        }





