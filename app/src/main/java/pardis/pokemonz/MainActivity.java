package pardis.pokemonz;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "pardis.Pokemonz.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tryCapture(View view){
        Intent intent = new Intent(this, intent.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void tryRun(View view){
        Intent intent2 = new Intent(this, intent2.class);
        EditText editText2 = (EditText) findViewById(R.id.edit_message);
        String message2 = editText2.getText().toString();
        intent2.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent2);
    }

    public void trySwitch(View view){
        Intent intent3 = new Intent(this, intent4.class);
        EditText editText3 = (EditText) findViewById(R.id.edit_message);
        String message3 = editText3.getText().toString();
        intent3.putExtra(EXTRA_MESSAGE, message3);
        startActivity(intent3);
    }
}
