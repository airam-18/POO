import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private final int P_CAPACITY;
    private int size;
    private List<Produs> products= new ArrayList<>();
    Magazin(){
        P_CAPACITY = 50;
    }

    Magazin(int capacity){
        P_CAPACITY = capacity;
    }

    public void addProduct(Produs p) throws IllegalAccessException {
        if(p==null){
            throw new IllegalAccessException("Nu putem adauga produs null");
        }
        else if(products.size()>P_CAPACITY){
            throw new IllegalAccessException("Nu putem adauga produse, too many");
        }
         products.add(p);
    }

    void remove_old_stuff(){
        for(int i=0;i<products.size();i++){
            if(products.get(i) instanceof Laptop ){
                if(products.get(i).vechime>5)
                    products.remove(i);
            }
            else if(products.get(i) instanceof Mouse){
                if(products.get(i).vechime>3)
                {
                    products.remove(i);
                }
            }
            else if(products.get(i) instanceof Telefon)
            {
                if(products.get(i).vechime>4)
                {
                    products.remove(i);
                }
            }
        }
    }
    public void afisare()
    {
        System.out.println("Descriere produse: ");
        for(int i=0;i<products.size();i++){
                products.get(i).descriere();

        }

        System.out.println("Actiunii produse: ");
        for(int i=0;i<products.size();i++){
            products.get(i).actiune();
        }

    }
}
