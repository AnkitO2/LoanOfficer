package com.example.loanofficerapp;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loanofficerapp.Response.MemberRegistrationList;

import java.util.List;

public class MemberListAdapter extends RecyclerView.Adapter<MemberListAdapter.ViewHolder> {


    private List<MemberRegistrationList>memberRegistrationList;
    Context context;

    public MemberListAdapter(List<MemberRegistrationList> memberRegistrationList, Context context) {
        this.memberRegistrationList = memberRegistrationList;
        this.context = context;
    }
    public MemberListAdapter(List<MemberRegistrationList> memberRegistrationList) {
        this.memberRegistrationList = memberRegistrationList;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.member_list_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MemberRegistrationList memberRegistration= memberRegistrationList.get(position);
        holder.data1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Intent intent = new Intent(context,PlanDetail.class);
//                intent.putExtra("AccountId",memberRegistrationList.getAge());
//                context.startActivity(intent);
            }
        });

        holder.data1.setText(""+memberRegistration.getAge());
        holder.data2.setText(""+memberRegistration.getBranchName());
        holder.data3.setText(""+memberRegistration.getDob());
         holder.data4.setText(""+memberRegistration.getGender());
        holder.data5.setText(""+memberRegistration.getGroupOfficerName());
        holder.data6.setText(""+memberRegistration.getGuardianName());
        holder.data7.setText(""+memberRegistration.getMemberFormNo());
        holder.data8.setText(""+memberRegistration.getMemberId());
        holder.data9.setText(""+memberRegistration.getMemberJoinDate());
        holder.data10.setText(""+memberRegistration.getMemberProfileStatus());
        holder.data11.setText(""+memberRegistration.getMobileNo());
    }
    @Override
    public int getItemCount() {return memberRegistrationList.size();}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView data1 ,data2,data3 ,data4 ,data5,data6,data7,data8 ,data9 ,data10 ,data11;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //textView = itemView.findViewById(R.id.text_view);
            data1 = itemView.findViewById(R.id.Age);
            data2 = itemView.findViewById(R.id.BranchName);
            data3 = itemView.findViewById(R.id.DOB);
            data4 = itemView.findViewById(R.id.Gender);
            data5 = itemView.findViewById(R.id.GroupOfficerName);
            data6 = itemView.findViewById(R.id.GuardianName);
            data7 = itemView.findViewById(R.id.MemberFormNo);
            data8 =itemView.findViewById(R.id.MemberId);
            data9 = itemView.findViewById(R.id.MemberJoinDate);
            data10 =itemView.findViewById(R.id.MemberProfileStatus);
            data11 =itemView.findViewById(R.id.MobileNo);
        }
    }

}
