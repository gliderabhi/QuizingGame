package com.munna.com.quizinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SelectionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_menu);
        String values[]={"Chemistry","Astronomy","Biology"};
        final ListAdapter newAdaptor=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        ListView list=(ListView)findViewById(R.id.listView);
        list.setAdapter(newAdaptor);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position) {
                            case 0:
                                Intent i0 = new Intent(SelectionMenu.this, ChemQuiz.class);
                                startActivity(i0);
                                break;
                            case 1:
                                Intent i1 = new Intent(SelectionMenu.this, AstroQuiz.class);
                                startActivity(i1);
                                break;
                            case 2:
                                Intent i2 = new Intent(SelectionMenu.this, BiologyQuiz.class);
                                startActivity(i2);
                                break;

                            case 3:Intent i3 = new Intent(SelectionMenu.this, PhysicsQuiz.class);
                                startActivity(i3);
                                break;


                        }

                    }
                }
        );
    }
}
