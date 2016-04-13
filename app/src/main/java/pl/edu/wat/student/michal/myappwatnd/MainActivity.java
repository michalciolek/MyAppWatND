package pl.edu.wat.student.michal.myappwatnd;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pl.edu.wat.student.michal.myappnd.R;

/**
 * Created by Michał on 2016-04-09.
 */
public class MainActivity extends AppCompatActivity {

    private String name;
    public static final String NAME = "Michal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickButton (View view){

        EditText nameEditText = (EditText) findViewById(R.id.editText);
        name = nameEditText.getText().toString();

        Context context = getApplicationContext();
        Toast.makeText(context, "Witaj " + name + " !", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
        intent.putExtra(NAME, name);
        startActivity(intent);

    }
}
