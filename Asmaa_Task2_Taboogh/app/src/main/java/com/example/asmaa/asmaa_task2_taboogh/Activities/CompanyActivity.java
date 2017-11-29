package com.example.asmaa.asmaa_task2_taboogh.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.asmaa.asmaa_task2_taboogh.Adaptors.CompanyAdapter;
import com.example.asmaa.asmaa_task2_taboogh.Models.CompanyModel;
import com.example.asmaa.asmaa_task2_taboogh.R;

import java.util.List;

public class CompanyActivity extends AppCompatActivity {
    RecyclerView recyclerViewcompany;
    CompanyAdapter companyAdapter;
    List<CompanyModel>companyModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        companyModelList.get(0).setName("PierCodes");
        companyModelList.get(1).setName("Amazon");
        companyModelList.get(2).setName("SellerPier");
        companyModelList.get(3).setName("Piergate");
        companyModelList.get(4).setName("Amazon");
        companyModelList.get(0).setLogo(R.drawable.testlogo1);
        companyModelList.get(1).setLogo(R.drawable.testlogo2);
        companyModelList.get(2).setLogo(R.drawable.testlogo3);
        companyModelList.get(3).setLogo(R.drawable.testlogo4);
        companyModelList.get(3).setLogo(R.drawable.testlogo5);



        recyclerViewcompany=(RecyclerView)findViewById(R.id.recyclerviewCompany);
        recyclerViewcompany.setHasFixedSize(false);
        recyclerViewcompany.setLayoutManager(new LinearLayoutManager(this));
        companyAdapter=new CompanyAdapter(companyModelList,this);
        recyclerViewcompany.setAdapter(companyAdapter);










    }
}
