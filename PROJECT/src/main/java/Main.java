import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    static ArrayList<Animal> reestr;
    static Counter counter;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Питомник животных. Реестр.");
        System.out.println("Меню:");
        System.out.println("0: Выход");
        System.out.println("1: Добавить животное");
        System.out.println("2: Вывести список команд животного");
        System.out.println("3: Добавить команды животному");
        System.out.println("Вы выбрали: ");
        int action = in.nextInt();
        switch (action) {
            case 0:
                System.exit(0);
            case 1: {
                addAnimal(reestr);
                counter.add();
            }
            case 2:
                viewCommands(reestr);
            case 3:
                addCommands(reestr);
            default:
                System.out.println("Неверный выбор");
        }}
        // Добавление животного
        public static void addAnimal (ArrayList<Animal>reestr) {
        Animal animal;
            System.out.println("Введите имя");
            String name = in.nextLine();
            System.out.println("Введите дату рождения");
            String birthday = in.nextLine();
            System.out.println("Введите команды");
            ArrayList<String> commands = new ArrayList<>();
            while(true){
                String command = in.toString();
                if (command == null) {
                    break;
                }
                commands.add(command);
            }
            System.out.println("Введите тип животного (cat, dog, hamster, horse, donkey, camel");
            String type = in.toString();
            switch (type){
            case "cat":animal = new Cat(name,birthday,commands);
            case "dog":animal = new Dog(name,birthday,commands);
            case "hamster":animal = new Hamster(name,birthday,commands);
            case "horse":animal = new Horse(name,birthday,commands);
            case "donkey":animal = new Donkey(name,birthday,commands);
            case "camel":animal = new Camel(name,birthday,commands);
            default: animal = new Cat(name,birthday,commands);
        }
        reestr.add(animal);
        }
        // Просмотр команд
        public static void viewCommands (ArrayList<Animal> reestr) {
            System.out.println("Какое животное интересует? Введите имя");
            String name = in.nextLine();
            for (Animal animal : reestr){
                if (animal.name == name){animal.getCommands();}
            }
        }
        // Добавление команд
        public static void addCommands (ArrayList<Animal> reestr) {
            System.out.println("Какое животное интересует? Введите имя");
            String name = in.nextLine();
            System.out.println("Какую команду добавить?");
            String command = in.nextLine();
            for (Animal animal : reestr){
                if (animal.name == name){animal.addCommands(command);}
            }

        }
}


