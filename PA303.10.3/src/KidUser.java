public class KidUser implements  LibraryUser{
    int age;
    String bookType;
    KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }
    @Override
    public int registerAcount() {
        if(age < 12){
            System.out.println("You have registered under a Kids account.");
        }else System.out.println("Sorry, age must be less than 12 to register.");
        return 0;
    }

    @Override
    public String requestBook() {
        if(bookType == "Kids"){
            System.out.println("Book issued successfully!");
        }else System.out.println("Oops, you are allowed to take only Kids books! :(");
        return "";
    }
}