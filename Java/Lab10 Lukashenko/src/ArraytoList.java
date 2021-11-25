import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraytoList<E> {
    List<String> list = new LinkedList();
    public void convert(E[] arr) {
        String path = "C:\\Users\\Сергей-ПК\\eula";
        File dir = new File(path); //path указывает на директорию
        List<File> lst = new ArrayList<>();
        for (File file : dir.listFiles()) {
            lst.add(file);
        }
        for (int i = 0; i < 5; i++)
            System.out.println(lst.get(i));
    }



    }

