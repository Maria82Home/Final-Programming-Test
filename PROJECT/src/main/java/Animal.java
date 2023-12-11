import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
    String name;
    String birthday;
    String type;
    ArrayList<String> commands;

    public Animal(String name, String birthday, String type, ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.type = type;
        this.commands = commands;
    }

    public String getName(){return name;}
    public void addName(String name){this.name = name;}
    public String getBirthday(){return birthday;}
    public void addBirthday(String birthday){this.birthday = birthday;}
    public String getType(){return type;}
    public void getCommands(){
        for (String command : commands)
        {
            System.out.print(command+" ");
        }
    }
    public void addCommands(String command){this.commands.add(command);}

}


