package ii.tichatoolrecorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



/*public class ScoresHelperAdapter extends RecyclerView.Adapter {

    List<Scores> fetchdatalist1;

    public ScoresHelperAdapter(MainActivity activity, List<Scores> scores) {
        this.fetchdatalist1 = scores;
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

        Scores fetchData1 = fetchdatalist1.get(position);
        viewHolderClass.FirstScore.setText(String.valueOf(fetchData1.getFirstScore()));







    }

    @Override
    public int getItemCount() {
        return fetchdatalist1.size();
    }
    public class ViewHolderClass extends RecyclerView.ViewHolder{
        TextView  SecondScore, FirstScore, ThirdScore, FourthScore, ExamScore, caScore, TotalScore;


        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);

            SecondScore = itemView.findViewById(R.id.secondscore_textview);
            FirstScore = itemView.findViewById(R.id.firstscore_textview);
            ThirdScore = itemView.findViewById(R.id.thirdscore_textview);
            FourthScore = itemView.findViewById(R.id.fourthscore_textview);
            ExamScore= itemView.findViewById(R.id.examscore_textview);
            caScore = itemView.findViewById(R.id.cascore_textview);
            TotalScore= itemView.findViewById(R.id.totalscore_textview);
        }
    }
} */
