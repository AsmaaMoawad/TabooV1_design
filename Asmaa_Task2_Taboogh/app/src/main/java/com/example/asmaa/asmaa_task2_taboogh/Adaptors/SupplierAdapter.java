package com.example.asmaa.asmaa_task2_taboogh.Adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asmaa.asmaa_task2_taboogh.Models.SupplierModel;
import com.example.asmaa.asmaa_task2_taboogh.R;

import java.util.List;

/**
 * Created by Asmaa on 25-Nov-17.
 */

public class SupplierAdapter extends RecyclerView.Adapter<SupplierAdapter.ViewHolder>{
    List<SupplierModel> supplierModelList;
    Context mContext;

    public SupplierAdapter(List<SupplierModel> supplierModelList, Context mContext) {
        this.supplierModelList = supplierModelList;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_supplier,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewSupplierName.setText(String.valueOf(supplierModelList.get(position).getName()));

    }

    @Override
    public int getItemCount() {
        return supplierModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewSupplierName;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewSupplierName = (TextView) itemView.findViewById(R.id.textViewSupplierName);

        }
    }
}
