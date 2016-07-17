package cardstrife.tpdice;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

/**
 * Created by Thierry on 15/07/2016.
 */
public class DiceActivity extends Activity implements View.OnClickListener{

    private TextView textResult;
    private int max;
    private String textDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        max = getIntent().getIntExtra("max",0);
        textDice = getString(R.string.roll);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText(textDice+" "+max);

        textResult = (TextView) findViewById(R.id.textResult);
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.buttonRoll);

        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max)+1;
        textResult.setText(String.valueOf(result));
    }
}
