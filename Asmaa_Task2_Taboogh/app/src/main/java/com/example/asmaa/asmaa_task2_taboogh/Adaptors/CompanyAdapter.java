package com.example.asmaa.asmaa_task2_taboogh.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asmaa.asmaa_task2_taboogh.Models.CompanyModel;
import com.example.asmaa.asmaa_task2_taboogh.R;

import java.util.List;

/**
 * Created by Asmaa on 25-Nov-17.
 */

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    List<CompanyModel>companyModelList;
    Context mContext;


    public CompanyAdapter(List<CompanyModel> companyModel, Context mContext) {
        this.companyModelList = companyModel;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_company,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewCompanyName.setText(String.valueOf(companyModelList.get(position).getName()));
        holder.imageViewCompanyLogo.setImageResource(companyModelList.get(position).getLogo());


    }

    @Override
    public int getItemCount() {
        return companyModelList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCompanyName;
        ImageView  imageViewCompanyLogo;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewCompanyName = (TextView) itemView.findViewById(R.id.textViewCompanyName);
            imageViewCompanyLogo=(ImageView)itemView.findViewById(R.id.imageViewCompanyLogo);

        }
    }
}
