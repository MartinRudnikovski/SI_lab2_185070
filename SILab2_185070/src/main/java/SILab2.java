import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public List<String> function(List<String> list) {
        if (list.size() <= 0) {//A
            throw new IllegalArgumentException("List length should be greater than 0");//B
        }
        List<String> numMines = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {//C // D
            if (!list.get(i).equals("#")) {//E
                int num = 0;
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//G
                    num++;//H
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//I
                    num++;//J
                }
                numMines.add(String.valueOf(num));//K
            } else {//L
                numMines.add(list.get(i));
            }
            //F
        }
        return numMines;//M
    }
}

