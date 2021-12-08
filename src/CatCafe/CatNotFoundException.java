package CatCafe;

public class CatNotFoundException extends RuntimeException{
    public CatNotFoundException(){}
    public CatNotFoundException(String gripe){
        super(gripe);
    }
}
