package com.example.anantawasthy.fragmentpractice.adapter;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.anantawasthy.fragmentpractice.R;

import java.util.List;

import jp.wasabeef.recyclerview.animators.holder.AnimateViewHolder;

/**
 * Created by anantawasthy on 4/26/17.
 */

public class CustomAdpater extends RecyclerView.Adapter<CustomAdpater.CustomViewHolder>{

    private Context mContext;
    private List<Model> models;
    private int lastPosition = -1;
    public CustomAdpater(Context mContext, List<Model> models){
        this.mContext = mContext;
        this.models = models;
    }

    @Override
    public CustomAdpater.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list_items,parent,false);

        return new CustomViewHolder(view);
    }


    public void addItemtoTheList(Model model){
        models.add(0,model);
        notifyItemInserted(0);
    }
    @Override
    public void onBindViewHolder(CustomAdpater.CustomViewHolder holder, int position) {
        Model model = models.get(position);
        holder.tv_msg.setText(model.getMsg());


    }

    @Override
    public int getItemCount() {
        return models.size();
    }



    public class CustomViewHolder extends RecyclerView.ViewHolder implements AnimateViewHolder{

        private TextView tv_msg;
        public CustomViewHolder(View itemView) {
            super(itemView);
            tv_msg= (TextView)itemView.findViewById(R.id.tv_msg);
        }

        @Override
        public void preAnimateRemoveImpl(RecyclerView.ViewHolder holder) {

        }

        @Override
        public void animateRemoveImpl(RecyclerView.ViewHolder holder, ViewPropertyAnimatorListener listener) {
            ViewCompat.animate(itemView)
                    .translationY(-itemView.getHeight() * 0.3f)
                    .alpha(0)
                    .setDuration(300)
                    .setListener(listener)
                    .start();
        }

        @Override
        public void preAnimateAddImpl(RecyclerView.ViewHolder holder) {
            ViewCompat.setTranslationY(itemView, -itemView.getHeight() * 0.3f);
            ViewCompat.setAlpha(itemView, 0);
        }

        @Override
        public void animateAddImpl(RecyclerView.ViewHolder holder, ViewPropertyAnimatorListener listener) {
            ViewCompat.animate(itemView)
                    .translationY(0)
                    .alpha(1)
                    .setDuration(300)
                    .setListener(listener)
                    .start();
        }
    }

}
