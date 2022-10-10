public class App {
    public static void main(String[] args) throws Exception {
        CocheCRUD car = new CocheCRUDImpl();

        car.delete();
        car.findAll();
        car.save();
    }
}
