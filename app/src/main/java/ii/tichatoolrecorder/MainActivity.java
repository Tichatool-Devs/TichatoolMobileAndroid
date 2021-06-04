package ii.tichatoolrecorder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

//import ii.tichatoolrecorder.Adaptor.InputAdaptor;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.List;

import ii.tichatoolrecorder.data.model.InputModel;
import ii.tichatoolrecorder.data.model.Student;

public class MainActivity extends AppCompatActivity {
    //public static final String STUDENT_SURNAME = "studentSurname";
    //public static final String STUDENT_FIRSTNAME= "studentFirstname";
    //public static final String STUDENT_LASTNAME = "studentLastname";
    //public static final String STUDENT_ID = "studentid";

    // private RecyclerView tasksRecyclerView;
    // private InputAdaptor tasksAdaptor;
 TextView teacherNameTxt, subjectTxt, voiceTxt, classesTxt, surname_textView, firstname_textView, lastname_textView, nameOfSchool, TextView, update_TextView,subject_textView,changeSchool_TextView, helpBtn, aboutbtn;
    ImageView closebtn, searchBtn,UserBtn, cancel, menuuBtn,subjectImageBtn,voiceImageBtn, Addstudent, saveBtn, uploadButton, setSchoolLogo, imageView3;
    ConstraintLayout constraintLayout2,subjectBtn, voiceBtn, classesBtn, downLayout, classesImageBtn , mainID;
    RelativeLayout addpuLY;
    EditText  Surname, Firstname,   Lastname,FirstScore, SecondScore, ThirdScore, FourthScore, Exam;
    Button cancleNtaskBtn, Save;
    TextView Total, CA;
    LinearLayout classLy, addClassBtn, linearLayout, subjectLY, addSubjectbtn, addSubImgbtn, linearlayout, menuLaY;
    ScrollView classesScrlView, SubjectScrlView;
    RecyclerView tasksRecyclerView;
    DatabaseReference databaseStudents;
    HelperAdapter helperadapter;
    List<FetchData> fetchData;
    TextView SURNAME;
    TextView FIRSTNAME;
    TextView MIDDLENAME;

    //ScoresHelperAdapter scoresHelperAdapter;
    //List<Scores> ScoresHelperAdapter;
   // DatabaseReference databaseScores;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addstudent = findViewById (R.id.addstudentBtn);
        addpuLY = findViewById (R.id.addpupilLY);
        Surname = findViewById (R.id.surname_editText);
        Firstname = findViewById (R.id.firstname_editText);
        Lastname = findViewById (R.id.lastname_editText);

        Total = findViewById(R.id.totalscore_textview);
        CA = findViewById(R.id.cascore_textview);
        SURNAME = findViewById(R.id.Surname);
        FIRSTNAME = findViewById(R.id.FirstName);
        MIDDLENAME = findViewById(R.id.middleName);


        //button
        Save = findViewById (R.id.saveNtaskbtn);

        closebtn = (ImageView) findViewById (R.id.closely);
        menuuBtn = (ImageView) findViewById (R.id.menuBtn);
        uploadButton = (ImageView) findViewById (R.id.uploadBtn);

        //Layouts
        classLy = (LinearLayout) findViewById (R.id.classLY);
        subjectLY = (LinearLayout) findViewById (R.id.subjectLY);
        menuLaY= (LinearLayout) findViewById (R.id.menuLY);
        mainID = (ConstraintLayout) findViewById (R.id.mainID);
        classesImageBtn =(ConstraintLayout) findViewById (R.id.classesBtn);
        subjectBtn =(ConstraintLayout) findViewById (R.id.subjectBtn);

        //EDITTEXT
        FirstScore = findViewById(R.id.firstscore2);
        SecondScore = findViewById(R.id.secondscore2);
        ThirdScore = findViewById(R.id.thirdscore2);
        FourthScore = findViewById(R.id.fourthscore2);
        Exam = findViewById(R.id.examscore2);

        //DATABASE
        databaseStudents = FirebaseDatabase.getInstance().getReference("students");
        //databaseScores = FirebaseDatabase.getInstance().getReference("scores");

      tasksRecyclerView= findViewById(R.id.tasksRecyclerView);
         tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
         fetchData = new ArrayList<>();
        // ScoresHelperAdapter = new ArrayList<>();


       // Intent intent = getIntent();
        //String id = intent.getStringExtra (MainActivity.STUDENT_ID);
        //String surname = intent.getStringExtra (MainActivity.STUDENT_SURNAME);
        //String FirstName = intent.getStringExtra (MainActivity.STUDENT_FIRSTNAME);
        //String lastname = intent.getStringExtra (MainActivity.STUDENT_LASTNAME);

//        SURNAME.setText(surname);
  //      FIRSTNAME.setText(FirstName);
    //    MIDDLENAME.setText(lastname);



       databaseStudents.addListenerForSingleValueEvent(new ValueEventListener() {
             @Override
             public void onDataChange(@NonNull DataSnapshot snapshot) {
                 fetchData.clear();


                 for (DataSnapshot studentSnapshot: snapshot.getChildren()){
                     FetchData data = studentSnapshot.getValue (FetchData.class);
                     fetchData.add(data);




                 }

                 helperadapter = new HelperAdapter (fetchData);
                 tasksRecyclerView.setAdapter(helperadapter);

             }

             @Override
             public void onCancelled(@NonNull DatabaseError error) {

             }
         });

