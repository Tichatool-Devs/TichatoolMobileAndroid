package ii.tichatoolrecorder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//class Users {


    //public String username;
    //public String email;

   // public Users() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
   // }

  //  public Users(String username, String email) {
    //    this.username = username;
      //  this.email = email;
  //  }

//}
public class Users extends AppCompatActivity {
    TextView Lfirstname;
    ConstraintLayout FullNameDisplay;
    Button backFullname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        Lfirstname= findViewById (R.id.taskLfirstname);
        FullNameDisplay = findViewById (R.id. fullNameDisplay);
        backFullname = findViewById (R.id.    backFullnamebtn );


        Lfirstname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullNameDisplay.setVisibility(View.VISIBLE);
            }
        });

        backFullname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullNameDisplay.setVisibility(View.GONE);
            }
        });


    }
}