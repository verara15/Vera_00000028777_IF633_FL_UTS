package umn.ac.id.uts_28777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.List;

public class Profile extends AppCompatActivity {

    private String parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent parentInt = getIntent();
        parent = parentInt.getStringExtra("Parent");
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (parent.equals("MainActivity")) {
            Intent myIntent = new Intent(Profile.this, MainActivity.class);
            startActivity(myIntent);
        } else if (parent.equals("List")) {
            Intent myIntent = new Intent(Profile.this, List2.class);
            myIntent.putExtra("Result", "profil");
            startActivity(myIntent);
        }
        return true;
    }
}