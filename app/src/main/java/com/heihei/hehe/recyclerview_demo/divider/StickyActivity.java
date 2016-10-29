package com.heihei.hehe.recyclerview_demo.divider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.Gson;
import com.heihei.hehe.recyclerview_demo.R;
import com.heihei.hehe.recyclerview_demo.divider.widgt.StickyRecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StickyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky);
        StickyRecyclerView stickyRecyclerView = (StickyRecyclerView) findViewById(R.id.re);
        MyAdapter stickyAdapter = new MyAdapter();
        stickyRecyclerView.setAdapter(stickyAdapter);
        List<Area> areas = Arrays.asList(new Gson().fromJson(a, Area[].class));
        stickyAdapter.setDatas(areas);
    }

    private class MyAdapter extends StickyRecyclerView.StickyAdapter {

        List<Area> datas = new ArrayList<>();

        public void setDatas(List<Area> datas) {
            this.datas.clear();
            if (datas != null) {
                this.datas.addAll(datas);
            }
            notifyDataSetChanged();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new RecyclerView.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false)) {
            };
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            TextView textView = (TextView) holder.itemView.findViewById(android.R.id.text1);
            textView.setText(datas.get(position).area_name);
        }

        @Override
        public int getItemCount() {
            return datas.size();
        }

        @Override
        public String getItemViewTitle(int position) {
            return String.valueOf(datas.get(position).shuruma.charAt(0));
        }
    }

    private String a = "[{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330522\",\"area_name\":\"长兴\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000960098\",\"pingtaibh\":\"910500000000960097\",\"ZHUANGTAI\":null,\"shuruma\":\"ZXS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"330183\",\"area_name\":\"富阳\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"100000000000000001\",\"pingtaibh\":\"10001\",\"ZHUANGTAI\":null,\"shuruma\":\"FYS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"360201\",\"area_name\":\"景德镇\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040015\",\"pingtaibh\":\"10007\",\"ZHUANGTAI\":null,\"shuruma\":\"JDZ\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"331081\",\"area_name\":\"温岭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000008710874\",\"pingtaibh\":\"10006\",\"ZHUANGTAI\":null,\"shuruma\":\"WL\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"430321\",\"area_name\":\"湘潭\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"900500000006000665\",\"pingtaibh\":\"900500000005995269\",\"ZHUANGTAI\":null,\"shuruma\":\"XTS\",\"zhuangtai\":\"1\",\"IncreasingSort\":true},{\"area_code\":\"320582\",\"area_name\":\"张家港\",\"city_code\":null,\"city\":null,\"province\":\"100000\",\"medical_join_code\":null,\"XINGZHENGJB\":\"2\",\"quyubh\":\"910500000000040013\",\"pingtaibh\":\"10004\",\"ZHUANGTAI\":null,\"shuruma\":\"ZJG\",\"zhuangtai\":\"1\",\"IncreasingSort\":true}]";
}