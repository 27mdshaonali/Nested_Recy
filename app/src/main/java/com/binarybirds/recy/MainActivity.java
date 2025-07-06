package com.binarybirds.recy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<HashMap<String, String>> arrayList;
    RecyclerView horizontalRecyclerView1, horizontalRecyclerView2, horizontalRecyclerView3;
    RecyclerView verticalRecyclerView1, verticalRecyclerView2, verticalRecyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        horizontalRecyclerView1 = findViewById(R.id.horizontalRecyclerView1);
        horizontalRecyclerView2 = findViewById(R.id.horizontalRecyclerView2);
        horizontalRecyclerView3 = findViewById(R.id.horizontalRecyclerView3);
        verticalRecyclerView1 = findViewById(R.id.verticalRecyclerView1);
        verticalRecyclerView2 = findViewById(R.id.verticalRecyclerView2);
        verticalRecyclerView3 = findViewById(R.id.verticalRecyclerView3);

        prepareData();

        horizontalRecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        horizontalRecyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        horizontalRecyclerView3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        verticalRecyclerView1.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView2.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView3.setLayoutManager(new LinearLayoutManager(this));

        horizontalRecyclerView1.setAdapter(new AllAdapters(getFilteredList("one")));
        horizontalRecyclerView2.setAdapter(new AllAdapters(getFilteredList("three")));
        horizontalRecyclerView3.setAdapter(new AllAdapters(getFilteredList("five")));

        verticalRecyclerView1.setAdapter(new AllAdapters(getFilteredList("two")));
        verticalRecyclerView2.setAdapter(new AllAdapters(getFilteredList("four")));
        verticalRecyclerView3.setAdapter(new AllAdapters(getFilteredList("six"))); // optional
    }

    //======================================= prepare data starts =======================================
    private void prepareData() {
        arrayList = new ArrayList<>();

        HashMap<String, String> item;

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Monirul Vertical");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111112");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "one");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "three");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "four");
        item.put("name", "Monirul");
        item.put("contact", "01711111115");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "four");
        item.put("name", "Monirul");
        item.put("contact", "01711111115");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "six");
        item.put("name", "Monirul 6");
        item.put("contact", "01711111116");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "six");
        item.put("name", "Monirul 6");
        item.put("contact", "01711111116");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "six");
        item.put("name", "Monirul 6");
        item.put("contact", "01711111116");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "five");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "five");
        item.put("name", "Shaon");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);

        item = new HashMap<>();
        item.put("recyclerType", "two");
        item.put("name", "Shaon");
        item.put("contact", "01711111111");
        arrayList.add(item);
    }

    //======================================= prepare data ends =======================================


    //============================ filtering array list starts =======================================
    private ArrayList<HashMap<String, String>> getFilteredList(String type) {
        ArrayList<HashMap<String, String>> filteredList = new ArrayList<>();
        for (HashMap<String, String> item : arrayList) {
            if (item.get("recyclerType").contains(type)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    //============================ filtering array list ends =======================================


    //======================================= adapter starts =======================================
    private class AllAdapters extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        final int ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6;
        ArrayList<HashMap<String, String>> localList;

        public AllAdapters(ArrayList<HashMap<String, String>> localList) {
            this.localList = localList;
        }

        @Override
        public int getItemCount() {
            return localList.size();
        }

        @Override
        public int getItemViewType(int position) {
            String type = localList.get(position).get("recyclerType");
            if (type.contains("one")) return ONE;
            else if (type.contains("two")) return TWO;
            else if (type.contains("three")) return THREE;
            else if (type.contains("four")) return FOUR;
            else if (type.contains("five")) return FIVE;
            else return SIX;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            //LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            LayoutInflater inflater = getLayoutInflater();
            if (viewType == TWO || viewType == FOUR || viewType == SIX) {
                View myView = inflater.inflate(R.layout.vertical_recyclerview_layout, parent, false);
                return new VerticalViewHolder(myView);
            } else {
                View myView = inflater.inflate(R.layout.horizontal_recyclerview_layout, parent, false);
                return new HorizontalViewHolder(myView);
            }
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            HashMap<String, String> item = localList.get(position);

            if (holder instanceof HorizontalViewHolder) {
                ((HorizontalViewHolder) holder).name.setText(item.get("name"));
            } else if (holder instanceof VerticalViewHolder) {
                ((VerticalViewHolder) holder).name.setText(item.get("name"));
                ((VerticalViewHolder) holder).contact.setText(item.get("contact"));
            }
        }

        private class HorizontalViewHolder extends RecyclerView.ViewHolder {
            TextView name;

            public HorizontalViewHolder(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.name);
            }
        }

        private class VerticalViewHolder extends RecyclerView.ViewHolder {
            TextView name, contact;

            public VerticalViewHolder(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.name);
                contact = itemView.findViewById(R.id.contact);
            }
        }
    }
}
