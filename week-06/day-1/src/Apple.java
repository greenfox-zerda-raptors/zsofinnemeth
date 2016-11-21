import java.util.ArrayList;

public class Apple {
    String name= "apple";

    public String getName() {
        return name;
    }

       ArrayList<Integer> list = new ArrayList<>();

        public int sum () {
            int counter = 0;
            for (Integer i : this.list) {
                counter += i;
            }
            return counter;
        }

        public void add(int i) {
            this.list.add(i);
        }

//    public void setName(String name) {
//        this.name = name;
//    }
}
