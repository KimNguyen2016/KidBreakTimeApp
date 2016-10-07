package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kim on 9/29/2016.
 */
public class AnimalGallery  extends AppCompatActivity {

    private List<Animals> myAnimal = new ArrayList<Animals>();
    Button goBtn;
    String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animalgallery);

        populateAnimalList();
        populateListView();
        displayMessage();
    }

    private void populateAnimalList(){
        myAnimal.add(new Animals(R.drawable.dog_2, "Lucy","Cutiest Animal"));
        myAnimal.add(new Animals(R.drawable.cat_2, "Kily","Prety Pet"));
        myAnimal.add(new Animals(R.drawable.horse_2, "Johny"," Fastest Runner"));
        myAnimal.add(new Animals(R.drawable.tiger_2, "Munno","Wild strong Animal "));
        myAnimal.add(new Animals(R.drawable.pig_2, "Lulu"," Lazy Pet"));
        myAnimal.add(new Animals(R.drawable.mouse_2, "Honey","Tiny Pet"));
    }

    private void populateListView() {
        ArrayAdapter<Animals> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.listViewAnimal);
        list.setAdapter(adapter);
    }


    private void displayMessage() {
        Toast.makeText(AnimalGallery.this, "Testing", Toast.LENGTH_SHORT).show();

        ListView list = (ListView) findViewById(R.id.listViewAnimal);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                Animals clickedAnimal = myAnimal.get(position);
                message = "You clicked on image " + (position+1) + " which is kind of animal called:  " + clickedAnimal.getName();
                Toast.makeText(AnimalGallery.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class MyListAdapter extends ArrayAdapter<Animals> {
         public MyListAdapter() {
             super(AnimalGallery.this, R.layout.imagedetails, myAnimal);
         }

        @Override
         public View getView(int position, View convertView, ViewGroup parent) {
             //make sure we have a view to work with.
             View itemView = convertView;

             if (itemView == null) {
                 itemView = getLayoutInflater().inflate(R.layout.imagedetails, parent, false);
             }
             // Find the animal to work with
             Animals currentAnimal = myAnimal.get(position);

             //Fill the Animals
             ImageView iId = (ImageView) itemView.findViewById(R.id.imageViewDetail);
             iId.setImageResource(currentAnimal.getAnimalId());

             //Name
             TextView iName = (TextView) itemView.findViewById(R.id.txtName);
             iName.setText(currentAnimal.getName());

             //Description
             TextView iDesc = (TextView) itemView.findViewById(R.id.txtDesc);
             iDesc.setText(currentAnimal.getDescription());

             return itemView;
         }
     }
}



