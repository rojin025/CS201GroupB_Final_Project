package scope.more;

public class StoreDirectory {
    private Bookstore bookstore;
    private Market market;
    public StoreDirectory(String custId){
        bookstore = new Bookstore(custId);
        market = new Market();
    }

    //implement - to check Id
    public static boolean isGoodId(String id) {
        return Ids.isGoodId(id);
    }

    public int getNumberOfBooks() {
        return bookstore.getNumBooks();
    }
    public int getNumberOfBookstoreEmployees() {
        //implement
        return bookstore.getNumEmployees();
    }
    public boolean addNewEmployee(String employeeId){
        //implement
        return bookstore.addNewEmployee(employeeId);
    }
    public boolean bookIsInStock(String bookId){
        //implement
        return bookstore.bookIsInStock(bookId);
    }
    public boolean addNewBook(String bookId) throws RuntimeException {
        //implement
        return bookstore.addNewBook2(bookId);
    }
    public boolean marketCarriesFoodItem(String foodItem){
        //implement
        return market.carriesFoodItem(foodItem);
    }
}
