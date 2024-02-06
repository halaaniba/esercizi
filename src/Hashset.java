import java.util.HashSet;
import java.util.HashSet;

/* Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetcarList();
        String checkObject = createObject("Tesla");
        checkResult(hashSet,checkObject);


    }
    public static HashSet<String> hashSetcarList(){
        HashSet<String> carList = new HashSet<>();
        carList.add("Volvo");
        carList.add("Fiat");
        carList.add("BMW");
        carList.add("Renault");
        carList.add("Tesla");
        return carList;



    }
    public static String createObject(String value){
        String oggetto = new String(value);
        return oggetto;

    }
    public static void checkResult(HashSet<String> hashSet, String checkObject) {
        if (hashSet.contains(checkObject)) {
            System.out.println("L'oggetto è parte dell'HashSet: " +checkObject);
        } else {
            System.out.println("L'oggetto non è parte dell'HashSet: " + checkObject);
        }
    }
}