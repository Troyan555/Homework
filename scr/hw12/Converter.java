package hw12;

import java.util.List;
import java.util.Arrays;

public class Converter {
    public <T> List<T> toList(T[] array){
        return Arrays.asList(array);
    }
}
