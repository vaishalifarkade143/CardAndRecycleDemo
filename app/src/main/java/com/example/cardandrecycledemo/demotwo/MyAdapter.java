package com.example.cardandrecycledemo.demotwo;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardandrecycledemo.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>//provide MyViewHolder with the help of Parent class i.e MyAdapter
{
    int[] arr_img;
    String[] arr_names;

    //2...
    Context context;

    int lastPosition= -1;

    public MyAdapter(int[] arr_img, String[] arr_names) {
        //data sets se

        this.arr_img = arr_img;
        this.arr_names = arr_names;
    }


    @NonNull
    @Override
    //onCreateViewHolder ky kam karega ye Ek view create karne ke bad viewHolder(MyViewHolder) ko return karva dega jo humne Nested class banaya usme
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //3... for aNimation
        context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.single_item, parent, false);//parent bcz usko Parent class(MyViewHolder) ka viewGroup chahiye // false i.e attach to Root jaise hi hum srooll up down karnge vo items ko attach karvata jayega
        return new MyViewHolder(view);
    }

    /*
    *   @NonNull
    @Override
    //onCreateViewHolder ky kam karega ye Ek view create karne ke bad viewHolder(MyViewHolder) ko return karva dega jo humne Nested class banaya usme
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //1. single_view se single jo item hai usko get krva diya
        View view = layoutInflater.inflate(R.layout.single_item, parent, false);//parent bcz usko Parent class(MyViewHolder) ka viewGroup chahiye // false i.e attach to Root jaise hi hum srooll up down karnge vo items ko attach karvata jayega
        return new MyViewHolder(view);
    }*/

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //3. data set se ek ek karke data bind kar rahe kar rahe in [ class MyViewHolder  extends RecyclerView.ViewHolder]
        holder.img.setImageResource(arr_img[position]);//position is index position
        holder.names.setText(arr_names[position]);

        //5...call bcz yaha se data bind hota hai
        // rViewAnimation(holder.itemView);
        rViewAnimation(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return arr_img.length;//5.
    }

    //Nested class to hold the views
    class MyViewHolder extends RecyclerView.ViewHolder {
        //2.get id's
        private ImageView img;
        private TextView names;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img_two);
            names = (TextView) itemView.findViewById(R.id.name_two);

        }
    }

    // 1... for animation

    public void rViewAnimation(View view , int position)
    {
//        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);//4...loaad the predefind anim,ation file
//        view.startAnimation(animation);

        if (position > lastPosition)//0 > -1 true
        {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);//4...loaad the predefind anim,ation file
            view.startAnimation(animation);
            lastPosition = position;
        }
    }

}
