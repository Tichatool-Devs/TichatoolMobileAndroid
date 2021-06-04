package ii.tichatoolrecorder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ii.tichatoolrecorder.data.model.Student;

import static androidx.core.content.ContextCompat.startActivity;


public class HelperAdapter extends RecyclerView.Adapter {
    List<FetchData> fetchDataList;
   Context context;

    public HelperAdapter(Context context) {
        this.context = context;
    }

    public HelperAdapter(List<FetchData> fetchDataList) {
        this.fetchDataList = fetchDataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout, parent, false);
        ViewHolderClass viewHolderClass = new  ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass =(ViewHolderClass)holder;
        FetchData fetchData = fetchDataList.get(position);
        viewHolderClass.FirstName.setText(fetchData.getStudentFirstname());
        viewHolderClass.FirstScore.setText(fetchData.getFirstScore());
        viewHolderClass.SecondScore.setText(fetchData.getSecondScore());
        viewHolderClass.ThirdScore.setText(fetchData.getThirdScore());
      viewHolderClass.FourthScore.setText(fetchData.getFourthScore());
        viewHolderClass.Exam.setText(fetchData.getExam());
        viewHolderClass.FIRSTNAME.setText(fetchData.getStudentFirstname());
        viewHolderClass.SURNAME.setText(fetchData.getStudentSurname());
        viewHolderClass.MIDDLENAME.setText(fetchData.getStudentLastname());

       /*     String FIRSTSCORE = fetchData.getFirstScore();
            String SECONDSCORE = fetchData.getSecondScore();
            String THIRDSCORE = fetchData.getThirdScore();
            String FOURTHSCORE = fetchData.getFourthScore();
            String EXAM = fetchData.getExam();

            String Total = FIRSTSCORE + SECONDSCORE+ THIRDSCORE+FOURTHSCORE+EXAM;


        holder.deleteButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( context, "Removed", Toast.LENGTH_SHORT ).show();

*/
                viewHolderClass.SCORESDISPLAY.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,InputLayout.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });



    }

    @Override
    public int getItemCount() {

        return fetchDataList.size();
    }
    public class ViewHolderClass extends RecyclerView.ViewHolder{
        TextView FirstName;
        TextView FirstScore;
        TextView SecondScore;
        TextView ThirdScore;
        TextView FourthScore;
        TextView Exam;
        TextView CA;
        TextView Total;
        TextView FIRSTNAME, SURNAME, MIDDLENAME;
        ConstraintLayout FULLNAMEDISPLAY,SCORESDISPLAY;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            FirstName = itemView.findViewById(R.id.taskLfirstname);
            FirstScore = itemView.findViewById(R.id.firstscore_textview);
            SecondScore = itemView.findViewById(R.id.secondscore_textview);
            ThirdScore = itemView.findViewById(R.id.thirdscore_textview);
            FourthScore= itemView.findViewById(R.id.fourthscore_textview);
            Exam = itemView.findViewById(R.id.examscore_textview);
            CA = itemView.findViewById(R.id.cascore_textview);
            Total = itemView.findViewById(R.id.totalscore_textview);
            FULLNAMEDISPLAY = itemView.findViewById(R.id.fullNameDisplay);
            SCORESDISPLAY = itemView.findViewById(R.id.scoresDisplayLY);
            FIRSTNAME = itemView.findViewById(R.id.FirstName);
            SURNAME = itemView.findViewById(R.id.Surname);
            MIDDLENAME = itemView.findViewById(R.id.middleName);




            itemView.findViewById(R.id.fullnameLY).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    FULLNAMEDISPLAY.setVisibility(View.VISIBLE);
                }
            });

            itemView.findViewById(R.id.backFullnamebtn).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    FULLNAMEDISPLAY.setVisibility(View.GONE);
                }
            });

      /*  itemView.findViewById(R.id.scoresDisplayLY).setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context,InputLayout.class);
                    context.startActivity(intent);


                }
            });
*/

        }
    }
}
