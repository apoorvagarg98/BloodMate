package Apoorva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class register_page3 extends AppCompatActivity //implements AdapterView.OnItemSelectedListener
 {


     EditText allergy,ifallergy,ifdisease,op,ifop,drop_pick,remark;
     Button next3;
     ArrayList<String>list;
     stored_credentials pref;
     Spinner diseasespinner,opspinner,allergyspinner;
     String diseasetext="Yes",allergytext="Yes",optext="Yes";
     String []diseasearray={"Yes","No"};
     String []oparray={"Yes","No"};
     String []allergyarray={"Yes","No"};
     ArrayList<diseasemodel>diseaselist;

     ArrayList<allergymodel>allegylist;
     ArrayList<opmodel>oplist;
     diseaseadapter dadapter;
     opadapter oadpter;
     allergyadapter algyadapter;
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_register_page3);
         pref=stored_credentials.getInstance(this);
         list = (ArrayList<String>) getIntent().getSerializableExtra("key3");

         allergyspinner=findViewById(R.id.allergyspinners);

         opspinner=findViewById(R.id.operationspinners);
         diseasespinner=findViewById(R.id.diseasesspinners);

         next3=findViewById(R.id.next3);
         diseaselist=new ArrayList<>();
         diseaselist.add(new diseasemodel("Yes"));
         diseaselist.add(new diseasemodel("No"));
         oplist=new ArrayList<>();
         oplist.add(new opmodel("Yes"));
         oplist.add(new opmodel("No"));
         allegylist=new ArrayList<>();
         allegylist.add(new allergymodel("Yes"));
         allegylist.add(new allergymodel("No"));
         dadapter=new diseaseadapter(this,diseaselist);
         oadpter=new opadapter(this,oplist);
         algyadapter=new allergyadapter(this,allegylist);
         diseasespinner.setAdapter(dadapter);
         opspinner.setAdapter(oadpter);
         allergyspinner.setAdapter(algyadapter);
         diseasespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 diseasemodel clickedItem = (diseasemodel) parent.getItemAtPosition(position);
                 String clickedCountryName = clickedItem.getDisease();
                 diseasetext=clickedCountryName;
                 //  Toast.makeText(register_page1.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
         opspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 opmodel clickedItem = (opmodel) parent.getItemAtPosition(position);
                 String clickedCountryName = clickedItem.getOperation();
                 optext=clickedCountryName;
                 //  Toast.makeText(register_page1.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
         allergyspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 allergymodel clickedItem = (allergymodel) parent.getItemAtPosition(position);
                 String clickedCountryName = clickedItem.getAllergy();
                 allergytext=clickedCountryName;
                 //  Toast.makeText(register_page1.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });

         next3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 list.add(allergytext);
                 list.add(diseasetext);
                 list.add(optext);

                 Intent intent = new Intent(register_page3.this, registration4.class);
                 intent.putExtra("key4", list);
                 startActivity(intent);
             }

         });
     }

     private String getextension() {
         MimeTypeMap mimeTypeMap=MimeTypeMap.getSingleton();
         return mimeTypeMap.getExtensionFromMimeType(getContentResolver().getType(Uri.parse(list.get(6))));
     }
 }