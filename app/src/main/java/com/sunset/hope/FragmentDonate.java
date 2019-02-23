package com.sunset.hope;

import android.Manifest;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
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
            builder.setTitle("Option");
            builder.setItems(R.array.listOption, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case 0: break;
                                case 1: break;
                                case 3: break;
                                case 2:
                                    Intent intent = new Intent(Intent. ACTION_DIAL, Uri.parse("tel:" + "0326633637"));
                                    startActivity(intent);
                                    break;
                                default:break;
                            }
                        }
                    });
            builder.setCancelable(true);
            builder.create();
            builder.show();
        });
        return myView;
    }
}
