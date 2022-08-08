package br.com.up.projeto_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button buttonSelector;
    private TextView textViewTitle;
    private ArrayList<String> listPhases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listPhases.add("Comprar um café para o profesor");
        listPhases.add("Chamar o professor para o churras");
        listPhases.add("Chamar o professor para comer piza");



        buttonSelector = findViewById(R.id.button_selector);
        textViewTitle = findViewById(R.id.text_title);



        View.OnClickListener clickListener =
                new  View.OnClickListener() {
            @Override

                    public void onClick (View v){



                int position = new Random().nextInt(listPhases.size());
                String Text = listPhases.get(position);
                textViewTitle.setText(Text);







            }
                };
        buttonSelector.setOnClickListener(clickListener);
    }
}