package statistics.matcher;

import statistics.Player;

public class Not implements Matcher{

    @Override
    public boolean matches(Player player){
        return false;
    }

}
