package ii.tichatoolrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class registration extends AppCompatActivity {

    LinearLayout regOne,regpassly;
    Button regback, regnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regOne = findViewById(R.id.regform_one);
        regpassly = findViewById(R.id.regPassLY);
        regnext = findViewById(R.id.login_btn);

        regnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regOne.setVisibility(View.GONE);
                regpassly.setVisibility(View.VISIBLE);
                regback.setVisibility(View.VISIBLE);

            }
        });

        regback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regpassly.setVisibility(View.GONE);
                regOne.setVisibility(View.VISIBLE);
                regback.setVisibility(View.GONE);

            }
        });
    }
}