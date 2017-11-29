package com.example.asmaa.asmaa_task2_taboogh.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asmaa.asmaa_task2_taboogh.Adaptors.SupplierAdapter;
import com.example.asmaa.asmaa_task2_taboogh.Models.SupplierModel;
import com.example.asmaa.asmaa_task2_taboogh.R;

import java.util.List;

public class SupplierActivity extends AppCompatActivity {
   RecyclerView RecyclerViewSupplier;
    SupplierAdapter supplierAdapter;
    List<SupplierModel> supplierModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        supplierModelList.get(0).setName("روجي راجان");
        supplierModelList.get(1).setName("اسماء");
        supplierModelList.get(2).setName("ايناس");
        RecyclerViewSupplier=(RecyclerView)findViewById(R.id.recyclerviewSupplier);
        RecyclerViewSupplier.setHasFixedSize(false);
        RecyclerViewSupplier.setLayoutManager(new LinearLayoutManager(this));
        supplierAdapter=new SupplierAdapter(supplierModelList,this);
        RecyclerViewSupplier.setAdapter(supplierAdapter);


    }
}
