package scope.more;

public class Market {

    private final String BANANAS = "bananas";
    private final String GRAPES = "grapes";
    private final String CHERRIES = "cherries";
    private final String MILK = "milk";
    private final String ALMONDS = "almonds";
    private final String POTATOES = "potatoes";
    private final String BROCCOLI = "broccoli";
    private final String BOTTLED_WATER = "bottled_water";

    private final String[] STORE_ITEMS =
            {
                    BANANAS,
                    GRAPES,
                    CHERRIES,
                    MILK,
                    ALMONDS,
                    POTATOES,
                    BROCCOLI,
                    BOTTLED_WATER
            };

    boolean carriesFoodItem(String itemName){
        if(itemName == null) return false;
        for(String s : STORE_ITEMS){
            if(itemName.equals(s)) return true;
        }
        return false;
    }
}
