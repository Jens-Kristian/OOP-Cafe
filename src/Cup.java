public class Cup {
    private final String name;
    private final String size;
    private final boolean flødeskum;


    public Cup(String cupName, String cupSize, boolean cupFlødesum) {
        name = cupName;
        size = cupSize;
        flødeskum = cupFlødesum;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean getFlødeskum() {return flødeskum;}


    public String toString() {
        return "Drik :" + name +"\nSize :" +size+" \nHas flødesum : " +flødeskum+"\n_________";
    }
}

