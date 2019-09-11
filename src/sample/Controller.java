package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public ArrayList<GoalKeeper> goalKeepers = new ArrayList<>();
    public ArrayList<MidFielder> midFielders = new ArrayList<>();
    public ArrayList<Defender> defenders = new ArrayList<>();
    public ArrayList<Forward> forwards = new ArrayList<>();
    @FXML public Label defenderName;
    @FXML public Label forwardName;
    @FXML public Label goalkeeperName;
    @FXML public Label midfielderName;
    Manage442 manage442 = new Manage442();
    Manage343 manage343 = new Manage343();
    Manage433 manage433 = new Manage433();
    Manage451 manage451 = new Manage451();

    public void readFootballTeamFromFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("team.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[0].equals("NAME") || arr[1].equals("SHIRT") || arr[2].equals("POSITION"))
                    continue;
                if(arr[0]!=null && arr[1]!=null&& arr[2]!=null) {
                    if(!arr[2].contains("/")) {
                        if (arr[2].equals("GK")){
                            GoalKeeper goalKeeper = new GoalKeeper(arr[0],arr[1]);
                            goalKeepers.add(goalKeeper);
                        }
                        else if (arr[2].equals("MF")) {
                            MidFielder midFielder = new MidFielder(arr[0],arr[1]);
                            midFielders.add(midFielder);
                        }
                        else if (arr[2].equals("DF")) {
                            Defender defender = new Defender(arr[0],arr[1]);
                            defenders.add(defender);
                        }
                        else if (arr[2].equals("FW")){
                            Forward forward = new Forward(arr[0],arr[1]);
                            forwards.add(forward);
                        }
                    }
                    else{
                        String[] postitions = arr[2].split("/");
                        String position1 = postitions[0];
                        String position2 = postitions[1];
                        if (position1.equals("GK")){
                            GoalKeeper goalKeeper = new GoalKeeper(arr[0],arr[1]);
                            goalKeepers.add(goalKeeper);
                        }
                        if (position1.equals("MF")) {
                            MidFielder midFielder = new MidFielder(arr[0],arr[1]);
                            midFielders.add(midFielder);
                        }
                        if (position1.equals("DF")) {
                            Defender defender = new Defender(arr[0],arr[1]);
                            defenders.add(defender);
                        }
                        if (position1.equals("FW")){
                            Forward forward = new Forward(arr[0],arr[1]);
                            forwards.add(forward);
                        }

                        if (position2.equals("GK")){
                            GoalKeeper goalKeeper = new GoalKeeper(arr[0],arr[1]);
                            goalKeepers.add(goalKeeper);
                        }
                        if (position2.equals("MF")) {
                            MidFielder midFielder = new MidFielder(arr[0],arr[1]);
                            midFielders.add(midFielder);
                        }
                        if (position2.equals("DF")) {
                            Defender defender = new Defender(arr[0],arr[1]);
                            defenders.add(defender);
                        }
                        if (position2.equals("FW")){
                            Forward forward = new Forward(arr[0],arr[1]);
                            forwards.add(forward);
                        }
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void haddle442ButtonOnclick(ActionEvent actionEvent) {
        readFootballTeamFromFile();
        defenderName.setText(manage442.manageDefender(defenders));
        midfielderName.setText(manage442.manageMidFielder(midFielders));
        forwardName.setText(manage442.manageForward(forwards));
        goalkeeperName.setText(manage442.manageGoalKeeper(goalKeepers));
        manage442.randomMidFielder.clear();
        manage442.randomDefender.clear();
        manage442.randomForward.clear();
    }

    public void haddle343ButtonOnclick(ActionEvent actionEvent) {
        readFootballTeamFromFile();
        midfielderName.setText(manage343.manageMidFielder(midFielders));
        defenderName.setText(manage343.manageDefender(defenders));
        forwardName.setText(manage343.manageForward(forwards));
        goalkeeperName.setText(manage343.manageGoalKeeper(goalKeepers));
        manage343.randomMidFielder.clear();
        manage343.randomDefender.clear();
        manage343.randomForward.clear();
    }

    public void haddle433ButtonOnclick(ActionEvent actionEvent) {
        readFootballTeamFromFile();
        midfielderName.setText(manage433.manageMidFielder(midFielders));
        defenderName.setText(manage433.manageDefender(defenders));
        forwardName.setText(manage433.manageForward(forwards));
        goalkeeperName.setText(manage433.manageGoalKeeper(goalKeepers));
        manage433.randomMidFielder.clear();
        manage433.randomDefender.clear();
        manage433.randomForward.clear();
    }

    public void handle451ButtonOnclick(ActionEvent actionEvent) {
        readFootballTeamFromFile();
        midfielderName.setText(manage451.manageMidFielder(midFielders));
        defenderName.setText(manage451.manageDefender(defenders));
        forwardName.setText(manage451.manageForward(forwards));
        goalkeeperName.setText(manage451.manageGoalKeeper(goalKeepers));
        manage451.randomMidFielder.clear();
        manage451.randomDefender.clear();
        manage451.randomForward.clear();
    }

}
