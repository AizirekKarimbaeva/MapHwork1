import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       HashMap<Car,Infocar> map = new HashMap<>();
       map.put(new Car(5,7777),new Infocar(2022,"BMW",1000000,"Black"));
       map.put(new Car(1,1402),new Infocar(2020,"Kia",3000000,"White"));
       map.put(new Car(3,2002),new Infocar(1999,"Porsche",90000000,"Red"));
       for(Map.Entry<Car,Infocar>entry: map.entrySet()){
          System.out.println(entry.getKey()+""+entry.getValue());
       }
    }
}