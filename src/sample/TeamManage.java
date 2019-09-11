package sample;

import java.util.ArrayList;

public interface TeamManage {
    String manageGoalKeeper(ArrayList<GoalKeeper> g);
    String manageDefender(ArrayList<Defender> d);
    String manageForward(ArrayList<Forward> f);
    String manageMidFielder(ArrayList<MidFielder> m);
}
