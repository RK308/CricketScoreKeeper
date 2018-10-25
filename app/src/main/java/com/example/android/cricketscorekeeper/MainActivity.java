package com.example.android.cricketscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int englScore = 0;
    int ausScore = 0;
    int wickets = 0;
    int runs = 0;
    int fours = 0;
    int sixes = 0;
    int ausWickets = 0;
    int ausRuns = 0;
    int ausFours = 0;
    int ausSixes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Increase the value for England by 1 */
    public void addOnePointForEngland(View view){
        englScore = englScore + 1;
        runs = runs + 1;
        displayEngland (englScore,wickets);
        displayRuns (runs);
    }

    /* Increase the value for England by 4 */
    public void addFourPointsForEngland(View view){
        englScore = englScore + 4;
        fours = fours + 1;
        displayEngland(englScore,wickets);
        displayFours (fours);
    }

    /* Increase the value for England by 6 */
    public void addSixPointsForEngland(View view){
        englScore = englScore + 6;
        sixes = sixes + 1;
        displayEngland(englScore,wickets);
        displaySixes(sixes);
    }

    /* Count the number of wickets for England */
    public void addWicketsForEngland(View view){
        wickets = wickets + 1;
        // Check for number of wickets is less than 10
        // if not will toast a message as game over.
        if (wickets < 10) {
            // will display till 9th wicket on the score board
            displayEngland(englScore, wickets);
        } else {
            // displayEngland() method is called in else block
            // to display the 10th wicket on the score board.
            displayEngland(englScore, wickets);
            Toast.makeText(this, R.string.toast_game_over, Toast.LENGTH_SHORT).show();
        }
    }

    /* Display the score for England */
    public void displayEngland (int runs, int wickets){
        TextView scoreView = findViewById(R.id.england_score);
        scoreView.setText(runs + "/" + wickets);
    }

    /* Display the runs for England */
    public void displayRuns(int runs){
        TextView scoreView = findViewById(R.id.eng_runs);
        scoreView.setText(String.valueOf(runs));
    }

    /* Display the number of 4s for England */
    public void displayFours(int fours){
        TextView scoreView = findViewById(R.id.eng_fours);
        scoreView.setText(String.valueOf(fours));
    }

    /* Display the number of 6s for England */
    public void displaySixes(int sixes){
        TextView scoreView = findViewById(R.id.eng_sixes);
        scoreView.setText(String.valueOf(sixes));
    }

    /* Increase the value for Australia by 1 */
    public void addOnePointForAus(View view){
        ausScore = ausScore + 1;
        ausRuns = ausRuns + 1;
        displayAus (ausScore,ausWickets);
        displayAusRuns (ausRuns);
    }

    /* Increase the value for Australia by 4 */
    public void addFourPointsForAus(View view){
        ausScore = ausScore + 4;
        ausFours = ausFours + 1;
        displayAus(ausScore,ausWickets);
        displayAusFours (ausFours);
    }

    /* Increase the value for Australia by 6 */
    public void addSixPointsForAus(View view){
        ausScore = ausScore + 6;
        ausSixes = ausSixes + 1;
        displayAus(ausScore,ausWickets);
        displayAusSixes(ausSixes);
    }

    /* Count the number of wickets for Australia */
    public void addWicketsForAus(View view){
        ausWickets = ausWickets + 1;
        // Check for number of wickets is less than 10
        // if not will toast a message as game over.
        if (ausWickets < 10) {
            // will display till 9th wicket on the score board
            displayAus(ausScore,ausWickets);
        } else {
            // displayAus() method is called in else block
            // to display the 10th wicket on the score board.
            displayAus(ausScore,ausWickets);
            Toast.makeText(this, R.string.toast_game_over, Toast.LENGTH_SHORT).show();
        }
    }

    /* Display the score for Australia */
    public void displayAus (int runs, int ausWickets){
        TextView scoreView = findViewById(R.id.aus_score);
        scoreView.setText(runs + "/" + ausWickets);
    }

    /* Display the runs for Australia */
    public void displayAusRuns(int runs){
        TextView scoreView = findViewById(R.id.aus_runs);
        scoreView.setText(String.valueOf(runs));
    }

    /* Display the number of 4s for Australia */
    public void displayAusFours(int fours){
        TextView scoreView = findViewById(R.id.aus_fours);
        scoreView.setText(String.valueOf(fours));
    }

    /* Display the number of 6s for Australia */
    public void displayAusSixes(int sixes){
        TextView scoreView = findViewById(R.id.aus_sixes);
        scoreView.setText(String.valueOf(sixes));
    }

    /* Reset the score for both the teams to 0 */
    public void reset(View view){
        englScore = 0;
        ausScore = 0;
        wickets = 0;
        runs = 0;
        fours = 0;
        sixes = 0;
        ausWickets = 0;
        ausRuns = 0;
        ausFours = 0;
        ausSixes = 0;
        displayEngland(0,0);
        displayAus(0, 0);
        displayRuns(0);
        displayFours(0);
        displaySixes(0);
        displayAusRuns(0);
        displayAusFours(0);
        displayAusSixes(0);
    }
}
