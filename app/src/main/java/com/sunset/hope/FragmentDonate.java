package com.sunset.hope;

import android.content.ClipData;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class FragmentDonate extends Fragment {
    View myView;
    RecyclerView recyclerView;
    AdapterRCVPost adapterRCV;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView =  inflater.inflate(R.layout.fragment_donate, container, false);
        recyclerView = myView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        adapterRCV= new AdapterRCVPost(null);
        recyclerView.setAdapter(adapterRCV);

        adapterRCV.setItemClickListener((view, position) -> {


            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Option")
                    .setItems(R.array.listOption, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setIcon(R.drawable.ic_call);
            builder.create();
            builder.show();
        });
        return myView;
    }
}
