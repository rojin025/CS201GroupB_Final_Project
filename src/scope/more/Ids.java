package scope.more;

public class Ids {
    static boolean isGoodId(String s){
        if(s == null) return false;
        for(String t : goodIds){
            if(s.equals(t)) return true;
        }
        return false;
    }
    private Ids(){}

    private final static String[] goodIds =
            {
                    "002",
                    "004",
                    "011",
                    "020",
                    "081",
                    "194",
                    "197",
                    "222",
                    "377",
                    "511",
                    "620",
                    "821"
            };
}
