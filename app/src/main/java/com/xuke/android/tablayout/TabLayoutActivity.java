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
        idtablone.addTab(idtablone.newTab().setText("标题"));
        idtablone.addTab(idtablone.newTab().setText("标题文字"));
        idtablone.addTab(idtablone.newTab().setText("标题党"));
        idtablone.addTab(idtablone.newTab().setText("题"));
        idtablone.addTab(idtablone.newTab().setText("标题1"));
        idtablone.addTab(idtablone.newTab().setText("标题2"));
        idtablone.addTab(idtablone.newTab().setText("标题3"));
        idtablone.addTab(idtablone.newTab().setText("标题4"));
        idtablone.addTab(idtablone.newTab().setText("标题5"));
        idtablone.addTab(idtablone.newTab().setText("标题6"));


        TabLayout idtabltwo = (TabLayout) findViewById(R.id.id_tab2_center_fixed);

        idtabltwo.addTab(idtabltwo.newTab().setText("标题"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题文字"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题党"));
        idtabltwo.addTab(idtabltwo.newTab().setText("题"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题1"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题2"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题3"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题4"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题5"));
        idtabltwo.addTab(idtabltwo.newTab().setText("标题6"));

        TabLayout idtablthree = (TabLayout) findViewById(R.id.id_tab3_fill_scrollable);

        idtablthree.addTab(idtablthree.newTab().setText("标题"));
        idtablthree.addTab(idtablthree.newTab().setText("标题文字"));
        idtablthree.addTab(idtablthree.newTab().setText("标题党"));
        idtablthree.addTab(idtablthree.newTab().setText("题"));
        idtablthree.addTab(idtablthree.newTab().setText("标题1"));
        idtablthree.addTab(idtablthree.newTab().setText("标题2"));
        idtablthree.addTab(idtablthree.newTab().setText("标题3"));
        idtablthree.addTab(idtablthree.newTab().setText("标题4"));
        idtablthree.addTab(idtablthree.newTab().setText("标题5"));
        idtablthree.addTab(idtablthree.newTab().setText("标题6"));

        TabLayout idtablfour = (TabLayout) findViewById(R.id.id_tab4_center_scrollable);

        idtablfour.addTab(idtablfour.newTab().setText("标题"));
        idtablfour.addTab(idtablfour.newTab().setText("标题文字"));
        idtablfour.addTab(idtablfour.newTab().setText("标题党"));
        idtablfour.addTab(idtablfour.newTab().setText("题"));
        idtablfour.addTab(idtablfour.newTab().setText("标题1"));
        idtablfour.addTab(idtablfour.newTab().setText("标题2"));
        idtablfour.addTab(idtablfour.newTab().setText("标题3"));
        idtablfour.addTab(idtablfour.newTab().setText("标题4"));
        idtablfour.addTab(idtablfour.newTab().setText("标题5"));
        idtablfour.addTab(idtablfour.newTab().setText("标题6"));

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
