package com.prookie.pinedlistviewdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<OpenHistory> list1 = new ArrayList<>();
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));
        list1.add(new OpenHistory("2018-01-01", "12:12:12", "", ""));

        List<OpenHistory> list2 = new ArrayList<>();
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));
        list2.add(new OpenHistory("2018-01-02", "12:12:12", "", ""));

        List<OpenHistory> list3 = new ArrayList<>();
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));
        list3.add(new OpenHistory("2018-01-03", "12:12:12", "", ""));

        List<OpenHistory> list4 = new ArrayList<>();
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));
        list4.add(new OpenHistory("2018-01-04", "12:12:12", "", ""));


        List<String> groups = new ArrayList<>();
        groups.add("2018-01-01");
        groups.add("2018-01-02");
        groups.add("2018-01-03");
        groups.add("2018-01-04");

        Map<String, List<OpenHistory>> map = new HashMap<>();
        map.put("2018-01-01", list1);
        map.put("2018-01-02", list2);
        map.put("2018-01-03", list3);
        map.put("2018-01-04", list4);


        PinnedHeaderListView listView = (PinnedHeaderListView) findViewById(R.id.pinnedListView);
        LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout header1 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) header1.findViewById(R.id.textItem)).setText("HEADER 1");
        LinearLayout header2 = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) header2.findViewById(R.id.textItem)).setText("HEADER 2");
        LinearLayout footer = (LinearLayout) inflator.inflate(R.layout.list_item, null);
        ((TextView) footer.findViewById(R.id.textItem)).setText("FOOTER");
//        listView.addHeaderView(header1);
//        listView.addHeaderView(header2);
//        listView.addFooterView(footer);
        TestSectionedAdapter sectionedAdapter = new TestSectionedAdapter(this, groups, map);
        listView.setAdapter(sectionedAdapter);

    }
}
