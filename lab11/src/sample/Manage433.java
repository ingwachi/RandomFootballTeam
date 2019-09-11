package sample;

import java.util.ArrayList;
import java.util.Random;

public class Manage433 implements TeamManage{

    ArrayList<Integer> randomDefender = new ArrayList<>();
    ArrayList<Integer> randomMidFielder = new ArrayList<>();
    ArrayList<Integer> randomForward = new ArrayList<>();

    private int nextRandomIndex(int num, Random random, ArrayList<Integer> randoms) {
        int i = random.nextInt(num);
        while (randoms.contains(i)) {
            i = random.nextInt(num);
        }
        randoms.add(i);
        return i;
    }

    @Override
    public String manageGoalKeeper(ArrayList<GoalKeeper> g) {
        Random random = new Random();
        String result = "";
        for (int i = 0;i < 1;i++) {
            int index = random.nextInt(3);
            result += g.get(index).getName() + "(" + g.get(index).getNumShirt() + ")" + " ";
        }
        return result;
    }

    @Override
    public String manageDefender(ArrayList<Defender> d) {
        Random random = new Random();
        String result = "";
        for (int i = 0;i < 4;i++){
            int index = nextRandomIndex(7,random,randomDefender);
            result += d.get(index).getName() + "(" + d.get(index).getNumShirt() + ")" + " " + " ";
        }
        return result;
    }

    @Override
    public String manageForward(ArrayList<Forward> f) {
        Random random = new Random();
        String result = "";
        for (int i = 0;i < 3;i++){
            int index = nextRandomIndex(7,random,randomForward);
            result += f.get(index).getName() + "(" + f.get(index).getNumShirt() + ")" + " ";
        }
        return result;
    }

    @Override
    public String manageMidFielder(ArrayList<MidFielder> m) {
        Random random = new Random();
        String result = "";
        for (int i = 0;i < 3;i++){
            int index = nextRandomIndex(7,random,randomMidFielder);
            result += m.get(index).getName() + "(" + m.get(index).getNumShirt() + ")" + " ";
        }
        return result;
    }
}
