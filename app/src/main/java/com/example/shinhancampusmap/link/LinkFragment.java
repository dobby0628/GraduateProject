package com.example.shinhancampusmap.link;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.shinhancampusmap.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LinkFragment extends Fragment {

    ListView mListView;
    String[] linkname = {"종합정보시스템", "사이버캠퍼스", "중앙도서관", "취창업지원처", "인터넷증명발급",
            "학생상담센터", "장애학생지원센터", "Office365 이용안내","평생교육원[제1,2캠퍼스]","국제교류처",
            "경기도북부여성비전센터","성희롱·성폭력상담실","교수학습센터"};
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_link, container, false);
        mListView = v.findViewById(R.id.link_main_list);

        ArrayAdapter MyAdapter = new MyAdapter(getContext(), linkname);
        mListView.setAdapter(MyAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent mIntent = new Intent(Intent.ACTION_VIEW);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position ==  0) {
                    Uri u = Uri.parse("http://stins.shinhan.ac.kr/irj/portal");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  1) {
                    Uri u = Uri.parse("http://cyber.shinhan.ac.kr/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  2) {
                    Uri u = Uri.parse("http://lib.shinhan.ac.kr/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  3) {
                    Uri u = Uri.parse("https://job.shinhan.ac.kr/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  4) {
                    Uri u = Uri.parse("http://stins.shinhan.ac.kr/irj/portal");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  5) {
                    Uri u = Uri.parse("http://sh.certpia.com/default.asp");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  6) {
                    Uri u = Uri.parse("https://counsel.shinhan.ac.kr/counsel/index.do");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  7) {
                    Uri u = Uri.parse("https://support.shinhan.ac.kr/support/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  8) {
                    Uri u = Uri.parse("https://www.shinhan.ac.kr/kr/193/subview.do");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  9) {
                    Uri u = Uri.parse("https://life.shinhan.ac.kr/main/index.jsp");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  10) {
                    Uri u = Uri.parse("https://new.shinhan.ac.kr/globle/index.do");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  11) {
                    Uri u = Uri.parse("http://cafe.daum.net/ivisioncenter");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  12) {
                    Uri u = Uri.parse("https://helper.shinhan.ac.kr/sung/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }
                if (position ==  13) {
                    Uri u = Uri.parse("https://ctl.shinhan.ac.kr/");
                    mIntent.setData(u);
                    startActivity(mIntent);
                }

            }
        });

        FloatingActionButton editBtn = v.findViewById(R.id.link_editBtn);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        return v;
    }
}