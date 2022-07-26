package com.example.test10.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test10.Model.DataModel;
import com.example.test10.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData>{
    private Context ctx;
    private List<DataModel> listHotel;

    public AdapterData(Context ctx, List<DataModel> listHotel) {
        this.ctx = ctx;
        this.listHotel = listHotel;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from( parent.getContext() ).inflate( R.layout.card_item, parent, false );
        HolderData holder = new HolderData( layout );
        return holder;
    }

    //https://www.youtube.com/watch?v=jAZP8ABMeEE
    //57.30
    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HolderData extends RecyclerView.ViewHolder {
        TextView tvId ,tvUsername, tvPassword;

        public HolderData(@NonNull View itemView) {
            super( itemView );

            tvId = itemView.findViewById( R.id.tv_id );
            tvUsername = itemView.findViewById( R.id.tv_username );
            tvPassword = itemView.findViewById( R.id.tv_password );
        }
    }
}
