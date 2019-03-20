public class stringMath {
    private String load;

    public stringMath(int a, int b, String op){
        this.load = a + ";" + b + ";" + op;
    }

    static public int decodeAndAdd(String eq){
        String[] val = eq.split(";");
        for(String e : val){
            System.out.println(e);
        }
        if(val[2].charAt(0) == "+".charAt(0)){
            System.out.println("ayoo");
            return Integer.parseInt(val[0]) + Integer.parseInt(val[1]);
        }else{
            return Integer.parseInt(val[0]) - Integer.parseInt(val[1]);
        }
    }

    public String getLoad() {
        return load;
    }
}
