package hw17;

public class CategoryException extends RuntimeException {
    private String message;
    public CategoryException (String category){
        this.message = "The Product" + category + " is not found\n";
    }

    @Override
    public String getMessage(){
        return message;
    }
}
