package tw.com.pcschool.t092301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"蘋果", "葡萄", "香蕉", "鳳梨"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter();
        lv.setAdapter(adapter);


    }
    class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return fruits.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = getLayoutInflater();
            View v = inflater.inflate(R.layout.myitem, null);

            TextView tv = (TextView) v.findViewById(R.id.textView);
            tv.setText("Hello Hello:" + fruits[position]);
            return v;
        }
    }
}
