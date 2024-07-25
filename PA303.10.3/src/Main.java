public class Main {
    public static void main(String[] args) {
        KidUser justyn = new KidUser(10,"Kids");
        KidUser Alex = new KidUser(18,"Fiction");
        AdultUser Jessy = new AdultUser(5,"Kids");
        AdultUser Abba = new AdultUser(23,"Fiction");

        justyn.registerAcount();
        justyn.requestBook();
        Alex.registerAcount();
        Alex.requestBook();
        Jessy.registerAcount();
        Jessy.requestBook();
        Abba.registerAcount();
        Abba.requestBook();
    }
}