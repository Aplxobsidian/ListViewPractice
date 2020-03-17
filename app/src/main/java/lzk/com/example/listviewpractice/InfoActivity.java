package lzk.com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView txtinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openinfo);

        txtinfo = findViewById(R.id.loremtext);
        String cquid = getIntent().getStringExtra("cquid");
        txtinfo.setText(cquid+"\n"+"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus rhoncus lectus magna, dapibus eleifend risus congue ac. Integer massa");
    }
}
