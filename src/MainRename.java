public class MainRename {
    public static void main(String[] args) {
        int age = 13;
        if(age < 18){
            System.out.println("child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager!");
        }
        else {
            System.out.println("Older");
        }
    }
}