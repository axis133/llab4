import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

class Customer {
    private String TE;
    void askTask() {
        System.out.println("Введите ТЗ: ");
        TE = new Scanner(System.in).nextLine();
    }
    String getTE(){
        return TE;
    }
}
class Constructor {
    void RegisterTE(String TE){
        System.out.println("ТЗ \"" + TE + "\" зарегистрировано. ");
        System.out.println("Стоимость проектирования \"" + TE + "\":" + ThreadLocalRandom.current().nextInt(500, 1501) + " рублей");
        System.out.println("Стоимость строительсвта \"" + TE + "\":" + ThreadLocalRandom.current().nextInt(5000, 20001) + " рублей");
        System.out.println("Проект \"" + TE + "\" будет выполнять " + ThreadLocalRandom.current().nextInt(5, 20) + " конструкторов");
    }
}

public class task2
{
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.askTask();
        Constructor constructor = new Constructor();
        constructor.RegisterTE(customer.getTE());
    }
}