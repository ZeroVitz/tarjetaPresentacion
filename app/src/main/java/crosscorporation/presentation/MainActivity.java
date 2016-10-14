package crosscorporation.presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button)
        {
            Intent intent = new Intent(this, CompanyActivity.class);
            startActivity(intent);
        }
    }
}
