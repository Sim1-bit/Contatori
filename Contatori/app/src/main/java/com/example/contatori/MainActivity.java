package com.example.contatori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private ArrayList<String> interactions = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickPlusJob(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ);
        int aux = Integer.parseInt(tw.getText().toString());
        aux ++;
        tw.setText(String.valueOf(aux));

        ListView lw = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listPersone);
        lw.setAdapter(adapter);
    }
    public void onClickMinusJob(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ);
        int aux = Integer.parseInt(tw.getText().toString());
        if(aux > 0)
        {
            aux--;
        }
        tw.setText(String.valueOf(aux));
    }

    public void onClickPlusSport(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ2);
        int aux = Integer.parseInt(tw.getText().toString());
        aux ++;
        tw.setText(String.valueOf(aux));
    }
    public void onClickMinusSport(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ2);
        int aux = Integer.parseInt(tw.getText().toString());
        if(aux > 0)
        {
            aux--;
        }
        tw.setText(String.valueOf(aux));
    }


    public void onClickPlusWater(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ3);
        int aux = Integer.parseInt(tw.getText().toString());
        aux ++;
        tw.setText(String.valueOf(aux));
    }
    public void onClickMinusWater(View v)
    {
        TextView tw = (TextView) findViewById(R.id.textViewOBJ3);
        int aux = Integer.parseInt(tw.getText().toString());
        if(aux > 0)
        {
            aux--;
        }
        tw.setText(String.valueOf(aux));
    }

    private Interaction(String activity, char sign)
    {
        ListView aux = (ListView) findViewById(R.id.)
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        interactions.add(activity . sign . "\n" . now.format(formatter));
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listPersone);
        lvElenco.setAdapter(adapter);
    }
}