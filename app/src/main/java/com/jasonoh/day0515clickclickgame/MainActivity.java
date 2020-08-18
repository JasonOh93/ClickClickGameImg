/*
package com.jasonoh.day0515clickclickgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv_start;
    ImageView[] ivs = new ImageView[12];
    LinearLayout ll;

    int count = 0, stage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조 변수에 해당하는 값 아이디 찾아오기
        tv = findViewById(R.id.tv);
        iv_start = findViewById(R.id.iv_start);
        ll = findViewById(R.id.ll);

        for(int i = 0; i < ivs.length; i++) {
            ivs[i] = findViewById(R.id.iv01 + i);
        } // for 문

        //start를 누르면 실행
        iv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_start.setImageResource(R.drawable.ing);
                initial();
                iv_start.setClickable(false);

                if(stage > 3) {
                }
            }// 익명클래스 내부 클래스
        });

        //만약 첫번째 스테이지가 끝나면 두번째 셋팅하기 위한 준비





    }// onCreate Method...

    //버튼 객체 생성
    public void ivClick(View v) {
        ImageView ivtemp = (ImageView)v;

        if( (Integer.parseInt( ivtemp.getTag().toString() ) == count) ) {
            ivtemp.setVisibility(View.INVISIBLE);
            count++;
        } //if문

        if(count > 11) {
            stage++;
            count = 0;
            initial();
        }

    }//ivClick method

    //초기 설정 값 설정
    void initial() {

        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<ImageView> arrayList = new ArrayList<>();

        int arr = 0;

        for(int i = 0; i < ivs.length; i++) {
            arrayList.add( i );
        }//for arrayList

        Collections.shuffle( arrayList );

        for(int i = 0; i < ivs.length; i++) {
            if( (stage > 0) && (stage < 4) ) {
                if(stage == 1) ivs[i].setImageResource( R.drawable.num01 + arrayList.get(i) );
                else if(stage == 2) {
                    ivs[i].setImageResource( R.drawable.alpa01 + arrayList.get(i) );
//                    ll.setBackgroundResource(R.drawable.bg2);
//                    tv.setText("알파벳을 순서대로 누르세요");
                }// inner else if (stage == 2)
                else if(stage == 3) {
                    ivs[i].setImageResource( R.drawable.cha01 + arrayList.get(i) );
//                    ll.setBackgroundResource(R.drawable.bg3);
//                    tv.setText("십이지신 순서대로 누르세요");
                }//inner else if (stage == 3)

                ivs[i].setVisibility(View.VISIBLE);
                ivs[i].setTag( arrayList.get(i) );
            }//if
            else {
                ivs[i].setVisibility(View.INVISIBLE);
                //tv.setVisibility(View.INVISIBLE);
//                ll.setBackgroundResource(R.drawable.bg4);
//
//                stage = 1;
//                iv_start.setImageResource(R.drawable.start);
//                iv_start.setClickable(true);
//                tv.setText("Congratulations!! Stage All Clear!!  If You Want Retry, Click to Start");
            }//else
        }//for ivs[]

        //for문 안에서 tv나 ll이 계속 반복해서 이미지를 넣어 주는 것이 별로 좋지 않음 그래서 여기서 한번만 넣어주기
        if(stage == 2) {
            ll.setBackgroundResource(R.drawable.bg2);
            tv.setText("알파벳을 순서대로 누르세요");
        } // stage == 2 인 if문
        else if(stage == 3) {
            ll.setBackgroundResource(R.drawable.bg3);
            tv.setText("십이지신 순서대로 누르세요");
        } // stage == 3 인 else if문
        else if(stage > 3) {
            ll.setBackgroundResource(R.drawable.bg4);

            stage = 1;
            iv_start.setImageResource(R.drawable.start);
            iv_start.setClickable(true);
            tv.setText("Congratulations!! Stage All Clear!!  If You Want Retry, Click to Start");
        } //stage > 3 else if문 , 즉 게임이 끝난 것

    }//initial method...

}// MainActivity class...
 */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------

package com.jasonoh.day0515clickclickgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ImageView iv_start;
    ImageView[] ivs = new ImageView[12];
    LinearLayout ll;

    int count = 0, stage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조 변수에 해당하는 값 아이디 찾아오기
        tv = findViewById(R.id.tv);
        iv_start = findViewById(R.id.iv_start);
        ll = findViewById(R.id.ll);

        for(int i = 0; i < ivs.length; i++) {
            ivs[i] = findViewById(R.id.iv01 + i);
        } // for 문

        //start를 누르면 실행
        iv_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_start.setImageResource(R.drawable.ing);
                ll.setBackgroundResource(R.drawable.bg1);
                initial();
                iv_start.setClickable(false);

            }// 익명클래스 내부 클래스
        }); // iv_start의 setOnClickListener Anonymous class
    }// onCreate Method...

    //버튼 객체 생성
    public void ivClick(View v) {
        ImageView ivtemp = (ImageView)v;

        if( (Integer.parseInt( ivtemp.getTag().toString() ) == count) ) {
            ivtemp.setVisibility(View.INVISIBLE);
            count++;
        } //if문

        if(count > 11) {
            stage++;
            count = 0;
            initial();
        } //if

    }//ivClick method

    //초기 설정 값 설정
    void initial() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < ivs.length; i++) {
            arrayList.add( i );
        }//for arrayList

        Collections.shuffle( arrayList );

        for(int i = 0; i < ivs.length; i++) {
            if( (stage > 0) && (stage < 4) ) {
                if(stage == 1) ivs[i].setImageResource( R.drawable.num01 + arrayList.get(i) );
                else if(stage == 2) ivs[i].setImageResource( R.drawable.alpa01 + arrayList.get(i) );
                else if(stage == 3) ivs[i].setImageResource( R.drawable.cha01 + arrayList.get(i) );

                ivs[i].setVisibility(View.VISIBLE);
                ivs[i].setTag( arrayList.get(i) );
            }//if
            else ivs[i].setVisibility(View.INVISIBLE);
        }//for ivs[]

        //for문 안에서 tv나 ll이 계속 반복해서 이미지를 넣어 주는 것이 별로 좋지 않음 그래서 여기서 한번만 넣어주기
        if(stage == 2) {
            ll.setBackgroundResource(R.drawable.bg2);
            tv.setText("알파벳을 순서대로 누르세요");
        } // stage == 2 인 if문
        else if(stage == 3) {
            ll.setBackgroundResource(R.drawable.bg3);
            tv.setText("십이지신 순서대로 누르세요");
        } // stage == 3 인 else if문
        else if(stage > 3) {
            ll.setBackgroundResource(R.drawable.bg4);

            stage = 1;
            iv_start.setImageResource(R.drawable.start);
            iv_start.setClickable(true);
            tv.setText("Congratulations!! Stage All Clear!!  If You Want Retry, Click to Start");
        } //stage > 3 else if문 , 즉 게임이 끝난 것
    }//initial method...
}// MainActivity class...
