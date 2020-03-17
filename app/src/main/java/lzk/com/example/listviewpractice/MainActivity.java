package lzk.com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listview;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.stulistview);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("20161707");
        arrayList.add("20161713");
        arrayList.add("20171591");
        arrayList.add("20171592");
        arrayList.add("20171616");
        arrayList.add("20171627");
        arrayList.add("20171641");
        arrayList.add("20171649");
        arrayList.add("20171650");
        arrayList.add("20171653");
        arrayList.add("20171654");
        arrayList.add("20171655");
        arrayList.add("20171656");
        arrayList.add("20171659");
        arrayList.add("20171664");
        arrayList.add("20171666");
        arrayList.add("20171667");
        arrayList.add("20171668");
        arrayList.add("20171669");arrayList.add("20171670");arrayList.add("20171679");arrayList.add("20171688");
        arrayList.add("20171697");
        arrayList.add("20171705");
        arrayList.add("20171707");
        arrayList.add("20171714");
        arrayList.add("20171717");
        arrayList.add("20171731");
        arrayList.add("20171742");
        arrayList.add("20175064");
        arrayList.add("20175980");
        arrayList.add("20175990");

        ArrayAdapter arradpt = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listview.setAdapter(arradpt);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });


    }












}
