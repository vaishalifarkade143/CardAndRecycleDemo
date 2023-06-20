package com.example.cardandrecycledemo.demotwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.cardandrecycledemo.R;

public class MainActivityTwo extends AppCompatActivity
{
    //ye jo data set hai usko lekr jayenge MyAdapter me but kaise
    String[] names = {"meera" , "shree" , "mithila" , "vihaan", "meera" , "shree" , "mithila" , "vihaan","meera" , "shree" , "mithila" , "vihaan","meera" , "shree" , "mithila" , "vihaan"};
    int[] img = {R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan, R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan,R.drawable.meera,R.drawable.vihaan};
    RecyclerView recycle_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        recycle_view = (RecyclerView) findViewById(R.id.recycle_view);

        //aise data lekar jayenge MyAdapter ke constructor me data set Karenge
        MyAdapter myAdapter = new MyAdapter(img,names);  //ye data MyAdapter  ke instance me set ho gaye using constructor

        //4. use of LinearLayout for verticle
       recycle_view.setLayoutManager(new LinearLayoutManager(this));
        recycle_view.setAdapter(myAdapter);

        // OR

         /* LinearLayoutManager lm = new LinearLayoutManager(this);
//        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recycle_view.setLayoutManager(lm);
//        recycle_view.setAdapter(myAdapter); */

        //OR for horizontal

        /* LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        recycle_view.setLayoutManager(lm);
        recycle_view.setAdapter(myAdapter); */

        //GridLayout for verticle
        /* GridLayoutManager gm = new GridLayoutManager(this,2);
        recycle_view.setLayoutManager(gm);
        recycle_view.setAdapter(myAdapter); */


        //GridLayout for horizontal
        /* GridLayoutManager gm = new GridLayoutManager(this,2);
        gm.setOrientation(GridLayoutManager.HORIZONTAL);
        recycle_view.setLayoutManager(gm);
        recycle_view.setAdapter(myAdapter); */

//       /* StaggeredGridLayoutManager sm= new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
//        recycle_view.setLayoutManager(sm);
//        recycle_view.setAdapter(myAdapter); */



    }

}