      /* databaseScores.addListenerForSingleValueEvent(new ValueEventListener() {
             @Override
             public void onDataChange(@NonNull DataSnapshot snapshot) {
                 ScoresHelperAdapter.clear();

                 for (DataSnapshot scoresSnapshot : snapshot.getChildren()) {
                     Scores data1 = scoresSnapshot.getValue(Scores.class);
                     ScoresHelperAdapter.add(data1);
                 }
                 ScoresHelperAdapter scoresAdapter= new ScoresHelperAdapter (MainActivity.this, ScoresHelperAdapter);
                // tasksRecyclerView.setAdapter(scoresAdapter);

             }

             @Override
             public void onCancelled(@NonNull DatabaseError error) {

             }
         });  */

        //setting adaptor recyclerview
        //tasksAdaptor = new InputAdaptor(this);
        //  tasksRecyclerView.setAdapter(tasksAdaptor);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*  inputTaskFragment inpT = new inputTaskFragment();
               getSupportFragmentManager().beginTransaction().replace(R.id.mainID, inpT).commit();*/


                addStudent();




            }
        });


        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Upload upT = new Upload();
                getSupportFragmentManager().beginTransaction().replace(R.id.FragToloadInput, upT).commit();
            }
        });

        Addstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (classLy.getVisibility()==View.VISIBLE || subjectLY.getVisibility()==View.VISIBLE){
                    classLy.setVisibility(View.GONE);
                    subjectLY.setVisibility(View.GONE);
                }else  addpuLY.setVisibility(View.VISIBLE);
                    closebtn.setVisibility(View.VISIBLE);





            }
        });

        classesImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (subjectLY.getVisibility()==View.VISIBLE || addpuLY.getVisibility()==View.VISIBLE){
                    subjectLY.setVisibility(View.GONE);
                    addpuLY.setVisibility(View.GONE);
                    menuLaY.setVisibility(View.GONE);
                }else  classLy.setVisibility(View.VISIBLE);
                    closebtn.setVisibility(View.VISIBLE);
            }
        });

        subjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (classLy.getVisibility()==View.VISIBLE || addpuLY.getVisibility()==View.VISIBLE){
                    classLy.setVisibility(View.GONE);
                    addpuLY.setVisibility(View.GONE);
                    menuLaY.setVisibility(View.GONE);
                }else  subjectLY.setVisibility(View.VISIBLE);
                        closebtn.setVisibility(View.VISIBLE);


            }
        });

        menuuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (classLy.getVisibility()==View.VISIBLE || addpuLY.getVisibility()==View.VISIBLE){
                    classLy.setVisibility(View.GONE);
                    addpuLY.setVisibility(View.GONE);
                    subjectLY.setVisibility(View.GONE);
                }else  menuLaY.setVisibility(View.VISIBLE);
                closebtn.setVisibility(View.VISIBLE);


            }
        });

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    classLy.setVisibility(View.GONE);
                    addpuLY.setVisibility(View.GONE);
                    subjectLY.setVisibility(View.GONE);
                    closebtn.setVisibility(View.GONE);
                    menuLaY.setVisibility(View.GONE);

                Surname.getText().clear();
                Firstname.getText().clear();
                Lastname.getText().clear();




            }
        });




    }

    private void addStudent(){

        String surname= Surname.getText().toString().trim();
        String firstname = Firstname.getText().toString().trim();
        String lastname = Lastname.getText().toString().trim();
        String firstScore = FirstScore.getText().toString();
  // int firstscore1 =Integer.parseInt(firstScore);
        String Secondscore =SecondScore.getText().toString();
       //int secondscore1 =Integer.parseInt(Secondscore);
        String Thirdscore = ThirdScore.getText().toString();
      // int thirdscore1 =Integer.parseInt(Thirdscore);
        String Fourthscore = FourthScore.getText().toString();
      // int fourthscore1 =Integer.parseInt(Fourthscore);
        String Examm = Exam.getText().toString();
      //  int examscore =Integer.parseInt(Examm);


        if(TextUtils.isEmpty(surname)){
            Surname.setError("Surname is required");
        }
        if(TextUtils.isEmpty(firstname)){
           Firstname.setError("Firstname is required");

        }
        if(TextUtils.isEmpty(lastname)){
            Lastname.setError("Lastname is required");

        }

        if(TextUtils.isEmpty(firstScore)){
            FirstScore.setError("Input Score");

        }
        if(TextUtils.isEmpty(Secondscore)){
            SecondScore.setError("Input Score");

        }
        if(TextUtils.isEmpty(Thirdscore)){
            ThirdScore.setError("Input Score");

        }
        if(TextUtils.isEmpty(Fourthscore)){
            FourthScore.setError(" Input Score");

        }
        if(TextUtils.isEmpty(Examm)){
            Exam.setError(" Input Score");

        }
        else {
            String id = databaseStudents.push().getKey();
            Student student = new Student (id,surname,firstname,lastname,firstScore,Secondscore,Thirdscore,Fourthscore,Examm);

            databaseStudents.child(id).setValue(student);
            Toast.makeText(this, "Student details Added", Toast.LENGTH_SHORT).show();



            //startActivity(new Intent (getApplicationContext(), MainActivity.class));
            addpuLY.setVisibility(View.GONE);

            Intent intent = new Intent (getApplicationContext(), MainActivity.class);
            //intent.putExtra(STUDENT_ID, student.getStudentid());
            //intent.putExtra(STUDENT_FIRSTNAME, student.getStudentFirstname());
            //intent.putExtra(STUDENT_SURNAME, student.getStudentSurname());
            //intent.putExtra(STUDENT_LASTNAME, student.getStudentLastname());



            startActivity(intent);



            Surname.getText().clear();
            Firstname.getText().clear();
            Lastname.getText().clear();
            FourthScore.getText().clear();
            FirstScore.getText().clear();
            SecondScore.getText().clear();
            ThirdScore.getText().clear();
            Exam.getText().clear();


        }


    }


}
