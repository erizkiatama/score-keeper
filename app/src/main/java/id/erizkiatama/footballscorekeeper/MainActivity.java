package id.erizkiatama.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks points for team A
    int mPointTeamA;

    // Tracks points for team B
    int mPointTeamB;

    // Tracks fouls for team A
    int mFoulTeamA;

    // Tracks fouls for team B
    int mFoulTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  Increase the point for Team A by 1
     */
    public void addOnePointForTeamA(View v) {
        mPointTeamA += 1;
        displayPointTeamA(mPointTeamA);
    }

    /**
     *  Display the given point for Team A
     */
    private void displayPointTeamA(int point) {
        TextView pointView = findViewById(R.id.team_a_point);
        pointView.setText(String.valueOf(point));
    }

    /**
     *  Increase the foul for Team A by 1
     */
    public void addOneFoulForTeamA(View v) {
        mFoulTeamA += 1;
        displayFoulTeamA(mFoulTeamA);
    }

    /**
     *  Display the given foul for Team A
     */
    private void displayFoulTeamA(int foul) {
        TextView foulView = findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     *  Increase the point for Team B by 1
     */
    public void addOnePointForTeamB(View v) {
        mPointTeamB += 1;
        displayPointTeamB(mPointTeamB);
    }

    /**
     *  Display the given point for Team B
     */
    private void displayPointTeamB(int point) {
        TextView pointView = findViewById(R.id.team_b_point);
        pointView.setText(String.valueOf(point));
    }

    /**
     *  Increase the foul for Team B by 1
     */
    public void addOneFoulForTeamB(View v) {
        mFoulTeamB += 1;
        displayFoulTeamB(mFoulTeamB);
    }

    /**
     *  Display the given foul for Team B
     */
    private void displayFoulTeamB(int foul) {
        TextView foulView = findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     *  Resets the points and fouls for both Teams back to 0
     */
    public void resetAll(View v) {
        mPointTeamA = 0;
        mPointTeamB = 0;
        mFoulTeamA = 0;
        mFoulTeamB = 0;
        displayPointTeamA(mPointTeamA);
        displayPointTeamB(mPointTeamB);
        displayFoulTeamA(mFoulTeamA);
        displayFoulTeamB(mFoulTeamB);
    }

}
