interface Enumeration{
    public boolean hasNext(int index);
    public Object getNext(int index);
}

class NameCollection implements Enumeration{
    private String[] names;

    public NameCollection() {
        names = new String[10];
    }

    public NameCollection(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public boolean hasNext(int index){
        if(index >= 0 && index < names.length){
            return true;
        }else{
            return false;
        }
    }
    public Object getNext(int index){
        if (hasNext(index)) {
            return names[index];
        }else{
        return null;
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        String[] names = {"Diddy", "JoJo", "KaKa", "Lilly"};
        NameCollection nc = new NameCollection(names);
        
        for(int i = 0; i < names.length; i++){
            if (nc.hasNext(i)) {
                System.out.println(nc.getNext(i));
            }
        }
    }
}
