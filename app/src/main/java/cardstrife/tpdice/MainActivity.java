package cardstrife.tpdice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button6 = (Button) findViewById(R.id.button1);
        Button button20 = (Button) findViewById(R.id.button2);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button6","Dice 6 roll...");
                Intent intent6 = new Intent(MainActivity.this,DiceActivity.class);
                intent6.putExtra("max",6);
                startActivity(intent6);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button20","Dice 20 roll...");
                Intent intent20 = new Intent(MainActivity.this,DiceActivity.class);
                intent20.putExtra("max",20);
                startActivity(intent20);
            }
        });

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
        switch(id)
        {
            case R.id.menu_search:
                return true;
            case R.id.menu_about:
                return true;
            case R.id.menu_help:
                return true;
            case R.id.menu_refresh:
                return true;
            case R.id.menu_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }



    }
}
