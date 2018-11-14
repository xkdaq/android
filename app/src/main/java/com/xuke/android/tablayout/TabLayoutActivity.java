package com.xuke.android.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import com.xuke.android.R;

/**
 * Created by kekex on 2018/11/14.
 * tab
 */

public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tablayout);


        ////////////////
        TabLayout idtablone = (TabLayout) findViewById(R.id.id_tab1_fill_fixed);
        idtablone.addTab(idtablone.newTab().setText("新闻"));
        idtablone.addTab(idtablone.newTab().setText("热门"));
        idtablone.addTab(idtablone.newTab().setText("日报"));
        idtablone.addTab(idtablone.newTab().setText("网易"));
        idtablone.addTab(idtablone.newTab().setText("腾讯"));
        idtablone.addTab(idtablone.newTab().setText("百度"));
        idtablone.addTab(idtablone.newTab().setText("新浪"));
        idtablone.addTab(idtablone.newTab().setText("阿里"));



        TabLayout idtabltwo = (TabLayout) findViewById(R.id.id_tab2_center_fixed);

        idtabltwo.addTab(idtabltwo.newTab().setText("新闻"));
        idtabltwo.addTab(idtabltwo.newTab().setText("热门"));
        idtabltwo.addTab(idtabltwo.newTab().setText("日报"));
        idtabltwo.addTab(idtabltwo.newTab().setText("网易"));
        idtabltwo.addTab(idtabltwo.newTab().setText("腾讯"));
        idtabltwo.addTab(idtabltwo.newTab().setText("百度"));
        idtabltwo.addTab(idtabltwo.newTab().setText("新浪"));
        idtabltwo.addTab(idtabltwo.newTab().setText("阿里"));

        TabLayout idtablthree = (TabLayout) findViewById(R.id.id_tab3_fill_scrollable);

        idtablthree.addTab(idtablthree.newTab().setText("新闻"));
        idtablthree.addTab(idtablthree.newTab().setText("热门"));
        idtablthree.addTab(idtablthree.newTab().setText("日报"));
        idtablthree.addTab(idtablthree.newTab().setText("网易"));
        idtablthree.addTab(idtablthree.newTab().setText("腾讯"));
        idtablthree.addTab(idtablthree.newTab().setText("百度"));
        idtablthree.addTab(idtablthree.newTab().setText("新浪"));
        idtablthree.addTab(idtablthree.newTab().setText("阿里"));


        TabLayout idtablfour = (TabLayout) findViewById(R.id.id_tab4_center_scrollable);

        idtablfour.addTab(idtablfour.newTab().setText("新闻"));
        idtablfour.addTab(idtablfour.newTab().setText("热门"));
        idtablfour.addTab(idtablfour.newTab().setText("日报"));
        idtablfour.addTab(idtablfour.newTab().setText("网易"));
        idtablfour.addTab(idtablfour.newTab().setText("腾讯"));
        idtablfour.addTab(idtablfour.newTab().setText("百度"));
        idtablfour.addTab(idtablfour.newTab().setText("新浪"));
        idtablfour.addTab(idtablfour.newTab().setText("阿里"));


        ////////////////////////////////////////////////////////////////////////

        TabLayout id_tabl_one_s = (TabLayout) findViewById(R.id.id_tab_one_fill_fixed);
        id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("新闻"));
        id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("热门"));
        id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("日报"));
        //id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("标4"));
        //id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("标5"));
        //id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("标6"));
        //id_tabl_one_s.addTab(id_tabl_one_s.newTab().setText("标7"));


        TabLayout id_tabl_two_s = (TabLayout) findViewById(R.id.id_tab_two_center_fixed);
        id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("新闻"));
        id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("热门"));
        id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("日报"));
        //id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("标4"));
        //id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("标5"));
        //id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("标5"));
        //id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("标6"));
        //id_tabl_two_s.addTab(id_tabl_two_s.newTab().setText("标7"));


        TabLayout id_tabl_three_s = (TabLayout) findViewById(R.id.id_tab_three_fill_scrollable);
        id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("新闻"));
        id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("热门"));
        id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("日报"));
        //id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("标4"));
        //id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("标5"));
        //id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("标6"));
        //id_tabl_three_s.addTab(id_tabl_three_s.newTab().setText("标7"));


        TabLayout id_tabl_four_s = (TabLayout) findViewById(R.id.id_tab_four_center_scrollable);
        id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("新闻"));
        id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("热门"));
        id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("日报"));
        //id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("标4"));
        //id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("标5"));
        //id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("标6"));
        //id_tabl_four_s.addTab(id_tabl_four_s.newTab().setText("标7"));


    }

}
