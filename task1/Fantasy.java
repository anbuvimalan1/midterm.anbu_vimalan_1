package midterm.anbu_vimalan_1.task1;
import java.util.List;
import java.util.ArrayList;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Anbu";

    public Fantasy() {

    }

    @Override
    public String getCat1() {
        return "This is the implementation of getCat1 in Fantasy class";
    }

    @Override
    public String getSalad2() {
        return "This is the implementation of getSalad2 in Fantasy class";
    }

    @Override
    public String methodComputer3(String argThread5) {
        return "This is the implementation of methodComputer3 in Fantasy class with argument: " + argThread5;
    }

    @Override
    public List<String> methodVeterinarian4(String argTeleportation6) {
        List<String> result = new ArrayList<>();
        result.add("This is the implementation of methodVeterinarian4 in Fantasy class with argument: " + argTeleportation6);
        return result;
    }


    @Override
    public String toString() {
        return "Fantasy class created by " + studentName;
    }

    public static void main(String[] args) {
        // Example usage:
        Fantasy fantasy = new Fantasy();
        System.out.println(fantasy.getCat1());
        System.out.println(fantasy.getSalad2());
        System.out.println(fantasy.methodComputer3("Thread argument"));
        System.out.println(fantasy.methodVeterinarian4("Teleportation argument"));
        System.out.println(fantasy);
    }

}
