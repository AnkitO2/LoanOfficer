package com.example.loanofficerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.loanofficerapp.Response.GroupLoanApplicationReport;
import com.example.loanofficerapp.Response.MemberRegistrationList;

import java.util.List;

public class ApplicationReportAdapter extends RecyclerView.Adapter<ApplicationReportAdapter.ViewHolder> {

    private List<GroupLoanApplicationReport> groupLoanApplicationReports;
    Context context;
    public ApplicationReportAdapter(List<GroupLoanApplicationReport> groupLoanApplicationReports, Context context) {
        this.groupLoanApplicationReports = groupLoanApplicationReports;
        this.context = context;
    }
    public ApplicationReportAdapter(List<GroupLoanApplicationReport> groupLoanApplicationReports) {
        this.groupLoanApplicationReports = groupLoanApplicationReports;

    }
    @NonNull
    @Override
    public ApplicationReportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_list_adapter, parent, false);
//        MemberListAdapter.ViewHolder viewHolder = new MemberListAdapter.ViewHolder(view);
//        return  viewHolder;

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }


    public void onBindViewHolder(@NonNull MemberListAdapter.ViewHolder holder, int position) {
        GroupLoanApplicationReport groupLoanApplicationReport= groupLoanApplicationReports.get(position);
        holder.data1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Intent intent = new Intent(context,PlanDetail.class);
//                intent.putExtra("AccountId",memberRegistrationList.getAge());
//                context.startActivity(intent);
            }
        });

//        holder.data1.setText(""+memberRegistration.getAge());
//        holder.data2.setText(""+memberRegistration.getBranchName());
//        holder.data3.setText(""+memberRegistration.getDob());
//        holder.data4.setText(""+memberRegistration.getGender());
//        holder.data5.setText(""+memberRegistration.getGroupOfficerName());
//        holder.data6.setText(""+memberRegistration.getGuardianName());
//        holder.data7.setText(""+memberRegistration.getMemberFormNo());
//        holder.data8.setText(""+memberRegistration.getMemberId());
//        holder.data9.setText(""+memberRegistration.getMemberJoinDate());
//        holder.data10.setText(""+memberRegistration.getMemberProfileStatus());
//        holder.data11.setText(""+memberRegistration.getMobileNo());
    }
    @Override
    public int getItemCount() {return groupLoanApplicationReports.size();}
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView data1 ,data2,data3 ,data4 ,data5,data6,data7,data8 ,data9 ,data10 ,data11;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //textView = itemView.findViewById(R.id.text_view);
//            data1 = itemView.findViewById(R.id.Age);
//            data2 = itemView.findViewById(R.id.BranchName);
//            data3 = itemView.findViewById(R.id.DOB);
//            data4 = itemView.findViewById(R.id.Gender);
//            data5 = itemView.findViewById(R.id.GroupOfficerName);
//            data6 = itemView.findViewById(R.id.GuardianName);
//            data7 = itemView.findViewById(R.id.MemberFormNo);
//            data8 =itemView.findViewById(R.id.MemberId);
//            data9 = itemView.findViewById(R.id.MemberJoinDate);
//            data10 =itemView.findViewById(R.id.MemberProfileStatus);
//            data11 =itemView.findViewById(R.id.MobileNo);
        }
    }
}