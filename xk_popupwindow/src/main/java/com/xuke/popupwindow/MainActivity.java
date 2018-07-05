package com.xuke.popupwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.xuke.popupwindow.entity.XEntity;
import com.xuke.popupwindow.adapter.XAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * <p>
 * ┌───┐   ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┐
 * <p>
 * │Esc│   │ F1│ F2│ F3│ F4│ │ F5│ F6│ F7│ F8│ │ F9│F10│F11│F12│ │P/S│S L│P/B│  ┌┐    ┌┐    ┌┐
 * <p>
 * └───┘   └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┘  └┘    └┘    └┘
 * <p>
 * ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───────┐ ┌───┬───┬───┐ ┌───┬───┬───┬───┐
 * <p>
 * │~ `│! 1│@ 2│# 3│$ 4│% 5│^ 6│& 7│* 8│( 9│) 0│_ -│+ =│ BacSp │ │Ins│Hom│PUp│ │N L│ / │ * │ - │
 * <p>
 * ├───┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─────┤ ├───┼───┼───┤ ├───┼───┼───┼───┤
 * <p>
 * │ Tab │ Q │ W │ E │ R │ T │ Y │ U │ I │ O │ P │{ [│} ]│ | \ │ │Del│End│PDn│ │ 7 │ 8 │ 9 │   │
 * <p>
 * ├─────┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴─────┤ └───┴───┴───┘ ├───┼───┼───┤ + │
 * <p>
 * │ Caps │ A │ S │ D │ F │ G │ H │ J │ K │ L │: ;│" '│ Enter  │               │ 4 │ 5 │ 6 │   │
 * <p>
 * ├──────┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴────────┤     ┌───┐     ├───┼───┼───┼───┤
 * <p>
 * │ Shift  │ Z │ X │ C │ V │ B │ N │ M │< ,│> .│? /│  Shift   │     │ ↑ │     │ 1 │ 2 │ 3 │   │
 * <p>
 * ├─────┬──┴─┬─┴──┬┴───┴───┴───┴───┴───┴──┬┴───┼───┴┬────┬────┤ ┌───┼───┼───┐ ├───┴───┼───┤ E││
 * <p>
 * │ Ctrl│    │Alt │         Space         │ Alt│    │    │Ctrl│ │ ← │ ↓ │ → │ │   0   │ . │←─┘│
 * <p>
 * └─────┴────┴────┴───────────────────────┴────┴────┴────┴────┘ └───┴───┴───┘ └───────┴───┴───┘
 * <p>
 * </p>
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private PopupWindow popupReasonWindow;
    private List<XEntity> mDatas = new ArrayList<>();
    private int checkedPosition;
    private XAdapter xAdapter;
    private WindowManager.LayoutParams params;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        params = this.getWindow().getAttributes();

        TextView viewById = (TextView) findViewById(R.id.tv_button);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPop2();
            }
        });

        getData();
    }

    private void getData() {
        for (int i = 0; i < 3; i++) {
            XEntity xEntity = new XEntity();
            xEntity.setFullName("许可-19960524-1767178700" + i);
            mDatas.add(xEntity);
        }
    }

    /**
     * 弹出pop
     */
    private void showPop() {
        View infoView = LayoutInflater.from(this).inflate(R.layout.select_auth_info, null);
        ListView lvInfo = (ListView) infoView.findViewById(R.id.lv_info);
        Button btnCancle = (Button) infoView.findViewById(R.id.btn_cancle);
        Button btnCommint = (Button) infoView.findViewById(R.id.btn_commint);

        popupReasonWindow = new PopupWindow(infoView, LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        popupReasonWindow.setFocusable(true);
        popupReasonWindow.setOutsideTouchable(false);
        popupReasonWindow.update();
        popupReasonWindow.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        popupReasonWindow.showAtLocation(this.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
        setWindowParams(0.7f);


        xAdapter = new XAdapter(this, mDatas);
        lvInfo.setAdapter(xAdapter);
        lvInfo.setOnItemClickListener(this);

        btnCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCommint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        popupReasonWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setWindowParams(1.0f);
            }
        });
    }

    private void showPop2(){
        View infoView = LayoutInflater.from(this).inflate(R.layout.pop_invite_auth, null);
        EditText etInviteCode = (EditText) infoView.findViewById(R.id.et_invite_code);
        TextView tvSubmit = (TextView) infoView.findViewById(R.id.tv_submit);

        popupWindow = new PopupWindow(infoView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(false);
        popupWindow.update();
        popupWindow.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        popupWindow.showAtLocation(this.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
        setWindowParams(0.7f);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                setWindowParams(1.0f);
            }
        });
        tvSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
                setWindowParams(1.0f);
            }
        });
    }






    /**
     * 设置屏幕的背景度
     */
    private void setWindowParams(float value) {
        params.alpha = value;
        this.getWindow().setAttributes(params);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        if (checkedPosition != -1) {
            mDatas.get(checkedPosition).setChecked(false);
        }
        checkedPosition = position;
        mDatas.get(checkedPosition).setChecked(true);
        xAdapter.notifyDataSetChanged();
    }
}
