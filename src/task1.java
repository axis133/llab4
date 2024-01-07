import java.util.ArrayList;
import java.util.List;

class Слово {
    private String слово;
    public Слово(String слово) {
        this.слово = слово;
    }
    public String getСлово() {
        return слово;
    }
}

class Страница {
    private List<Слово> слова;
    public Страница(List<Слово> слова) {
        this.слова = слова;
    }
    public void добавитьСлово(Слово слово) {
        слова.add(слово);
    }
    public List<Слово> получитьСлова() {
        return слова;
    }
}

public class task1 {
    public static void main(String[] args) {
        Слово слово1 = new Слово("Привет");
        Слово слово2 = new Слово("Мир");
        List<Слово> словаНаСтранице = new ArrayList<>();
        словаНаСтранице.add(слово1);
        словаНаСтранице.add(слово2);
        Страница страница = new Страница(словаНаСтранице);
        Слово слово3 = new Слово("Java");
        страница.добавитьСлово(слово3);
        List<Слово> словаИзСтраницы = страница.получитьСлова();
        for (Слово слово : словаИзСтраницы) {
            System.out.println(слово.getСлово());
        }
    }
}