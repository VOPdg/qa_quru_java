package hansecom.com;

public class HelloWord {


    //типы данных бесконечное число, они рпоисходят от примитивных типов данных

    boolean aBoolean = true; // or false ||aboolean - это поле класса || = - оператор присвоения
    char aChar = '&';

    //отличаются размером памяти и диапозоном
    byte aByte = 1;
    short aShort = 1;
    int anInt = 1; //лучше использовать для тестов
    long aLong = 1;

    // особенность, что округление ( не предназначены для точных вычислений)
   float aFloat = 1.0F;
   double aDouble= 1.0; // лучше использовать для теста

   static class Human {
        int age = 0; //0 дефолтное состояние
        String name = "unnamed human"; //null default

        public void sayName() {
            System.out.println(name);
        }
        public void sayAge(){
            System.out.println(age);
        }
        public void incrementAge() {
            age = age +1;
        }
    }


    //модификатор доступа||static -> возвращаемое значение-> имя -> (аргументы)
    // void используется что метод ничего не возвращает
    public static void main(String[] args){
        // аргумент который передали в метод println || System.out - класс System в нем есть объект out из него вызывается метод(квалификтор)

        int age= 10; // переменная явл самим значением
        String message = "Hello Word!!!"; // тоже самое что и выше
        Human veronika = new Human(); // переменные типов класса явл сыылкой н адрес в памяти
        Human masha = new Human();
        veronika.name = "Vero";
        veronika.age = 37;
        masha.name = "Masha";
        masha.age = 38;
        veronika.sayName();
        masha.sayName();
        masha.incrementAge();
        veronika.sayAge();
        masha.sayAge();

        System.out.println(message);

        System.out.println("Hello Word");
        System.out.println(veronika.name);
        System.out.println(veronika.age);



    }
}
  // Классы - дают возможность иметь методы и группировать разные типы даннных
  // когда мы используем переменные и поля с типами классов, мы говорим о ссылке на этот объект
  // когда мы используем переменные поля примитов мы говорим о конкретном значении
